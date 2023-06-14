package study.java.self.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {
    private int counter = 0;

    @BeforeAll
    public void beforeAll(){

    }

    @AfterAll
    public void afterAll() {
        
    }

    @Test
    @Order(3)
    public void testA() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(2)
    public void testB() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(1)
    public void testC() {
        counter++;
        System.out.println(counter);
    }
}
