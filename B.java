class A{
    void msg(){
        System.out.println("hi I am in class A");

    }
}
class B{
    public static void main(String args[])
{
    A obj=new A();
    obj.msg();
}
}