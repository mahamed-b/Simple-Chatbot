import java.util.*;
public class Domain{

  public String isQueryAmg(){

    Sports s = new Sports();
    Movies m = new Movies();
    Tv t = new Tv();

    String r[] = {"I don't understand. Enter a domain.","Please reiterate. Enter a domain.",
    "Try again. Enter a domain.", "Nice try, but try again. Enter a domain.",
    "Come again? Enter a domain.", "Not valid! Enter a domain.","Give the domain again. Enter a domain.",
    "Unexpected answer, try again. Enter a domain.", "You've been given another chance try again! Enter a domain."};

    System.out.print("Chatbot: ");System.out.println(r[(int)(Math.random() * r.length)]);

    Scanner u = new Scanner(System.in);
    System.out.print("User: ");
    String user = u.nextLine();
    String player = user.toLowerCase();
    if(!player.equals("exit"))

      if (player.contains("movies") || player.contains("movie")){
        System.out.print("Chatbot: ");
        return  m.findTopic(player);
      }
      else if (player.contains("tv") || player.contains("shows")){
        System.out.print("Chatbot: ");
         return t.findTopic(player);
      }
      else if (player.contains("sport") || player.contains("sports")){
        System.out.print("Chatbot: ");
         return s.findTopic(player);
       }
      else{
        return isReallyAmgQuery();
      }
    System.exit(0);
    return null;
  }


  public String helper(){

    Sports s = new Sports();
    Movies m = new Movies();
    Tv t = new Tv();


    Scanner u = new Scanner(System.in);
    System.out.print("User: ");
    String user = u.nextLine();
    String player = user.toLowerCase();

    if(!player.equals("exit")){

      if (player.contains("movies") || player.contains("movie")){
        System.out.print("Chatbot: ");
        return  m.findTopic(player);
      }
      else if (player.contains("tv") || player.contains("shows")){
        System.out.print("Chatbot: ");
         return t.findTopic(player);
      }
      else if (player.contains("sport") || player.contains("sports")){
        System.out.print("Chatbot: ");
         return s.findTopic(player);
       }
      else{
        return isQueryAmg();
      }
    }
    return isQueryAmg();
  }

  public String isReallyAmgQuery(){

    Map<String, String> respones = new TreeMap<String, String>();

    String question[] = {"Are you talking about the show?", "Are you talking about the movie?",
    "Is that the sports team?", "Is this a random question not related to any domains?"};
    String answer[] = {"Yes, it's the show.", "Yes, that's the movie.", "Yes, it's the sports team.",
    "I'm not equipped for this question"};
    respones.put(question[0], answer[0]);
    respones.put(question[1], answer[1]);
    respones.put(question[2], answer[2]);
    respones.put(question[3], answer[3]);

    String unreasonable[] = {"This is unreasonable, please give a real response",
    "I'm a simple bot, and can't deal with this.", "I think you must've miss typed, try again."};


    Random random  = new Random();
    List<String> keys = new ArrayList<String>(respones.keySet());
    String randomKey = keys.get( random.nextInt(keys.size()) );
    String value = respones.get(randomKey);

    System.out.print("Chatbot: ");System.out.println(randomKey);
    Scanner u = new Scanner(System.in);
    System.out.print("User: ");
    String user = u.nextLine();
    String player = user.toLowerCase();

    do {
      if(player.contains("yes")){
        System.out.print("Chatbot: ");System.out.println(value);
        System.exit(0);
        return null;
      }
      else if(player.length() == 1 || player.contains("no") || player.contains("nah") || player.contains("care")){
        System.out.print("Chatbot: ");System.out.println(unreasonable[(int)(Math.random()*unreasonable.length)]);
        return helper();
      }
      else{
        return isQueryAmg();
      }
    }
    while(!player.equals("exit"));
  }
}
