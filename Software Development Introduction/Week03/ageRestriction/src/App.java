public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int age = 20;
        
        if (age < 18)
        {
            System.out.println("You are too young to enter this establishment!!!");
        }

        else if (age >= 18 && age <= 30)
        {
            System.out.println("Come on in.");
        }

        else if (age > 30 && age <= 130)
        {
            System.out.println("Find some other place to be.");
        }

        System.exit(0);
    }
}
