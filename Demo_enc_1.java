class point_2
{
	int x,y;
	void setpoint(int a, int b) {
		x=a;
		y=b;
	}
}
public class Demo_enc_1 {
	float distance;
	public static void main(String args[]) {
		point_2 p=new point_2();
		p.setpoint(15, 20);
		System.out.println("x = "+p.x);
		System.out.println("y= "+p.y);
		
	}

}
