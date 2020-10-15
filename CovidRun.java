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
		    int k=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=x;
		    String s=solve(n,k,x,y,a);
		    System.out.println(s);
		}
	}
	public static String solve(int n,int k,int x,int y,int a){
	    if(a==k) return "YES";
	    else a=(a+k)%n;
	    for(int i=0;i<n;i++){
	    if((a+k)%n==y) return "YES";
	    else a=(a+k)%n;
	    }
	    return "NO";
	}
}
