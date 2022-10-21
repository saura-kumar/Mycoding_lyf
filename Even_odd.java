import java.util.Scanner;
public class Even_odd {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		System.out.print("Enter your number :=");
		int n=r.nextInt();
		int sum=0;
		int result=1;
		int i=0;
		while(result<=n) {
			if(i%2==0) {
				if(i%3==0) {
					sum=sum+1;
					
					
				}
				result=result+1;
				
			}
			i=i+1;
			
		}
		System.out.println(sum);
		
				
	}

}
