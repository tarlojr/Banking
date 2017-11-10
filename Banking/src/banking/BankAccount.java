package banking;
import java.util.Scanner;

public class BankAccount {
    private String name;
    private double bal;
    private String x;
    public BankAccount(){
        System.out.println("Enter name");
        Scanner s1 = new Scanner(System.in);
        String value = s1.nextLine();
        name = value;
    }
    public BankAccount(double b){
        System.out.println("Enter name");
        Scanner s1 = new Scanner(System.in);
        name = s1.nextLine();
        bal = b;
    }
    public BankAccount(String n, double b){ //takes the imputs form the main
        name = n;
        bal = b;
    }
    public String ToString(){ //Makes a string so you dont have to have over 9000 System.out.println's
        x = name+" have "+bal;
        return x;
    }
    public BankAccount(String n){ //sets the defult bal to 0
        bal = 0.00;
    }
    public void Deposit(){ //creates a scanner to let you choose how much you want to deposit
        System.out.println(name+" what is your desired amount of money you would like to deposit");
        Scanner s1 = new Scanner(System.in);
        int value = s1.nextInt();
        bal = bal+value;
    }
    public void Deposit(double d){ //lets you deposit desired amount into account
        bal = bal+d;
    }
    public void withdraw(){//lets you withdraw desired amount into account
        System.out.println("What is your desired amount of money you would like to withdraw");
        Scanner s1 = new Scanner(System.in);
        int value = s1.nextInt();
        bal = bal-value;
    }
    public void withdraw(double w){ //lets you take out desired amount and tells you if you took out to much
        bal = bal-w;
        /*
        if(bal<0){
            System.out.println("the funds where insufficent");
        }
        */
    }
    public String getname(){
        return name;
    }
    public double getbal(){ //lets you pull the current bal
        return bal;
    }
    public double setbal(double d){ //its 1 am i cant find a way around this
        bal = 0;
        bal = d;
        return bal;
    }
}
