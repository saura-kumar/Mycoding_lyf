 import java.util.*;
public class Greatest3 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("Enter first numbet := ");
	int a=s.nextInt();
	System.out.print("Enter scond number := ");
    int b=s.nextInt();
    System.out.print("Enter third number := ");
    int c=s.nextInt();
    int result=0;
    if(a>=b && a>=c) {
    	result=a;
    }
    else if(b>=c) {
    	result=b;
    }
    else {
    	result=c;
    	
    }
    System.out.println("greatest number is := " +result);
	}

}
