public class App 
{
    // Name: Harvey MacLeary
    // Date: 21/09/2022
    // Version: 1.0
    // Notes: N/A
    
    public static void main(String[] args) throws Exception 
    {
        float temp = 96.5f; // Body temperature in Fahrenheit
        float celsius = (temp - 32f) * (5f/9f); // Conversion to Celsius formula
        float kelvin = (temp - 32f) * (5f/9f) + 273.15f; // Conversion to Kelvin formula


        System.out.println("The temperature in Fahrenheit is " + temp + " degrees Fahrenheit."); // Prints temperature in Fahrenheit
        System.out.println("The temperature in Celsius is " + celsius + " degrees Celsius."); // Prints temperature in Celsius
        System.out.println("The temperature in Kelvin is " + kelvin + " degrees Kelvin."); // Prints temperature in Kelvin

        System.exit(0);
    }
}
