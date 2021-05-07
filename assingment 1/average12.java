import java.util.Scanner;
class average12
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the 3 number:");
  float a1=sc.nextFloat();
  float a2=sc.nextFloat();
  float a3=sc.nextFloat();
  float avg=(a1+a2+a3)/3 ;
  System.out.print("average of 3 number:" + avg);
  }
 }
 
 