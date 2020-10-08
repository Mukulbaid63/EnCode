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
		    int[] a=new int[n];
		    int mul=1;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    if(n==1){
		        if(a[0]%2==0) System.out.println("no");
		        else System.out.println("yes");
		    }
		    else{
		         for(int i=0;i<n;i++){
		         mul=mul*a[i];
		    }
		    if(mul%2!=0) System.out.println("yes");
		    else System.out.println("no");
		    }
		}
	}
}
