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
        int x = input.nextInt();
        System.out.println("Enter another value: ");
        int y = input.nextInt();

        if (x < y)
        {
            System.out.println(x + ", " + y);
        }
        else
        {
            System.out.println(y + ", " + x);
        }

        System.exit(0);
    }
}
