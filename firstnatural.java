import java.util.Scanner;
class firstnatural{
    public static void main(String[] args){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter your natural number := ");
        int s=n.nextInt();
        int sum=0;
        for(int i=1; i<=s; i++){
            sum=sum+i;


        }
        System.out.println(sum);
    }
}