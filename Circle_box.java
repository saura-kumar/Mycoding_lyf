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
class box{
	double width;
	double height;
	double depth;
	double area() {
	double 	a=(width*height+height*depth+width*depth)*2;
		return a;
	}
	double volume() {
		double v;
		v=width*height*depth;
		return v;
		
	}
}
public class Circle_box {

	public static void main(String[] args) {
		circle c=new circle();
		box b=new box();
		c.x=3.0; c.y=4.0; c.r=5.0;
		b.width=3.0; b.height=4.0; b.depth=5.0;
		System.out.println("Circumference circle := "+c.circmference());
		System.out.println("Area circle := "+c.area());
		System.out.println("Area of box := "+b.area());
		System.out.println("Volume of box := "+b.volume());
		

	}

}
