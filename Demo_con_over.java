class circle_6{
	double x,y;
	double r;
	circle_6(double a, double b, double c){
		x=a; y=b; r=c;
		
	}
	circle_6(double c){ 
		x=0; y=0; r=c;
	}
	circle_6(circle_6 c){
		x=c.x; y=c.y; r=c.r;
		
	}
	circle_6(){
		x=0.0; y=0.0; r=1.0;
	}
	double circumference() {
		return 2*3.14159;
	}
	double area() {
		return (22/7)*r*r;
	}
}
public class Demo_con_over {

	public static void main(String[] args) {
		circle_6 c1=new circle_6(3.0,4.0,5.0);
		circle_6 c2=new circle_6(5.0);
		circle_6 c3=new circle_6(c1);
		circle_6 c4=new circle_6();
		System.out.println("circumference circle1 := "+c1.circumference());
		System.out.println("Area circle1 := "+c1.area());
		System.out.println("circumference circle2 := "+c2.circumference());
		System.out.println("Area circle2 := "+c2.area());
		System.out.println("circumference circle3 := "+c3.circumference());
		System.out.println("Area circle3 := "+c3.area());
		System.out.println("circumference circle4 := "+c4.circumference());
		System.out.println("Area circle4 := "+c4.area());
	}

}
