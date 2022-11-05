class Circle{
    double x,y;
    double r;
    Circle(double a, double b, double c){
        x=a; y=b; r=c; 
    }
    Circle(double c){
        x=0; y=0; r=c;
    }
    Circle(Circle c){
        x=c.x; y=c.y; r=c.r;
    }
    Circle(){
        x=0.0; y=0.0; r=1.0;
    }
    double circumference(){
        return 2*3.14159*r;
    }
    double area(){
        return(22/7)*r*r;
    }
}
class democ1{
    public static void main(String[] args){
        Circle c1=new Circle(3.0,4.0,5.0);
        Circle c2=new Circle(5.0);
        Circle c3=new Circle(c1);
        Circle c4=new Circle();
        System.out.println("Circumference Circle "+c1.circumference());
        System.out.println("Area Circle"+c1.area());
        System.out.println("Circumference Circle "+c2.circumference());
        System.out.println("Area Circle"+c2.area());
        System.out.println("Circumference Circle "+c3.circumference());
        System.out.println("Area Circle"+c3.area());
        System.out.println("Circumference Circle "+c4.circumference());
        System.out.println("Area Circle"+c4.area());
    }
}