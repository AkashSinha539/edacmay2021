import java.util.Scanner;
class circle11
{
public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the radius of circle:");
  float radii=sc.nextFloat();
  double area=(3.14)*(radii * radii);  // Float takes 4 bytes for storage. Double takes 8 bytes for storage//
  double peri=(2* radii)*(3.14);
  System.out.println("the area of circle:"+ area );
  System.out.println("the perimeter of circle:"+ peri );
 }
}
  
  