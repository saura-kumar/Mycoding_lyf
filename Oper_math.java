import java.util.Scanner;
public class Oper_math {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your first value :=");
		int a=obj.nextInt();
		System.out.print("Enter your second number :=");
		int b=obj.nextInt();
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		System.out.println("your "+a+ " "+"and" +" " +b+" "+ "of sum is :="+c);
		System.out.println("your "+a+ " "+"and" +" " +b+" "+ "of differance is :="+d);
		System.out.println("your "+a+ " "+"and" +" " +b+" "+ "of mulltiplication is :="+e);
		System.out.println("your "+a+ " "+"and" +" " +b+" "+ "of division is :="+f);
	
	}

}
