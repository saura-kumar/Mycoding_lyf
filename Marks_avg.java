import java.util.*;
public class Marks_avg {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		double mark_avg;
		int result;
		int sb=S.nextInt();
		int[] arr=new int[sb];
				for(int i=0; i<arr.length; i++) {
					arr[i]=S.nextInt();
					
				}
		int max=arr[0];
		double sum=arr[0];
		for(int i=1; i<arr.length; i++) {
			sum=sum+arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
		
		result=max;
		mark_avg=sum/(arr.length);
		System.out.println(result);
		System.out.println(mark_avg);
		
				
	}

}
