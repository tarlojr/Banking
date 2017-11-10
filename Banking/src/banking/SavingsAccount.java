package banking;
import java.util.Scanner;

public class SavingsAccount extends BankAccount{
    private double Rate;
    private double M;//amount of money you want to sim intrest to
    private double monthlyInterest;
    private double months;
    public SavingsAccount(){
        super();
        Scanner s1 = new Scanner(System.in);
        System.out.println("What is your desired monthly intrest rate");
        Rate = s1.nextDouble()/100;
    }
    public void Sim(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("what amount would you like to sim to?");
        M = s1.nextDouble();
        double y = getbal();
        for(months = 1; getbal()<M+y ; months++){
            monthlyInterest = super.getbal() * Rate;
            super.Deposit(monthlyInterest);
        }
        if(months<12){
        System.out.println("it took "+months+" months to earn $"+M);
        }
        else if(months>=12){
        System.out.println("it took "+(months/12)+" years to earn $"+M);
        }
        else{
            System.out.println("test");
        }
    }
    public String ToString(){
        String y = "";
        return y;
    }
}