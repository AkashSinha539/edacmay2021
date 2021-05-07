class sum2
{
  public static void main(String args[])
  {
   String s1=args[0];  // value of variable args[0] stored in variable s1 having String datatype//
   String s2=args[1];
   int i=Integer.parseInt(s1); // integer value of variable s1 given to new integer variable i//
   int j=Integer.parseInt(s2);
   int k=i+j;
   System.out.println("First argument:"+i);
   System.out.println("second argument:"+j); 
   System.out.println("third argument:"+k);
 }
}