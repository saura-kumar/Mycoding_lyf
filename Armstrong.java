import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your number := ");
		int n=s.nextInt();
		int result;
		int temp=n;
		int c=0,t;
		while(n>0) {
			t=n%10;
			n=n/10;
			c=c+(t*t*t);
		}
		if(temp==c)
			result=1;
		else
			result=0;
		System.out.println(result);
		}
		

	}


