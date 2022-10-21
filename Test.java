public class Test{
    public void printz(Integer i){
        System.out.println("Integer");
    }
    public void print(int i){
        System.out.print("int");
    }
    public void print(long i){
        System.out.print("long");
    }
    public static void main(String args[]){
        Test T=new Test();
        T.print(10);
    }
     
}
