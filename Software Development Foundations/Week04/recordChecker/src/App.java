import java.util.Scanner;
public class App 
{
    /*
     * Name: Harvey MacLeary
     * Date: 4/10/2022
     * Description: Checks employee records looking for males or those aged over 25.
     * Version: 1.0
     */
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee's gender: ");
        String gender = input.nextLine();

        System.out.print("Enter the employee's age: ");
        int age = input.nextInt();

        if (gender == "male" || age > 25)
        {
            System.out.println("Employee Found");
        }
        
        else
        {
            System.out.println("Ignore");
        }

        System.exit(0);
    }
}
