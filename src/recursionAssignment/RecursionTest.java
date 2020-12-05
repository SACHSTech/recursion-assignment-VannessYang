package recursionAssignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import recursionAssignment.Recursion;

public class RecursionTest{
    
    /**
     * Problem Set 1: Testing base case 
     */
    @Test
    public void Test1(){
      assertEquals(0, Recursion.countHi(""));
    }
    
    /**
     * Problem Set 1: Testing recursive step 
     */
    @Test
    public void Test2(){
      assertEquals(1, Recursion.countHi("hi"));
    }

    /**
     * Problem Set 1: Testing recursive step again
     */
    @Test
    public void Test3(){
      assertEquals(2, Recursion.countHi("xhixhix"));
    }

    /**
     * Problem Set 1: Testing recursive step one more time
     */
    @Test
    public void Test4(){
      assertEquals(1, Recursion.countHi("xxhixx"));
    }

    /**
     * Problem Set 2: Testing base case
     */
    @Test
    public void Test5(){
      assertEquals("", Recursion.endX(""));
    }
}
