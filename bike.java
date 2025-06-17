class bike
{
    String color;
    void start()
    {
        System.out.println("Bike started");
    }
}
public class main
{
    public static void main(String[] args)
    {
        Bike mybike=newbike();
        mybike.color="Red";
        mybike.start();
    }
}