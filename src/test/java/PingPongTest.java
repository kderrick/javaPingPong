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

  @Test
  public void countPingPong_replaceFivesWithPong() {
    PingPong pingPong = new PingPong();
    ArrayList<Object> numbersArray = new ArrayList<Object>();
    numbersArray.add(1);
    numbersArray.add(2);
    numbersArray.add("ping");
    numbersArray.add(4);
    numbersArray.add("pong");
    assertEquals(numbersArray, pingPong.countPingPong(5));
  }

  @Test
  public void countPingPong_replaceMultiplesOfFifteen() {
    PingPong pingPong = new PingPong();
    ArrayList<Object> numbersArray = new ArrayList<Object>();
    numbersArray.add(1);
    numbersArray.add(2);
    numbersArray.add("ping");
    numbersArray.add(4);
    numbersArray.add("pong");
    numbersArray.add("ping");
    numbersArray.add(7);
    numbersArray.add(8);
    numbersArray.add("ping");
    numbersArray.add("pong");
    numbersArray.add(11);
    numbersArray.add("ping");
    numbersArray.add(13);
    numbersArray.add(14);
    numbersArray.add("ping pong");
    assertEquals(numbersArray, pingPong.countPingPong(15));
  }

}
