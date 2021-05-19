import java.util.*;
public class chatbot{

  public String greetings(){
    String g[] = {"Hi. Enter a domain.", "Hello. Enter a domain.", "Hey there. Enter a domain.",
    "Hey. Enter a domain."};
    return g[(int)(Math.random()*g.length)];

  }

}
