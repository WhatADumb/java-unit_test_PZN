package study.java.self.test;

import org.junit.jupiter.api.Test;

public class LifecycleTest {
    String name;

    @Test
    public void testA() {
        name = "Sample";
    }

    @Test
    public void testB() {
        System.out.println(name);
    }
}
