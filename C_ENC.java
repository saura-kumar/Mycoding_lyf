class circle_4{
	double x,y,r; 
	double circumference() {
		return 2*3.14159*r;
		
	}
	double area() {
		return (22/7)*r*r;
	}
}
public class C_ENC {

	public static void main(String[] args) {
		circle_4 c=new circle_4();
		circle_4 c1=new circle_4();
		c.x=3.0;
		c.y=4.0;
		c.r=5.0;
		c1.x=-4.0;
		c1.y=-8.0;
		c1.r=10.0;
		System.out.println("circumference circle "+c.circumference());
		System.out.println("Area circle "+c.area());
		System.out.println("circumference circle1 "+c1.circumference());
		System.out.println("Area circle1 "+c1.area());
		

	}

}
