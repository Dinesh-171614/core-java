class multiply
{
public static void main(String[] args)
{
int[][]array={
{10,20,30,40}};
int product=1;
for(int i=0;i<array.length;i++){
for(int j=0;j<array[i].length;j++){
product*=array[i][j];
}
}
System.out.println(product);
}
}