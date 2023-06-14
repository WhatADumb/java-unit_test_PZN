package study.java.self.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class SlowTest {
    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    public void testTime() throws InterruptedException{
        Thread.sleep(2_000);
    }

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    public void testTime2() throws InterruptedException{
        Thread.sleep(2_000);
    }

    @Test
    @Timeout(value = 3, unit = TimeUnit.SECONDS)
    public void testTime3() throws InterruptedException{
        Thread.sleep(2_000);
    }
}
