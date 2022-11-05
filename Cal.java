import java.lang.*;
class Ca{
    double i; 
    double x = Math.sqrt(i);

}
class Cal{
    public static void main(String[] args){
        Ca a=new Ca();
        a.i = Integer.parseInt(args[0]);
        System.out.println("Square root of "+a.i+"a.x");
    }
}