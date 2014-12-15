public class RDClient
{
    public static void main(String[] args) throws InterruptedException
    {
	int y = 0;
        RunningDigits user = new RunningDigits();
        for (int i = 0; i < 10; i++)
        {
	    y = i;
            for (int i = 1; i <= 4; i++)
	    {
		user.chooseNum(i);
	    	user.setNumber(y);
            	Thread.sleep(00);
            	user.clear();
	     }
        }
        user.shutdown();
     }
}
