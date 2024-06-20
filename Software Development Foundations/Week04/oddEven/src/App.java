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

        System.out.println("Enter a value: ");
        int value = input.nextInt();

        if ((value % 2) == 0)
        {
            System.out.println("The value, " + value + ", is an even number.");
        }
        else
        {
            System.out.println("The value, " + value + ", is an odd number");
        }
        
        System.exit(0);
    }
}
