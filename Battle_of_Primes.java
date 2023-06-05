import java.util.*;
public class sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y = sc.nextInt();
        int z = sc.nextInt();
        int c , p , s = y+z;
        p=s;
        for(int i = 1 ; i <= 10 ; i++)
        {
            p+=1;
            c=0;
            for(int j = 1 ; j <= p ; j++)
            {
                if(p%j == 0)
                {
                    c++;
                }
            }
            if(c == 2)
            {
                System.out.println(p-s);
                break;
            }
        }
    }
}