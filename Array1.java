import java.util.Scanner;
public class Array1{
    public static void main(String[] args){
        int a[]=new int[5];
        Scanner s=new Scanner(System.in);
        System.out.println("How many element you want to insert ");
        int n=s.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Enter value "+(i+1));
            a[i]=s.nextInt();
        }
        System.out.println("Array is");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}