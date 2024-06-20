public class App 
{
    public static void main(String[] args) throws Exception 
    {
        int x = 55;
        System.out.println(x); // 55

        System.out.println(-x); // -55

        System.out.println(-(-x)); // 55

        System.out.println(++x); // 57

        System.out.println(--x); // 56

        System.out.println(--x); // 55

        System.out.println(--x); // 54

        x = x - 1;

        System.out.println(x + 1);

        System.out.println(x);

        System.out.println(x + 1);

        x = x + 1;

        System.out.println(x + 2);
    }
}
