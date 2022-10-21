class circle_1{
	double x,y;
	double r;
	circle_1(double x, double y, double r){
		this.x=x; this.y=y; this.r=r;
		
	}
	circle_1(double r){
		x=0; y=0; this.r=0;
	}
	circle_1(circle c){
		x=c.x; y=c.y; r=c.r;
		
	}
	circle_1(){
		x=0.0; y=0.0; r=0.0;
	}
	double circumference() {
		return 2*3.14159*r;
	}
	double area() {
		return (22/7)*r*r;
		
	}
	
}
public class C_CON1 {

	public static void main(String[] args) {
		circle_1 c1=new circle_1(3.0,4.0,5.0);
		circle_1 c2=new circle_1(5.0);
		circle_1 c3=new circle_1();
		System.out.println("Circmference circle1 := "+c1.circumference());
		System.out.println("Area circle1 := "+c1.area());
		System.out.println("Circmference circle2 := "+c2.circumference());
		System.out.println("Area circle2 := "+c2.area());
		System.out.println("Circmference circle2 := "+c3.circumference());
		System.out.println("Area circle2 := "+c3.area());

	}

}
