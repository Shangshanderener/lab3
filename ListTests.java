import static org.junit.Assert.*;
import org.junit.*;

interface StringChecker { boolean checkString(String s); }

public class ListTests {
	@Test 
	public void testFilter() {
    StringChecker temp = new StringChecker(){
        
    };
    List<String> input1 = new ArrayList<String>(Arrays.asList ());
    List<String> input2 = new ArrayList<String>(Arrays.asList ("xyz", "abc"));
    List<String> input3 = new ArrayList<String>(Arrays.asList ("abc"));
    List<String> input4 = new ArrayList<String>(Arrays.asList ("xyz", "a"));
    assertArrayEquals(new ArrayList<>(), ListExamples.filter(input1, temp));
    assertArrayEquals(new ArrayList<String>(Arrays.asList ("xyz", "abc")), ListExamples.filter(input2, temp));
    assertArrayEquals(new ArrayList<String>(Arrays.asList ("abc")), ListExamples.filter(input3, temp));
    assertArrayEquals(new ArrayList<String>(Arrays.asList ("xyz", "a")), ListExamples.filter(input4, temp));
	}


  @Test
  public void testMerge() {
    int[] input1 = { };
    int[] input2 = { 1, 2, 3 };
    int[] input3 = { 3, 3 };
    int[] input4 = { 1, 3, 2, 4 };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{ 3, 2, 1 }, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{ 3, 3 }, ArrayExamples.reversed(input3));
    assertArrayEquals(new int[]{ 4, 2, 3, 1 }, ArrayExamples.reversed(input4));
  }
}