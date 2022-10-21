class point1{
	int x,y;
	void setpoint() {
		x=10;
		y=20;
	}
}
public class Demo_enc {

	public static void main(String[] args) {
		point1 p=new point1();
		p.setpoint();
		System.out.println("x= "+p.x);
		System.out.println("y ="+p.y);
	}

}
