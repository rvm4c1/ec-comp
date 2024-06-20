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

        int grade = 0;
        
        System.out.print("Input your grade: ");
        grade = input.nextInt();

        if (grade < 50)
        {
            System.out.println("Your grade is " + grade + ", which is below 50. You have failed.");
        }
        else if (grade >= 50 && grade < 70)
        {
            System.out.println("Your grade is " + grade + ", which is 50 or above. You have passed.");
        }
        else
        {
            System.out.println("Congratulations! Your grade is " + grade + ", which is 70 or above. You have passed with a MERIT.");
        }

        System.exit(0);
    }
}
