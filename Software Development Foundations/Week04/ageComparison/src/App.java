import java.util.Scanner;
public class App 
{
    /*
     * Name: Harvey MacLeary
     * Date: 28/09/2022
     * Notes: N/A
     * Version: 1.0
     */
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);
        int jack = 0;
        int jill = 0;

        System.out.print("Enter Jack's age in years: ");
        jack = input.nextInt();
        System.out.print("Enter Jill's age in years: ");
        jill = input.nextInt();

        if (jack < jill)
        {
            System.out.println("Jack is younger than Jill by " + (jill - jack) + " years.");
        }
        else
        {
            System.out.println("Jill is younger than Jack by " + (jack - jill) + " years.");
        }

        System.exit(0);
    }
}
