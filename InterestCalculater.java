import java.io.*;
class InterestCalculater{
    public static void main(String[] args){
        Float principalAmount = new Float(0);
        Float rateOfInterest = new Float(0);
        int numberOfYears = 0;
        try{
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        System.out.println("Enter principal Ampount: ");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);
        System.out.println("Enter Rate of Interest: ");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);
        System.out.println("Enter Number of Years: ");
        System.out.flush();
        tempString = in.readLine();
        numberOfYears = Integer.parseInt(tempString);
        float InterestTotal = principalAmount*rateOfInterest*numberOfYears;
        System.out.println("Total Interest = "+InterestTotal);
    }
    catch(Exception ex)
    {}
    
}
}