package banking;

public class CheckingAccount extends BankAccount{
    public CheckingAccount(){
        private double Charge;
        private String ts = "";
    }
    public ServiceCharge(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("What is your service charge?");
        Charge = s1.nextDouble();
    }
    public void withdraw(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("how much would you like to withdraw?");
        value = s1.nextDouble();
        ServiceCharge();
        super withdraw(value+charge);
        if(getbal()<0){
            overdraft();
        }
    }
    public overdraft(){
            super widthdraw(50)
    }
    public toString(){ //displays all of your account information
        super toString();
    }
}
