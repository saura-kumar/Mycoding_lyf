import java.lang.*;
class example1{
	double i;
	double x=Math.sqrt(i);
}
public class Calculator1 {

	public static void main(String[] args) {
		example1 a=new example1();
		a.i=Integer.parseInt(args[0]);
		System.out.println("square root of "+a.i+ "is" +a.x);
		
	}

}
