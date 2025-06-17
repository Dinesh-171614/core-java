class array
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        System.out.println("array elements are:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("array length is:"+a.length);
        System.out.println("array last element is:"+a[a.length-1]);
        System.out.println("array first element is:"+a[0]);
        System.out.println("array second element is:"+a[1]);
        System.out.println("array third element is:"+a[2]);
        System.out.println("array fourth element is:"+a[3]);
        System.out.println("array fifth element is:"+a[4]);
        System.out.println("array sixth element is:"+a[5]);
        }
}