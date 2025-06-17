class ClassA
{
    public static void main(String args[])
    {
       Class obj=new ClassB();
       System.out.println(obj.a);
       obj.show();

       classB obj1=new ClassB();
       System.out.println(obj1.a);
       obj1.show();

       obj1.a=45;
       System.out.println(obj.a+" "+obj1.a);
    }
}