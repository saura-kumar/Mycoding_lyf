import java.util.Scanner;
class Else_if{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your number...:= ");
        int button=s.nextInt();
        if(button==1){
            System.out.println("hello....!");
        }
        else if(button==2){
            System.out.println("bonjour....!");
        }
        else if(button==3){
            System.out.println("Namaste......!");
        }
        else if(button==4){
            System.out.println("Blessing.....!");
        }   
        else{
            System.out.println("invalid number....");
        }
    }
}