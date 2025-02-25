package BookTreeMap.tests;

import BookTreeMap.src.TreeMap;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class TreeMapTest {

   TreeMap<Integer, String> testTree = new TreeMap<>();

    @Test
    public void put() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> testTree.put(null, "test string"));
        assertThrows(IllegalArgumentException.class, () -> testTree.put(1, null));
    }

    @Test
   public void sizeAndClear() {
        testTree.put(5, "testing");
        testTree.put(2, "testaroo");
        testTree.put(6,"tessst!!!");
        assertEquals(3, testTree.size());
        testTree.clear();
        assertEquals(0,testTree.size());
    }

    @Test
    public void containsKey() {
        testTree.put(5, "testing");
        testTree.put(2, "testaroo");
        testTree.put(6,"tessst!!!");
        assertTrue(testTree.containsKey(2));
        assertFalse(testTree.containsKey(10));
    }

    @Test
    public void get() {
        testTree.put(5, "testing");
        testTree.put(2, "testaroo");
        testTree.put(6,"tessst!!!");
        assertEquals("testaroo", testTree.get(2));
        assertEquals("tessst!!!", testTree.get(6));
    }

    @Test
    public void toKeyArray() {
        testTree.put(5, "testing");
        testTree.put(4, "testing");
        testTree.put(3, "testing");
        testTree.put(2, "testaroo");
        testTree.put(1, "testing");
        testTree.put(0, "testing");
        testTree.put(6,"tessst!!!");

        Integer[] expectedArray = {0, 1, 2, 3, 4, 5, 6};
        Integer[] actualArray = testTree.toKeyArray(new Integer[0]);
        assertEquals(expectedArray, actualArray);
    }
}