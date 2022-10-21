class circle_2{
	double x,y;
	double r;
	double circumference() {
		return 2*3.14159*r;
	}
	double area() {
		return (22/7)*r*r;
	}
}
public class C_CON2 {

	public static void main(String[] args) {
		circle_2 c=new circle_2();
		c.x=0.0;
		c.y=0.0;
		c.r=5.0;
		System.out.println("circumference "+c.circumference());
		System.out.println("Area "+c.area());

	}

}
