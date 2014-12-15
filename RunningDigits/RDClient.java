public class RDClient
{
    public static void main(String[] args) throws InterruptedException
    {
	int y;
        RunningDigits user = new RunningDigits();
        for (int i = 0; i < 10; i++)
        {
	    y = i;
            for (int n = 1; n <= 4; n++)
	    {
		user.chooseNum(n);
	    	user.setNumber(y);
            	Thread.sleep(600);
            	user.clear();
	     }
        }
        user.shutdown();
     }
}
