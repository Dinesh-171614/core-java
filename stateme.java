import java.util.Scanner;
public class statement
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int day = 3;
        switch (day)
        {
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            default:
            System.out.println("other day");
        }
    }
}