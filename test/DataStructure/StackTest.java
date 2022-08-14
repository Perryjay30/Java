package DataStructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    Stack stack;
    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }
    @Test
    public void testThatNewStackIsEmpty(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushItemStackIsNotEmpty(){
        stack.push("Toyota");
        stack.push("Lexus");
        stack.push("Mercedes");
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushItemToStack_SizeIsOne(){
        stack.push("Mercedes");
        int size = stack.size();
        assertEquals(1, size);
    }
    @Test
    public void pushItemToStack_getByIndex(){
        stack.push("Mercedes");
        String itemAtIndex = stack.get(0);
        assertEquals("Mercedes", itemAtIndex);
    }
    @Test
    public void pushItemXYZtoStack_getItemsXYZ(){
        stack.push("Toyota");
        stack.push("Lexus");
        stack.push("Mercedes");
        assertEquals("Toyota", stack.get(0));
        assertEquals("Lexus", stack.get(1));
        assertEquals("Mercedes", stack.get(2));
    }
    @Test
    public void pushXYZ_replaceY(){
        stack.push("Toyota");
        stack.push("Lexus");
        stack.push("Mercedes");
        stack.set(1, "Honda");
        assertEquals("Honda", stack.get(1));
    }
    @Test
    public void pushXYZtoStack_lastItemIsRemoved(){
        stack.push("Toyota");
        stack.push("Lexus");
        stack.push("Mercedes");
        String poppedItem = stack.pop();
        assertEquals("Mercedes", poppedItem);
    }
    @Test
    public void testThatPoppingReducesStackSize(){
        stack.push("Toyota");
        stack.push("Lexus");
        stack.push("Mercedes");
        assertEquals(3, stack.size());
        stack.pop();
        assertEquals(2, stack.size());
    }
    @Test
    public void pushXYZtoStack_getZ(){
        stack.push("Toyota");
        stack.push("Lexus");
        stack.push("Mercedes");
        String itemAtTopOfStack = stack.peek();
        assertEquals("Mercedes", itemAtTopOfStack);
    }
    @Test
    public void testThatThePositionOfPushedItemsCanBeGotten(){
        stack.push("Toyota");
        stack.push("Horse");
        stack.push("Mercedes");
        assertEquals(-1, stack.search("Mercedes"));
    }
}
