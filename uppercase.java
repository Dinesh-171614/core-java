import java.util.Scanner;
class source
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Enter the string name");
        String input=scanner.nextLine();
        scanner.close();
        int length= input.length()/2;
        int midIndex = length/2;
        if(length>0)
        {
            char middleChar=Character.toUpperCase(input.charAt(midIndex));
            String output = input.substring(0,midIndex)+middleChar+input.substring(midIndex+1);
            System.out.println (output);
        }
        else{
            System.out.println("Invalid input");
        }
        }  
    }