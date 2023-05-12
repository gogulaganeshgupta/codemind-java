import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    boolean bo=false;
		    int a=sc.nextInt();
		    int b=sc.nextInt();
			int c=sc.nextInt();
		    if((a+b<c) || (a+c<b )||(b+c <a)){
		        bo=true;
		    }
		    if(bo){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}