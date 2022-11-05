
interface SUM{
	void add();
}
interface SUB{
	void subtract();
}
class MULL implements SUM,SUB{
	public void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Sum is := "+c);
	}
	public void subtract() {
		int a=10,b=20,c;
		c=a-b;
		System.out.println("Subtract is := "+c);
	}
	void mull() {
		int a=10,b=20,c;
		c=a*b;
		System.out.println("multiplye is := "+c);
		}
	}

public class MULLTIPLE_inhertans {

	public static void main(String[] args) {
		MULL m=new MULL();
		m.add();
		m.subtract();
		m.mull();

	}

}
