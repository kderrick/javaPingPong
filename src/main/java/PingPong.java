import java.util.*;

public class PingPong {
  public static void main(String[] args) {}

    public ArrayList countPingPong(Integer userNumber) {
      ArrayList <Object> numbersArray = new ArrayList<Object>();
      for ( Integer index = 1; index <= userNumber; index++) {
        if (index % 3 == 0) {
          numbersArray.add("ping");
        } else {
          numbersArray.add(index);
        }
      }
      return numbersArray;
  }
}
