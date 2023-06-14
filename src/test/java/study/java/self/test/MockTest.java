package study.java.self.test;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockTest {
    @Test
    public void testSample() {
        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("sample-1");

        Assertions.assertEquals("sample-1", list.get(0));

        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}
