class student{
	int rollno;
	String name,course;
	float fees;
	student(int rollno, String name, String course){
		this.rollno=rollno;
		this.name=name;
		this.course=course;
		
	}
	student(int rollno, String name, String course, float fees){
		this(rollno,name,course);
		this.fees=fees;
	}
	void display() {
	System.out.println(rollno+" "+name+ " "+course+ " "+fees);
}
}
public class Demonstration310 {

	public static void main(String[] args) {
		student s1=new student(111,"Saurabh sharma","java");
		student s2=new student(112, "sumit sharma","java",30000);
		s1.display();
		s2.display();

	}

}
