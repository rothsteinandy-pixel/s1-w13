import java.util.Random;

public class Dice3 {

    private Random randGen;
    private BarChart6 bars;

    public Dice3 ( ) {
        randGen = new Random ( );
        bars = new BarChart6();
    }
    public int forbiddenRoll(int forbidden){
	//your code here.
      return -1;    
    }

    public int nextRoll( ) {
      return randGen.nextInt(6) +1;
    }
    
  public void tester (int howMany) {
	  int k;
	  k = 0;
	  while (k < howMany) {
	     bars.add(forbiddenRoll(5));
	     k = k + 1;
	     bars.updateUI();    // tells the bar chart to update its picture
	     sleep(5);

	  }

   }

   // This will make the program hesitate for a certain number of milliseconds.
   private void sleep(long milliseconds) {
      try {
         java.lang.Thread.sleep (milliseconds);
     } catch (Exception e) {
     }
   }
   

}
