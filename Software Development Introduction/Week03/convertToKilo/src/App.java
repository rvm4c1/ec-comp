import java.lang.Math;
public class App 
{   
    /*
     * Name: Harvey MacLeary
     * Date: 20/09/2022
     * Version: 1.0
     * Notes: N/A
     */
    public static void main(String[] args) throws Exception 
    {
        float conversion = 1.60934f; // Number of kilometres in one mile
        float distance = 45.3f; // Distance in miles between Sighthill and Perth, Scotland
        float km = (distance * conversion); // Distance in kilometres
        float time =  (52f / 60f); // Time in minutes converted into hours
        float speed = (km / time); // Calculates speed in kilometres per hour

        System.out.println("The distance in miles is " + distance + " miles."); // Prints distance in miles
        System.out.println("The distance in kilometres is " + (Math.round(km)) + " kilometres."); // Rounds and prints distance in kilometres.
        System.out.println("The average speed is " + speed + " kilometres per hour."); // Prints speed in kilometres per hour

        System.exit(0);
    }
}
