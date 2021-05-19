import java.util.*;
public class Sports extends Domain{



  public String findTopic(String i){

    String leagues[] = {"NBA", "NFL", "MLB", "NHL"};
    String nba[] = {"It's the best league in the world for basketball.", "They try to score a basketball into a basket at the highest level."};
    String nhl[] = {"It's the best league in the world for hockey.", "They play on ice and try to score a puck into a goal."};
    String nfl[] = {"It's the best league in the world for football.", "They try to put the football into the endzone."};
    String mlb[] = {"It's the best league in the world for baseball.", "Batter tries to hit ball and help their team score."};

    System.out.print("Chatbot: ");System.out.println("Are you intrested in sports?");
    Scanner o = new Scanner(System.in);
    System.out.print("User: ");
    String res = o.nextLine();
    String result = res.toLowerCase();
    if(result.contains("yes")){

      System.out.print("Chatbot: ");System.out.println(leagues[(int)(Math.random()*leagues.length)]);
      System.out.print("User: ");res = o.nextLine();
      result = res.toLowerCase();

      if(result.contains("mlb")){

        return mlb[(int)(Math.random()*mlb.length)];
      }
      else if(result.contains("nba")){

        return nba[(int)(Math.random()*nba.length)];
      }
      else if(result.contains("nfl")){

        return nfl[(int)(Math.random()*nfl.length)];
      }
      else if(result.contains("nhl")){

        return nhl[(int)(Math.random()*nhl.length)];
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
