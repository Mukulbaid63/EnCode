import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();}
		   
		    int q=sc.nextInt();
		    while(q-->0){
		        int x=sc.nextInt();
		        int y=sc.nextInt();
		         int z=x+y;
		         int p=Arrays.binarySearch(a,z);
		         if(p<0)
		         System.out.println((-1*p-1));
		         else
		         System.out.println(-1);
		      
		    }
		   
		   
		    
		    
		        
		    
		}
	}
}
