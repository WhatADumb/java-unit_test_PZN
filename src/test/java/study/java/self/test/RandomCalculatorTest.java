package study.java.self.test;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class RandomCalculatorTest extends ParentCalculatorTest{
    @Test
    public void testAdd(Random random) {
        int a = random.nextInt();
        int b = random.nextInt();

        int expctd = a + b;

        Assertions.assertEquals(expctd, calculator.add(a, b));
    }

    @RepeatedTest(value = 10, name = "{displayName}")
    @DisplayName("Testing Add Calcuator")
    public void testAddRepeat(Random random, TestInfo info, RepetitionInfo repeat) {
        System.out.println(info.getDisplayName() + " ke " + repeat.getCurrentRepetition() + " dari " + repeat.getTotalRepetitions());

        int a = random.nextInt();
        int b = random.nextInt();

        int expctd = a + b;

        Assertions.assertEquals(expctd, calculator.add(a, b));
    }

    @DisplayName("Testing With Parameter")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9})
    public void testWithValueSource(int val) {
        int result = val + val;
        Assertions.assertEquals(result, calculator.add(val, val));
    }

    public static List<Integer> dataList() {
        return List.of(1,2,3,4,5,6,7);
    }

    @DisplayName("Testing With Parameter")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @MethodSource("dataList")
    public void testWithMethodSource(int val) {
        int result = val + val;
        Assertions.assertEquals(result, calculator.add(val, val));
    }
}
