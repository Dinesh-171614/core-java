import java.util.Scanner;
public class firstn
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter the number a");
    int a = scanner.nextInt();

    System.out.println("enter the number b");
    int b = scanner.nextInt();

    System.out.println("1 is addition,2 is subtraction,3 is multilplication");
    int choice = scanner.nextInt();

    if(choice==1)
    {
    System.out.println((a+b));
    }
    else if(choice==2)
    {
    System.out.println((a-b));
    }
    else if(choice==3)
    {
    System.out.println((a*b));
    }
    else
    {
        System.out.println("invalid");
    }
    scanner.close();
}
}