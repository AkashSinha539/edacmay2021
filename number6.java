import java.util.Scanner  ;              // here we are importing Scanner class from util package which resides in jde file // 
class number6
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);     // means user can take any kind of input from keyboard // 
System.out.println("enter ist no :");
int i= sc.nextInt();
System.out.println("enter 2nd no :");
int j= sc.nextInt();
int k=(i+j);
int l=(i-j);
int m=(i*j);
int n=(i/j);
int o=(i%j);
 System.out.println("Addittion :" + k);
 System.out.println("subtraction :"+ l);
 System.out.println("multiplication :"+ m);
 System.out.println("quotient" + n);
 System.out.println("remainder:" + o);
 }
}