package banking;
import java.util.Scanner;

public class SavingsAccount extends BankAccount{
    private double Rate;
    private double M;//amount of money you want to sim intrest to
    public SavingsAccount(double d){
        
        
    }
    public void IntrestRate(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("What is your desired intrest rate");
        Rate = s1.nextDouble();
    }
    public void Sim(double m){
        double bal;
        bal = super.getbal();
    }
    public String ToString(){
        String y = "";
        return y;
    }
}
