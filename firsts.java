import java.util.Scanner;
public class firsts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number a");
         int a=scanner.nextInt();
         System.out.println("Enter the number b");
         int b=scanner.nextInt();
         System.out.println("a is add,b is subtract and c is multiply");
         int choice=scanner.nextInt();
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