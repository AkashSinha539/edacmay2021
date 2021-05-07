import java.util.Scanner;
class swapping15
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the two number:");
float no1=sc.nextFloat();
float no2=sc.nextFloat();
float temp=no1;
no1=no2;
no2=temp;
System.out.println("after swapping the no1:"+no1);     
System.out.println("after swapping the no2:"+no2); 
}
}
