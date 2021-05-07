class divide3
{
  public static void main(String args[])
  {
   String s1=args[0];  // value of variable args[0] stored in variable s1 having String datatype . further string allow us to take any type of input//
   String s2=args[1];
   int i=Integer.parseInt(s1); // integer value of variable s1 given to new integer variable i//
   int j=Integer.parseInt(s2);
   int k=(i/j);
   int l=(i%j);
   System.out.println("First argument:"+i);
   System.out.println("second argument:"+j); 
   System.out.println("quotient:"+k);
   System.out.println("remainder:"+l);
   
 }
}