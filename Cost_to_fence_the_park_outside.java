import java.util.*;
public class Park
{
    public static void main(String args[])
    {
        int l,b,w,c;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        int a=2*w*(l+b+2*w);
        int t=c*a;
        System.out.print(t);
    }
}