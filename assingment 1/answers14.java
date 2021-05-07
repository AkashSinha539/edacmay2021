class answers14                           // answer 14 method 2//
{
 public static void main(String args[])
 {
   for(int i=1;i<=9;i++)
   {
     if(i%2==0)
     {
     System.out.print(" * * * * *  ");
     }
     else
     {
      System.out.print("* * * * * * ");
     }
	 for(int j=1;j<=34;j++)
	 {
	 System.out.print("=");
	 }
	 System.out.println();
   }
    for(int i=1;i<=9;i++)
	{
		for(int j=1;j<=46;j++)
		{
         System.out.print("=");
		}
		System.out.println();
	}	 
 }
}