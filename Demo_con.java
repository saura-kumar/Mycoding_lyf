class Circle_5{
	double x,y;
	double r;
	double circumference() {
		return 2*3.14159*r;
		
	}
	double area() {
		return (22/7)*r*r;
		
	}
	Circle_5(double a, double b, double c){
		x=a;
		y=b;
		r=c;
			
	}
}
public class Demo_con {

	public static void main(String[] args) {
		Circle_5 c1=new Circle_5(3.0,4.0,5.0);
		Circle_5 c2=new Circle_5(-4.0,8.0,10.0);
		System.out.println("circumference Circle1:=  "+c1.circumference());
		System.out.println("Area Circle1 := "+c1.area());
		System.out.println("circumference Circle2:=  "+c2.circumference());
		System.out.println("Area Circle2 := "+c2.area());

	}

}
