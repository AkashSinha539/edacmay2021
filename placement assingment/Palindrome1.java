public class Palindrome1
{  
 public static void main(String args[])
 {  
  double n=5225;
  double temp=n;
double r,sum=0;  
      
  while(n>0)
  {    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
  {
     if((temp%1)!=0)
      System.out.println("The number is not a Integer palindrome");    
     
     else
     	System.out.println("The number is a Integer palindrome");  
  }	
     
  else
  {	  
   System.out.println("The number is not a palindrome");   
  } 
}  
}  