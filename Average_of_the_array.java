import java.util.*;
public class e{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		double c = 0.0 ;
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		    sum+=arr[i];
		}
		c = (float)sum/n;
		System.out.format("%.2f",c);
	}
}