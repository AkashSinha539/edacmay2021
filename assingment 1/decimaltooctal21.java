import java.util.Scanner;
public class decimaltooctal21
{
  public static void main(String args[])
  {
   int binary[]=new int[20];
   int index=0;
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   while(n>0)
   {
   binary[index]=n%8;
   n=n/8;
   index=index+1;
   }
   for(int i=index-1;i>=0;i--)
   {
    System.out.print(binary[i]);
   }
  }
 }