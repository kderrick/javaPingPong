import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void countPingPong_countUpToNumberFromUser() {
    PingPong pingPong = new PingPong();
    ArrayList<Object> numbersArray = new ArrayList<Object>();
    numbersArray.add(1);
    numbersArray.add(2);
    assertEquals(numbersArray, pingPong.countPingPong(2));
  }

  @Test
  public void countPingPong_replaceThreesWithPing() {
    PingPong pingPong = new PingPong();
    ArrayList<Object> numbersArray = new ArrayList<Object>();
    numbersArray.add(1);
    numbersArray.add(2);
    numbersArray.add("ping");
    assertEquals(numbersArray, pingPong.countPingPong(3));
  }

}
