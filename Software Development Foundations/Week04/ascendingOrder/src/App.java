import java.util.Scanner;
public class App 
{
    /*
     * Name: Harvey MacLeary
     * Date: 04/10/2022
     * Description: Accepts user input for 3 numbers and sorts them in ascending order.
     * Version: 1.0
     */
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("x: ");
        int x = input.nextInt();

        System.out.print("y: ");
        int y = input.nextInt();

        System.out.print("z: ");
        int z = input.nextInt();

        if (x < y && x < z)
        {
            System.out.println(x);

            if (y < z)
            {
                System.out.println(y);
                System.out.println(z);
            }
            else if (z < y)
            {
                System.out.println(z);
                System.out.println(y);
            }
        }

        else if (y < x && y < z)
        {
            System.out.println(y);

            if (x < z)
            {
                System.out.println(x);
                System.out.println(z);
            }
            else if (z < x)
            {
                System.out.println(z);
                System.out.println(x);
            }
        }

        else if (z < y && z < x)
        {
            System.out.println(z);

            if (y < x)
            {
                System.out.println(y);
                System.out.println(x);
            }
            else if (x < y)
            {
                System.out.println(x);
                System.out.println(y);
            }
        }
    }
}
