import java.util.Scanner;
public class avg
{
    public static void main(String args[])
    {
        float a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        float av=(a+b)/2;
        System.out.printf("%.4f",av);
    }
}