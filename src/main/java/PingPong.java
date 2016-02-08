import java.util.*;
import static spark.Spark.*;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class PingPong {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/index.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      int userNumber = Integer.parseInt(request.queryParams("userNumber"));

      ArrayList <Object> numbersArray = PingPong.countPingPong(userNumber);
      model.put("numbersArray", numbersArray);
      model.put("userNumber", userNumber);
      model.put("template", "templates/results.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

}




    public static ArrayList countPingPong(Integer userNumber) {
      ArrayList <Object> numbersArray = new ArrayList<Object>();
      for ( Integer index = 1; index <= userNumber; index++) {
        if (index % 15 == 0) {
          numbersArray.add("ping pong");
        } else if (index % 3 == 0) {
          numbersArray.add("ping");
        } else if (index % 5 == 0) {
          numbersArray.add("pong");
        } else {
          numbersArray.add(index);
        }
      }
      return numbersArray;
  }
}
