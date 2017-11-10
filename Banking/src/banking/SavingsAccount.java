package banking;
import java.util.Scanner;

public class SavingsAccount extends BankAccount{
    private double Rate;
    private double M;//amount of money you want to sim intrest to
    private double b1;
    public SavingsAccount(){
        
    }
    public void IntrestRate(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("What is your desired intrest rate");
        Rate = s1.nextDouble();
    }
    public void Sim(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("what amount would you like to sim to?");
        M = s1.nextDouble();
        b1 = super.getbal();
        if(super.getbal()<b1+M){
            
        }
    }
    public String ToString(){
        String y = "";
        return y;
    }
}
