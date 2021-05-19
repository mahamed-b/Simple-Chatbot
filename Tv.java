import java.util.*;
public class Tv extends Domain{



  public String findTopic(String i){

    String comedys[] = {"Psych", "Friends"};
    String actions[] = {"Leverage", "The Boys"};
    String Psych[] = {"It's about a guy with great deductive skills who pretends to be a phsycic."};
    String Friends[] = {"Three young men and three young women of the BFF kind live in the same apartment complex and face life and love in New York."};
    String Leverage[] = {"A group of robin hood crimanals give their own version of justice to those who can't get it legally."};
    String TheBoys[] = {"This show takes a look at a more realistic look at superheros."};

    System.out.print("Chatbot: ");System.out.println("What genre are you intrested in?");
    Scanner o = new Scanner(System.in);
    System.out.print("User: ");
    String res = o.nextLine();
    String result = res.toLowerCase();

    if(result.contains("comedy")){

      System.out.print("Chatbot: ");System.out.println(comedys[(int)(Math.random()*comedys.length)]);
      System.out.print("User: "); res = o.nextLine();
      result = res.toLowerCase();

      if(result.contains("psych")){
        return Psych[(int)(Math.random()*Psych.length)];
      }
      else if(result.contains("friends")){
        return Friends[(int)(Math.random()*Friends.length)];
      }
      else{
        return isQueryAmg();
      }
    }
    else if(result.contains("action")){

      System.out.print("Chatbot: ");System.out.println(actions[(int)(Math.random()*actions.length)]);
      System.out.print("User: "); res = o.nextLine();
      result = res.toLowerCase();

      if(result.contains("leverage")){
        return Leverage[(int)(Math.random()*Leverage.length)];
      }
      else if(result.contains("boys") || result.contains("the boys")){
        return TheBoys[(int)(Math.random()*TheBoys.length)];
      }
      else{
        return isQueryAmg();
      }
    }
    else{
      return isQueryAmg();
    }
  }

}
