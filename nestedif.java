import java.util.Scanner;
public class nestedif
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int mark = 85;
        if(mark>=50)
        {
            if(mark>=90)
            {
                System.out.println("Grade A+");
            }
            else{
                System.out.println("Grade A");
            }
        }
        else{
            System.out.println("fail");
        }
            }
            }