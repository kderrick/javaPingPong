import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void countPingPong_countUpToNumberFromUser() {
    PingPong pingPong = new PingPong();
    ArrayList <Integer> numbersArray = new ArrayList<Integer>();
    numbersArray.add(1);
    numbersArray.add(2);
    assertEquals(numbersArray, pingPong.countPingPong(2));
  }
}
