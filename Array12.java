class Product{
int pro_id;
String pro_name;
Product(int pid, String pname){
pro_id=pid;
pro_name=pname;
}
public void display(){
System.out.println("Product id:= "+pro_id+"Product name:= "+pro_name);
System.out.println();
}
}
class Array12{
public static void main(String[] args){
Product[] obj=new Product[5];
obj[0]=new Product(3292,"DELL Laptop");
obj[1]=new Product(21823,"HP 39-");
obj[2]=new Product(37823,"APPLE Phn"); 
obj[3]=new Product(27722,"MACBOOK"); 
obj[4]=new Product(1111111,"ROYELS ROYEL");
 System.out.println("product object 1:");
        obj[0].display();
        System.out.println("product object 2:");
        obj[1].display();
        System.out.println("product object 3:");
        obj[2].display();
        System.out.println("product object 4:");
        obj[3].display();
        System.out.println("product object 5:");
        obj[4].display();
    }
}

 
