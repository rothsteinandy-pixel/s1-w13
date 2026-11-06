public class Craps
{
    DiceRoll r;
    
    public Craps()
    {
        r = new DiceRoll ( );
    }

    // Returns 0 if lose, otherwise the amount won.
    public int play ( ) {
        int count = r.total();
        if(count == 2|| count == 3 || count == 12)
            return 0;
        if(count == 7 || count == 11)
            return 1;
        while (true){
            int roll = r.total();
            if(roll == count)
                return 1;
            else if(roll==7)
                return 0;

        }
        
    }
    
    //simulate play to see your odds of winning
    public void tester(int howMany)
    {
        int runs = 0;
        int count =0;
        while (runs <= howMany){
            runs++;
            if(play()==1)
                count ++;
        }
        System.out.println( count *1.0 / howMany); 

            
    	
    }
    public static void main(String[] args) {
        Craps c = new Craps();
        c.tester(100000);
    }
}
