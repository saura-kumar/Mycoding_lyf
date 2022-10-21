import java.util.*;
public class high_marks {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enteer number of subject := ");
		double mark_avg;
		int result;
		int i;
		int s=obj.nextInt();
		int[] arr=new int[s];
		for(i=0; i<arr.length; i++) {
			arr[i]=obj.nextInt();
			
		}
		int max=arr[0];
		double sum=arr[0];
		for(i=1; i<arr.length; i++) {
			if(arr[i]>max)
				max=arr[i];
		
			
		}
		result=max;
		mark_avg=sum/(arr.length);
		System.out.println(result);
		System.out.print(mark_avg);
		
		

	}

}
