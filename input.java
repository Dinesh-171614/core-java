import java.util.Scanner;
class MiddleLetterUpperCase
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the string name");
        String input=scan.nextLine();
        int mid= input.length()/2;
        int midIndex = length/2;
        if(Length>0){
            char middleChar=Character.toUpperCase(input.charAt(midIndex));
            String output = input.substring(0,midIndex)+middleChar+input.substring(midIndex+1);
            System.out.println (output);
        }
        else{
            System.out.println("Invalid input");
        }
        }  
    }