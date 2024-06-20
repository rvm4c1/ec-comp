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

        float expense = 0f;

        System.out.print("Input a name: ");
        String name = input.nextLine();

        System.out.print("Is your car leaded or unleaded?: ");
        String petrol = input.nextLine();

        System.out.print("Input an engine capacity in cc: ");
        int capacity = input.nextInt();

        System.out.print("Input a distance in kilometres: ");
        float distance = input.nextFloat();



        if (capacity <= 1100)
        {
            if (petrol == "unleaded")
            {
                expense = distance * 0.066f;
            }
            else
            {
                expense = distance * 0.06f;
            }
            System.out.println("Hi " + name+ ". Your travelling expense due is £" + expense);
        }

        else if (capacity > 1101 && capacity <= 1500 )
        {
            if (petrol == "unleaded")
            {
                expense = distance * 0.077f;
            }
            else
            {
                expense = distance * 0.07f;
            }
            System.out.println("Hi " + name+ ". Your travelling expense due is £" + expense);
        }

        else if (capacity > 1500)
        {
            if (petrol == "unleaded")
            {
                expense = distance * 0.088f;
            }
            else
            {
                expense = distance * 0.08f;
            }
            System.out.println("Hi " + name+ ". Your travelling expense due is £" + expense);
        }

        System.exit(0);
    }
}
