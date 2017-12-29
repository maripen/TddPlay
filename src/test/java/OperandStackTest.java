import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class OperandStackTest {

    private OperandStack stack;

    @Before
    public void createStack() {
        stack = new OperandStack();
    }

    @Test
    public void testNewOperandStackPeekReturnsZero() {
        assertEquals(BigDecimal.ZERO, stack.peek());
    }

    @Test
    public void testPushingValueOntoStack() {
        BigDecimal value = new BigDecimal(13);
        stack.push(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testReplacingTopOfStack() {
        stack.push(new BigDecimal(23));
        BigDecimal value = new BigDecimal(67);
        stack.replaceTop(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testReplacingTopWithEmptyStack() {
        BigDecimal value = new BigDecimal(67);
        stack.replaceTop(value);
        assertEquals(value, stack.peek());
    }

    @Test
    public void testPoppingValueFromStack() {
        BigDecimal value = new BigDecimal(46);
        stack.push(value);
        stack.push(new BigDecimal(67));
        stack.pop();
        assertEquals(value, stack.peek());
    }

    @Test
    public void testPoppingWithEmptyStack() {
        stack.pop();
        assertEquals(BigDecimal.ZERO, stack.peek());
    }
}
