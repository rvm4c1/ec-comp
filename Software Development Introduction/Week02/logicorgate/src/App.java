public class App 
{
    /*
     * Name: Harvey MacLeary
     * Date: 19/09/2022
     * Version: 1.0
     * Notes: N/A
     */
    public static void main(String[] args) throws Exception 
    {
        boolean A = false;
        boolean B = true;

        if ((A = true) || (B = true))
        {
            System.out.println("The system output is true.");
        }
        else
        {
            System.out.println("The system output is false.");
        }
        System.exit(0);
    }
}
