package banking;
import java.util.Scanner;

public class BankingMain {
    public static void main(String[] args) {
        /**
        BankAccount Bauer = new BankAccount("Todd Bauer", 5000);
        BankAccount Kolb = new BankAccount("Ryan Kolb", 10000);
        BankAccount Sibel = new BankAccount("Dan Sibel");
        System.out.println("Bauer has "+Bauer.getbal()+" $");
        System.out.println("Kolb has "+Kolb.getbal()+" $");
        System.out.println("Sibel has "+Sibel.getbal()+" $");
        
        Bauer.Deposit(500);
        Kolb.Deposit(250);
        Sibel.Deposit(1000);
        System.out.println("Bauer has "+Bauer.getbal()+" $");
        System.out.println("Kolb has "+Kolb.getbal()+" $");
        System.out.println("Sibel has "+Sibel.getbal()+" $");
        
        Bauer.withdraw(6000);
        Kolb.withdraw(5000);
        Sibel.withdraw(999.99);
        System.out.println("Bauer has "+Bauer.getbal()+" $");
        System.out.println("Kolb has "+Kolb.getbal()+" $");
        System.out.println("Sibel has "+Sibel.getbal()+" $");
        
        BankAccount ip1 = new BankAccount();
        BankAccount ip2 = new BankAccount();
        BankAccount ip3 = new BankAccount();
        ip1.Deposit();
        ip2.Deposit();
        ip3.Deposit();
        ip1.withdraw();
        ip2.withdraw();
        ip3.withdraw();
        System.out.println(ip1.ToString());
        System.out.println(ip2.ToString());
        System.out.println(ip3.ToString());
        */
        String name = "";
        double bal1;
        BankAccount b1 = new BankAccount(5000);
        name = b1.getname();
        bal1 = b1.getbal();
        System.out.println();
        System.out.println("you currently have $"+b1.getbal()+" in your account right now what would you like to do?");
        boolean t = true;
        while(t == true){
        System.out.println("1). Withdraw");
        System.out.println("2). Deposit");
        System.out.println("3). Write Checks");
        System.out.println("4). Simulate the time to earn $500 in intrest");
        System.out.println("5). See your current balance");
        System.out.println("6). Exit");
        
        int x;
        Scanner s2 = new Scanner(System.in);
        try{
        x = s2.nextInt();
        if(x == 1){
            b1.setbal(bal1);
            b1.withdraw();
            System.out.println(b1.ToString());
            bal1 = b1.getbal();
        }
        else if(x == 2){
            b1.setbal(bal1);
            b1.Deposit();
            System.out.println(b1.ToString());
            bal1 = b1.getbal();
        }
        else if(x == 3){
            CheckingAccount b2 = new CheckingAccount(bal1, name);
            b2.withdraw();
            System.out.println(b2.toString());
            System.out.println(b2.balance());
            bal1 = b2.getbal();
            
        }
        else if(x == 4){
            SavingsAccount b3 = new SavingsAccount();
            b3.IntrestRate();
        }
        else if(x == 5){
            System.out.println();
            System.out.println(bal1);
            System.out.println();
        }
        else if(x == 6){
            t = false;
        }
        else{
            System.out.println("Please enter a valid number");
            System.out.println();
        }
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Please enter a valid number");
            System.out.println();
        }
    }
    }
}