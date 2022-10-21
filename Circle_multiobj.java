class circle{
	double x,y;
	double r;
	double circmference() {
		return 2*3.14159*r;
	}
	double area() {
		return (22/7)*r*r;
		
	}
}

public class Circle_multiobj {
	
	public static void main(String[] args) {
		circle c1=new circle();
		circle c2=new circle();
		c1.x=3.0;
		c1.y=4.0;
		c1.r=4.0;
		c2.x=-4.0;
		c2.y=-8.0;
		c2.r=10.0;
		System.out.println("Circmference circle1 := "+c1.circmference());
		System.out.println("Area circle1 := "+c1.area());
		System.out.println("Circmference circle2 := "+c2.circmference());
		System.out.println("Area circle2 := "+c2.area());
		
		
	}
	
}

