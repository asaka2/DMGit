import java.util.Random;
import java.util.Scanner;
public class TossCoin {
       public static void main(String[] args) {
       	      Random random = new Random();
	      Scanner scan = new Scanner(System.in);
	      int r;
	      int numHeads = 0;
	      int numTails = 0;
	      int maxRound = 3;
	      String[] sides = {"Heads", "Tails"};

	      //greets 
	      System.out.print("Who are you?\n> ");
	      String inputStr = scan.next();
	      System.out.println("Hello, " + inputStr + "!");

	      //toss a coin
	      System.out.println("Tossing a coin...");
       	      for(int i = 0; i < maxRound; i++) {
		  System.out.print("Round " + (i+1) + ": ");
		  r = random.nextInt(2);
		  String side = sides[r];
		  System.out.println(side);
		  if(r == 0) numHeads++;
		  else numTails++;
	      }
	      System.out.println("Heads: " + numHeads + ", Tails: " + numTails);
       }
}
