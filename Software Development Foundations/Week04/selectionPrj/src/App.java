import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        int value = 0;
        int min = 0;
        int max = 100;

        System.out.print("Please enter a number: ");
        value = sc.nextInt();

        if (value < min || value > max)
        {
            System.out.println("Sorry, you have exceeded the limit.");
        }
        else
        {
            System.out.println("The value is " + value + ".\n");
        }
    }
}
