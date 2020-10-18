/* package codechef; // don't place package name! */

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
		    int x=sc.nextInt();
		    int p=sc.nextInt();
		    int k=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		  
		     Arrays.sort(a);
		    int z=solve(a,n,x,p,k);
		    System.out.println(z);
		  
		    
		  
		}
	}
	public static int index(int[] a,int n,int x,int p){
	    int min=Integer.MAX_VALUE,minp=0;
	    for(int i=0;i<n;i++)
	    {
		        if(a[i]==x) {
		            if(Math.abs(p-i)<min){
		                min = Math.abs(p-i);
                        minp = i;
		            }
		        }
		    }
		    return minp;
	}
	public static int solve(int[] a,int n,int x,int p,int k){
	    if(a[p-1]==x) return 0;
	    else if((k>=p && a[p-1]>=x)||(p>=k && a[p-1]<=x)){ 
	        int pos=index(a,n,x,p);
	        if(pos!=0) return Math.abs(p-pos-1);
	        else{
	            a[k-1]=x;
	            Arrays.sort(a);
	            pos=index(a,n,x,p);
	            return Math.abs(p-pos-1)+1;
	        }
	    }
	   // else if(p>=k && a[p-1]<=x){
	   //     int pos=index(a,n,x,p);
	   //     if(pos!=0) return Math.abs(p-pos-1);
	   //     else{
	   //         a[k-1]=x;
	   //         Arrays.sort(a);
	   //         pos=index(a,n,x,p);
	   //         return Math.abs(p-pos-1)+1;
	   //     }
		     
	   // }
	    return -1;
	    
	}
}
