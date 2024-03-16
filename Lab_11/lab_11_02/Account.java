package lab_11_02;
public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a){
        if(a < 0){
            System.out.println("Input number must be a positive integer.");
        }
        else{
            this.balance = balance + a;
            System.out.println(a + " baht is deposited to " + name + ".");
        }
    }
    public void withdraw(double amount) throws WithdrawException {
        if(amount < 0){
            System.out.println("Input number must be a positive integer.");
        }
        else if((balance - amount) < 0){
            String s = String.format("Account %s has not enough money!", name);
            throw new WithdrawException(s);
        }
        else{
            this.balance = balance - amount;
            System.out.println(amount + " baht is withdrawn from " + name + ".");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void showAccount(){
        System.out.println(name + " account has " + balance + " baht.");
    }
}
