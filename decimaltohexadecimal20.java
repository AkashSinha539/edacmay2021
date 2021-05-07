import java.util.Scanner;
public class decimaltohexadecimal20
{
  public static void main(String args[])
  {
   int binary[]=new int[20];
   int index=0;
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   while(n>0)
   {
   binary[index]=n%16;
   n=n/16;
   index=index+1;
   }
   for(int i=index-1;i>=0;i--)
   {
    System.out.print(binary[i]);
   }
  }
 }
