class classA
{
    public static void main(String args[])
    {
       classB obj=new classB();
       System.out.println(obj.a);
       obj.show();

       classB obj1=new classB();
       System.out.println(obj1.a);
       obj1.show();
       
       obj1.a=45;
       System.out.println(obj.a+" "+obj1.a);
    }
}