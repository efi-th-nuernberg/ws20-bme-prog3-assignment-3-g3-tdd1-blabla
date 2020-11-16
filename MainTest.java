import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void testNothing() 
  {

  }

  @Test
  public void testSomeStuff()
  {
    String s = "";
    try {
      assertEquals(5, 2 + 3);
      
    } catch (AssertionError e){
      System.out.println("Term does not match expected result!");
    }

  try {
    assertFalse(s == null);
  } catch (AssertionError e){
    System.out.println("String is null!");
  }

  try {
    assertTrue(3 * 7 > 4 * 5);
  } catch (AssertionError e){
    System.out.println("First term is not greater than the second one!");
  }
    
    
    
    assertTrue(1 + 3 == 4);
    assertFalse(s == null);
    assertTrue(3 * 7 > 4 * 5);
  }
}

