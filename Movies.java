import java.util.*;
public class Movies extends Domain{



  public String findTopic(String i){

    String thrillers[] = {"Limitless", "Interstellar"};
    String actions[] = {"John Wick", "Die Hard"};
    String Limitless[] = {"It's about a guy who gets super smart from a pill."};
    String Interstellar[] = {"It's about a guy who goes into space looking for refuge mankind."};
    String JohnWick[] = {"It's a series with currently three movies about a super hitman."};
    String DieHard[] = {"It's about a guy who saves hostages from terrorists."};

    System.out.print("Chatbot: ");System.out.println("What genre are you intrested in?");
    Scanner o = new Scanner(System.in);
    System.out.print("User: ");
    String res = o.nextLine();
    String result = res.toLowerCase();

    if(result.contains("thriller")){

      System.out.print("Chatbot: ");System.out.println(thrillers[(int)(Math.random()*thrillers.length)]);
      res = o.nextLine();
      result = res.toLowerCase();

      if(result.contains("limitless")){
        System.out.print("Chatbot: ");
        return Limitless[(int)(Math.random()*Limitless.length)];
      }
      else if(result.contains("intersellar")){
        System.out.print("Chatbot: ");
        return Interstellar[(int)(Math.random()*Interstellar.length)];
      }
      else{
        return isQueryAmg();
      }
    }

    else if(result.contains("action")){

      System.out.print("Chatbot: ");System.out.println(actions[(int)(Math.random()*actions.length)]);
      System.out.print("User: ");res = o.nextLine();
      result = res.toLowerCase();

      if(result.contains("john") || result.contains("wick")){

        return JohnWick[(int)(Math.random()*JohnWick.length)];
      }
      else if(result.contains("die") || result.contains("hard")){

        return DieHard[(int)(Math.random()*DieHard.length)];
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
