import java.util.*;
class table7
{
 public static void main(String args[])
 {
int k;
Scanner sc=new Scanner(System.in);     //*syntax to take input from user*//
System.out.println("take the number ");
int i=sc.nextInt();                      // integer input is assigned to i from sc//
for (int j=1;j<=10;j++)
{
	k=i*j;
System.out.println("table:"+ k);
}
}
}