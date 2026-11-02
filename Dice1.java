import java.util.Random;

public class Dice1{

   private Random randGen = new Random ( );

   public Dice1 ( ) {

   }

   public int nextRoll( ) {
      // You supply this code.
     return  randGen.nextInt(6)+1;
   }


   public void tester (int howMany) {
	  int k = 0;
	  while (k < howMany) {
	     System.out.println (nextRoll());
	     k = k + 1;
	  }
   }
   public static void main(String[] args) {
      Dice1 d = new Dice1();
      

   }
   
  
}
