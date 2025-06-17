import java.util.Scanner;
public class store
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int value = 85;
        if(value<=400)
        {
            System.out.println("accepted");
        }
        else
        {
            System.out.println("rejected");
        }
    }
}