import java.util.Scanner;

public class App 
{
    /*
     * Name: Harvey MacLeary
     * Date: 3/10/2022
     * Description: "This program receives user inputs in the form of integer values 
     * and prints the relevant output based on nested if statements."
     * Version: 1.0
     */
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in); // Scanner declared

        int vol = 0;
        int temp = 0;
        float pressure = 0f; // Variables initialised

        System.out.print("Please enter a volume (m^3): ");
        vol = input.nextInt();
        System.out.print("Please enter a temperature (deg C): ");
        temp = input.nextInt(); // User inputs received

        if (vol == 1)
        {
            switch (temp) // Case statements print relevant pressures based on user input
            {
                case 25:
                pressure = 1f;
                System.out.println("Pressure = " + pressure + "N/m^2.");
                break;
                case 50:
                pressure = 1.2f;
                System.out.println("Pressure = " + pressure + "N/m^2.");
                break;
                case 75:
                pressure = 1.4f;
                System.out.println("Pressure = " + pressure + "N/m^2.");
                break;
                case 100:
                pressure = 1.6f;
                System.out.println("Pressure = " + pressure + "N/m^2.");
                break;
                default:
                System.out.println("Unaccepted value.");

            }
        }

        else if (vol == 2)
        {
            if (temp == 25) // Nested if statement prints relevant pressure based on input
            {
                pressure = 1.15f;
                System.out.println("Pressure = " + pressure + "N/m^2.");
            }

            else
            {
                System.out.println("Unaccepted value.");
            }
        }

        else if (vol == 3)
        {
            if (temp == 25) // Nested if statement [2]
            {
                pressure = 1.3f;
                System.out.println("Pressure = " + pressure + "N/m^2.");
            }
            
            else
            {
                System.out.println("Unaccepted value.");
            }
        }

        else
        {
            System.out.println("Unaccepted value.");
        }

        System.exit(0);
    }
}
