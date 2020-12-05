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

    /**
     * Problem Set 2: Testing recursive step
     */
    @Test
    public void Test6(){
      assertEquals("rexx", Recursion.endX("xxre"));
    }

    /** 
     * Problem Set 2: Testing recursive step agian 
     */
    @Test
    public void Test7(){
      assertEquals("hix", Recursion.endX("hxi"));
    }

    /** 
     * Problem Set 2: Testing recursive step more 
     */
    @Test
    public void Test8(){
      assertEquals("hixxxx", Recursion.endX("xxhixx"));
    }

    /** 
     * Problem Set 2: Testing recursive step one more time 
     */
    @Test
    public void Test9(){
      assertEquals("hihixxx", Recursion.endX("xhixhix"));
    }

    /** 
     * Problem Set 3: Testing base case
     */
    @Test
    public void Test10(){
      assertEquals("", Recursion.stringClean(""));
    }

    /** 
     * Problem Set 3: Testing recursive step
     */
    @Test
    public void Test11(){
      assertEquals("yza", Recursion.stringClean("yyzza"));
    }

    /** 
     * Problem Set 3: Testing recursive step
     */
    @Test
    public void Test12(){
      assertEquals("abcd", Recursion.stringClean("abbbcdd"));
    }

    /** 
     * Problem Set 3: Testing recursive step again
     */
    @Test
    public void Test13(){
      assertEquals("Helo", Recursion.stringClean("Hello"));
    }
}
