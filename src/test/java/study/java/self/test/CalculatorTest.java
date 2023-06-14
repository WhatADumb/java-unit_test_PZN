package study.java.self.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import study.java.self.test.generator.SimpleDisplayNameGenerator;

// @DisplayName("Test Class Calculator Test")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {
    @BeforeAll
    public static void BeforeAll() {
        System.out.println("Indexing All Method Test");
    }

    @BeforeEach
    public void BeforeEach() {
        System.out.println("Begining test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Ended test");
    }

    @AfterAll
    public static void AfterAll() {
        System.out.println("Finished Index Test");
    }

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSucc(){
        int data = calculator.add(10, 10);
        assertEquals(20, data);
    }

    @Test
    public void testDivideSucc(){
        int data = calculator.divide(20, 5);
        assertEquals(4, data);
    }

    @Test
    @DisplayName("Test Method Divided")
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    @Disabled
    public void testCommingSoon() {
        
    }

    @Test
    public void testAborted() {
        String profileEnv = System.getenv("STATUS");

        if(!"DEVELOP".equals(profileEnv)){
            throw new TestAbortedException("STATUS isn't Development");
        }

        //Code Dev goes here
    }

    @Test
    public void testAssumption() {
        assumeTrue("DEV".equals(System.getenv("STATUS")));
    }
}
