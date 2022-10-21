import java.util.*;
public class Area_circle1 {

	public static void main(String[] args) {
		System.out.print("enter your number of area := ");
		Scanner sc=new Scanner(System.in);
		double radius=sc.nextDouble();
		double parameter;
		double area;
		if(radius<=0) {
			System.out.println("please enter non zero number ");
		}
		else {
			parameter=2*Math.PI*radius;
			area=Math.PI*radius*radius;
			System.out.println(parameter);
			System.out.println(area);
		}
		
		
				

	}

}
