import java.util.*;
public class chatbotdemo{

  public static void main(String [] args){

    chatbot c = new chatbot();
    Movies mo = new Movies();
    Tv t = new Tv();
    Sports s = new Sports();
    Domain d = new Domain();

    System.out.print("Chatbot: ");
    System.out.println("Welcome to chatbot, to leave enter exit.");
    Scanner n = new Scanner(System.in);
    System.out.print("User: ");n.nextLine();

    System.out.print("Chatbot: " + c.greetings());
    System.out.println(" ");
    Scanner m = new Scanner(System.in);
    System.out.print("User: ");
    String user = m.nextLine();
    String player = user.toLowerCase();


    do{

      if (player.contains("movies") || player.contains("movie")){
        System.out.println("Chatbot: " + mo.findTopic(player));
        System.out.print("User: ");user = m.nextLine();
        player = user.toLowerCase();
        if(!player.contains("movies") || player.contains("movie")){
          d.isReallyAmgQuery();
        }

      }
      else if (player.contains("tv") || player.contains("shows")){
        System.out.println("Chatbot: " + t.findTopic(player));
        System.out.print("User: ");user = m.nextLine();
        player = user.toLowerCase();
        if(!player.contains("tv") || player.contains("shows")){
          d.isReallyAmgQuery();
        }

      }
      else if (player.contains("sport") || player.contains("sports")){
        System.out.println("Chatbot: " + s.findTopic(player));
        System.out.print("User: "); user = m.nextLine();
        player = user.toLowerCase();
        if(!player.contains("sport") || player.contains("sports")){
          d.isReallyAmgQuery();
        }
      }
      else{
        d.isQueryAmg();
      }
   }
    while(!player.equals("exit"));
  }
}
