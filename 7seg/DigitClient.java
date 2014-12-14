public class DigitClient
{
   public static void main(String[] args)
   {
	Digit user = new Digit();

	for (int i = 0; i < 10; i++)
	{
	    user.setNumber(i);
	    Thread.sleep(5000);
	    user.clear();
	}
	
	user.shutdown();
   }

