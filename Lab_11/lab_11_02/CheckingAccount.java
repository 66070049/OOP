package lab_11_02;
public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount(){
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if(0 < credit){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double amount) throws WithdrawException{
        if(0 < amount){
            if(0 < (this.getBalance() - amount)){
                this.setBalance(this.getBalance() - amount);
                System.out.println(amount + " baht is withdrawn from " + getName() + " and your credit balance is " + credit + ".");
            }
            else if (0 < ((this.getBalance() - amount) + credit)){
                this.credit = (this.getBalance() - amount) + credit;
                this.setBalance(0);
                System.out.println(amount + " baht is withdrawn from " + this.getName() + " and your credit balance is " + credit + ".");
            }
            else{
                String s = String.format("Account %s has not enough money!", this.getName());
                throw new WithdrawException(s);
            }
        }
    }
    @Override
    public String toString(){
        return "The " + getName() + " account has " + getBalance() + " baht and " + credit + " credits.";
    }
}
