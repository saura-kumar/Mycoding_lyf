import java.util.*;
public class Area_circle {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your area of number := " );
		double radius=obj.nextDouble();
		double perimeter;
		double area;
		if(radius==0) {
			System.out.println("plese enter non zero positive number");
			
		}
		else {
			perimeter=2*Math.PI*radius;
			area=Math.PI*radius*radius;
			System.out.println(perimeter);
			System.out.println(area);
	}

}
}
