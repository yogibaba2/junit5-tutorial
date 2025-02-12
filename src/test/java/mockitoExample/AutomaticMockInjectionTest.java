package mockitoExample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AutomaticMockInjectionTest {

    @Mock
    CalculatorService mockService;
    AutoCloseable closeable;

    @InjectMocks
    Calculator calculator;

    @BeforeEach
    void setup() {
        // Initialize annotated mocks
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void teardown() throws Exception {
        closeable.close();
    }

    @Test
    void testAnnotationBasedInitialization() {
        // Stub the behavior of the mock
        when(mockService.add(10, 20)).thenReturn(30);

        // Verify the result using the real method
        int result = calculator.calculateSum(10, 20);
        assertEquals(30, result);
    }

    static class Calculator {
        private final CalculatorService service;

        Calculator(CalculatorService service) {
            this.service = service;
        }

        int calculateSum(int a, int b) {
            return service.add(a, b);
        }
    }

    interface CalculatorService {
        int add(int a, int b);
    }
}

