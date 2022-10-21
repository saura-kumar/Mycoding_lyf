class circl{
	double x,y;
	double r;
	double circmference() {
		return 2*3.14159*r;
	}
	double area() {
		return (22/7)*r*r;
	}
	circl(double a, double b, double c){
		x=a;
		y=b;
		r=c;
		
	}
}
public class C_con {

	public static void main(String[] args) {
		circl c1=new circl(3.0,4.0,5.0);
		circl c2=new circl(-4.0,8.0,10.0);
		System.out.println("Circmference circle1 := "+c1.circmference());
		System.out.println("Area circle1 := "+c1.area());
		System.out.println("Circmference circle2 := "+c2.circmference());
		System.out.println("Area circle2 := "+c2.area());

	}

}
