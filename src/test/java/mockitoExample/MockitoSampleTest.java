package mockitoExample;

import com.yogibaba.sample_services.order_services.Employee;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockitoSampleTest {

    @Test
    void testService() {
        Employee employee = mock(Employee.class);

        LocalDateTime time  = LocalDateTime.now();

        when(employee.getJoiningDate()).thenReturn(time);
        assertEquals(time, employee.getJoiningDate());
        verify(employee).getJoiningDate();
    }

}
