import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
   
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace_1() {
    int[] input1 = { 4,1,2 };
   
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 2,1,4 }, input1);
	}

    @Test 
	public void testReverseInPlace_2() {
    int[] input1 = { 4,1,2,10 };
   
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 10,2,1,4 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed_new() {
    int[] input1 = {3,5,6};
    assertArrayEquals(new int[]{6,5,3}, ArrayExamples.reversed(input1));
  }



}
