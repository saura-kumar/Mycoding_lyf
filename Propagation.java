public class Propagation{
    void m(){
        int data=50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("exception handled");
        }
    }
    public static void main(String[] args){
        Propagation obj=new Propagation();
        obj.p();
        System.out.println("normal flow...");
    }
}