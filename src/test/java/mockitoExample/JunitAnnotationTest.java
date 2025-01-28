package mockitoExample;

import org.junit.jupiter.api.*;

public class JunitAnnotationTest {

    @BeforeEach
    void setup() {
        System.out.println("Before each tests.");
    }

    @BeforeAll
    static void globalSetup() {
        System.out.println("Setup before all tests.");
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleanup after each test.");
    }

    @AfterAll
    static void globalCleanup() {
        System.out.println("Cleanup after all tests.");
    }

    @Test
    void testMethod1() {
        System.out.println("Test 1 executed.");
    }

    @Test
    void testMethod2() {
        System.out.println("Test 2 executed.");
    }
}
