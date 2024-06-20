public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int x = 10;
        System.out.println("x = " + x);

        System.out.println("x - x = " + (x - x));

        System.out.println("x - x - x = " + -x);

        System.out.println("x - 1 = " + --x);

        System.out.println("x = " + x--);
        System.out.println(x);

        System.out.println("end");

        System.exit(0);
    }
}
