public class methodoverloading
{
    public static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void add(double a,double b)
    {
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        add(20,30);
        add(20,30,40);
        add(20.1,30.1);
    }
}