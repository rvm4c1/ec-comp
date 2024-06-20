/*
 * Description: Using a declared string variable to produce a welcome message.
 */
import java.time.Year;
public class App 
{
    /*
     * Name: Harvey MacLeary
     * EC #: EC1838948
     * Location: Edinburgh College - Sighthill
     * Date: 6/9/2022
     * Version: 1.0
     * Notes: N/A
     */
    public static void main(String[] args)
    {
        String firstName = "Harvey"; 
        String lastName = "MacLeary"; // Strings declared and initialised
        Year y = Year.now();
        System.out.println("Welcome " + firstName + " " + lastName + " to Edinburgh College " + y); // Welcome message printed
        System.exit(0);
    }
}
