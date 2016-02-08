import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

  @Test
  public void countPingPong_countUpToNumber_true() {
    PingPong pingPong = new PingPong();
    assertArrayEquals((int[] expecteds, int[] actuals), pingPong.countPingPong(2));
  }
}
