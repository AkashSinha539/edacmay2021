public class Fibonacci{  
public static void main(String args[])  
{    
 int n1=1,n2=1,n3=0;    
 System.out.print(n1+" "+n2);   
    
 for(int i=2;i<10;i++)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}
} 