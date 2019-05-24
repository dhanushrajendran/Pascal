//Pascal's traingle
import java.util.Scanner;

public class PascalsTriangle 
{
	
  public static void main(String[] args) 
  {
		
   Scanner s =new Scanner(System.in);
		
   System.out.println("Enter n");
		
   int n=s.nextInt();
		
   for(int i=0;i<=n;i++)
		
   {
		    
     for(int j=1;j<=n-i;j++)
		    
     {
		        
       System.out.print("  ");
		    
     }
		    
     for(int k=i;k>=0;k--)
		   
     { 
		        
       System.out.print(k+" ");
		    
     }
		    
     for(int l=1;l<=i;l++)
		   
     {
		       
        System.out.print(l+" ");
		   
     }
		    
     System.out.println("\n");
		
   }
	
 }

}
