interface Addition
{  
void add();  
}  
interface Subtract extends Addition
{  
void sub();  
}  
class Multiply implements Subtract
{  
     public void add()
    {
         int a=10,b=20,c;
         c=a+b;
         System.out.println("Addition is "+c);
    }  
    public void sub()
   {
         int a=10,b=20,c;
         c=a-b;
         System.out.println("Addition is "+c); 
}
void mul()
    {
         int a=10,b=20,c;
         c=a*b;
         System.out.println("Multiplication is "+c);
    }
}
class MultipleInterface_1
{
    public static void main(String args[])
   {  
        Multiply obj = new Multiply();  
        obj.add();  
        obj.sub();  
       obj.mul();
    }  
} 
