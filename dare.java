import java.util.Scanner;
class dare
{    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the string name");
        String input = scan.nextLine();
        scan.close();
        int length= input.length();
        int midindex =length/2;
        if (length> 0) {
            char middleChar = Character.toUpperCase(input.charAt(midindex));
            String output = input.substring(0,midindex) + middleChar + input.substring (midindex + 1);
            System.out.println(output);
        } else {
        System.out.println("not valid");
        }
    }
}