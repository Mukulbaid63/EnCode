/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int test_case=sc.nextInt();
		while(test_case-->0)
		{
		    int n=sc.nextInt();
		    if(((n & (n-1))==0)&&n!=1) System.out.print("-1");
		    else
		    {
		        if(n==1) System.out.print("1");
		        else
		        {
		    int[] a=new int[n];
		    a[0]=2;
		    a[1]=3;
		    a[2]=1;
		    System.out.print(a[0]+" "+a[1]+" "+a[2]+" ");
		    int counter=0;
		    
		    for(int i=4;i<=n;i+=2)
		    {
		      //  if(counter%2==0){
		      //       if(i+1>n)
		      //          {
		      //              System.out.print(i);
    		  //              break;
		      //          }
		      //          else{
		      //  System.out.print((i+1)+ " "+i+" "); counter++;}
		      //  }
		      //  else {
		      //       if(i+1>n)
		      //          {
		      //              System.out.print(i);
    		  //              break;
		      //          }
		      //          System.out.print(i+ " "+(i+1)+" ");counter++;}
		      if(ispow(i)) 
		       { if(i+1>n)
		                {
		                    System.out.print(i);
    		                break;
		                }
		                else{
		        System.out.print((i+1)+ " "+i+" "); }}
		       else  {
		        if(i+1>n)
		                {
		                    System.out.print(i);
    		                break;
		                }
		                else{
		      System.out.print((i)+ " "+(i+1)+" ");}}
		    }
		    
		    
		    }
		}
		    System.out.println();
		}
	}
	 public static boolean ispow(int x)
    {
        return x!=0 && ((x&(x-1)) == 0);
    }
}
