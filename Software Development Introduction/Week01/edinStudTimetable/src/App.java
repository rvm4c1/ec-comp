/*
 * Description: This program will print a fictional timetable for an Edinburgh College student.
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
        Year y = Year.now();
        String name = "Fred Flintsone";
        String college = "Edinburgh College - Sighthill";
        String moduleOne = "Software Development Introduction (H17334)";
        String moduleTwo = "Project Management Introduction (F1W034)";
        String moduleThree = "Computer Systems Fundamentals (H17534)";
        String moduleFour = "Networking Technology (FR2435)";
        String moduleFive = "Professionalism and Ethics in Computing (H1F734)";
        String moduleSix = "Software Development: Programming Foundations (H17X34)";
        String moduleSeven = "Troubleshooting Computing Problems (H17734)";

        System.out.println("**************");
        System.out.println("    Welcome to Semester 01 - " + y);
        System.out.println("Student Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Module 1: " + moduleOne);
        System.out.println("Module 2: " + moduleTwo);
        System.out.println("Module 3: " + moduleThree);
        System.out.println("Module 4: " + moduleFour);
        System.out.println("Module 5: " + moduleFive);
        System.out.println("Module 6: " + moduleSix);
        System.out.println("Module 7: " + moduleSeven);
        System.out.println("**************");
        System.exit(0);
    }
}
