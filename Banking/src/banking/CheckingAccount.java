package banking;
import java.util.Scanner;

public class CheckingAccount extends BankAccount{
    private double Charge;
    private double value;
    private String ts = "";
    private String CheckID = "";
    public CheckingAccount(double b, String n){
        super.Deposit(b);
        super.setname(n);
        CheckGen();
    }
    public void ServiceCharge(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("What is your service charge?");
        Charge = s1.nextDouble();
    }
    @Override
    public void withdraw(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("how much would you like to make the check worth?");
        value = s1.nextDouble();
        ServiceCharge();
        super.withdraw(value+Charge);
        if(super.getbal()<0){
            overdraft();
        }
    }
    public void overdraft(){
            super.withdraw(50);
    }
    @Override
    public String toString(){ //displays all of your account information
        ts += super.getname()+"\n"+"$"+(Charge+value)+"\n"+"Check Id : "+CheckID;
        return ts;
    }
    private void CheckGen(){
        int x = (int)(Math.random()*9);
        int t = (int)(Math.random()*9);
        int y = (int)(Math.random()*9);
        int u = (int)(Math.random()*9);
        int i = (int)(Math.random()*9);
        int o = (int)(Math.random()*9);
        CheckID = x+""+t+""+y+""+u+""+i+""+o+"";
    }
    public String balance(){
        String balance = "";
        balance = "you currently have $"+super.getbal()+" left";
        System.out.println();
        return balance;
    }
}