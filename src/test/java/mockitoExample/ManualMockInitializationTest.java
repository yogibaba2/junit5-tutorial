package mockitoExample;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ManualMockInitializationTest {

    @Test
    void testManualMockInitialization() {
        // Create a mock object
        CalculatorService mockService = Mockito.mock(CalculatorService.class);

        // Define behavior for the mock
        when(mockService.add(5, 10)).thenReturn(15);

        // Call the method under test and verify
        int result = mockService.add(5, 10);
        assertEquals(15, result);
    }

    // A simple service interface for demonstration
    interface CalculatorService {
        int add(int a, int b);
    }
}

