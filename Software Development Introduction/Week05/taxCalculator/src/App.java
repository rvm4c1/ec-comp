import java.util.Scanner;
import java.lang.Math;
public class App 
{
    /*
     * Name: Harvey MacLeary
     * Date: 4/10/2022
     * Description: This program performs various calculations related to U.K. taxes.
     * Version: 1.0
     */

    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in); // Initialises scanner

        float salary = 0f; // Annual salary
        float taxableincome = 0f; // Taxable income above salary
        float taxpaid = 0f; // Tax paid annually
        int band = 0;

        System.out.print("Enter your annual salary (£): ");
        salary = input.nextInt(); // User inputs salary
        float tempsalary = salary;
       
        if (salary >= 12001f && salary <= 25000f)
        {
            band = 1;
        }

        else if (salary > 25000f && salary <= 45000f)
        {
            band = 2;
        }

        else if (salary > 45000f)
        {
            band = 3;
        }

        while (band != 0)
        {
            switch (band)
            {
                case 3:
                    taxableincome = tempsalary - 45000f;
                    taxpaid = taxpaid + (taxableincome * (45f/100f)); // Calculates tax paid annually at rate of 45% for earners above £45000
                    tempsalary = 45000f;
                    band = 2;
                break;

                case 2:
                    taxableincome = tempsalary - 25000f;
                    taxpaid = taxpaid + (taxableincome * (30f/100f)); // Calculates tax paid annually at rate of 30% for earners between £25001 and £45000
                    tempsalary = 25000f;
                    band = 1;
                break;

                case 1:
                    taxableincome = tempsalary - 12000f;
                    taxpaid = taxpaid + taxableincome * (20f/100f); // Calculates tax paid annually at rate of 20% for earners between £12001 and £25000
                    band = 0;
                break;
            }
        }

        float taxedsalary = Math.round(salary - taxpaid); // Annual salary after tax
        float montaxsal = Math.round(taxedsalary / 12f); // Monthly salary after tax

        System.out.println("Your tax paid for the year is £" + taxpaid + ".");
        System.out.println("Your total annual salary after tax is £" + taxedsalary + ".");
        System.out.println("Your monthly salary after tax is £" + montaxsal + ".");

        input.close();
        System.exit(0);
    }
}
