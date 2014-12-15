public class RDClient
{
    public static void main(String[] args) throws InterruptedException
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
}
