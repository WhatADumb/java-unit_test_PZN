package study.java.self.test;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("New Queue")
public class QueueTest {
    
    public Queue<String> queue;

    @Nested
    @DisplayName("When New")
    public class newQueue{
        @BeforeEach
        public void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("Insert one Data")
        public void newOneData() {
            queue.offer("One");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("Insert more than one Data")
        public void newMoreData() {
            queue.offer("One");
            queue.offer("Two");
            Assertions.assertEquals(2, queue.size());
        }
    }
}
