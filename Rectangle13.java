import java.util.Scanner;
class Rectangle13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the length and breadth:");
float length=sc.nextFloat();
float breadth=sc.nextFloat();
float area=(length*breadth);
float perimeter=2*(length+breadth);
System.out.println("the area of rectangle:"+ area);                        //output:46.75 and 28.0 aa rha hai//
System.out.println("the perimeter of rectangle:"+ perimeter);
}
}
