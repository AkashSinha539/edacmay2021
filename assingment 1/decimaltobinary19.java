import java.util.Scanner;
public class decimaltobinary19
{
  public static void main(String args[])
  {
   int binary[]=new int[20];
   int index=0;
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   while(n>0)
   {
   binary[index]=n%2;
   n=n/2;
   index=index+1;
   }
   for(int i=index-1;i>=0;i--)
   {
    System.out.print(binary[i]);
   }
  }
 }
