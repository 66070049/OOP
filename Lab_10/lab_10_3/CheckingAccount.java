package lab_10_3;
public class CheckingAccount extends Account{
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
    public void withdraw(double a){
        if(0 < a){
            if(0 < (getBalance() - a)){
                setBalance(getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + credit + ".");
            }
            else if (0 < ((getBalance() - a) + credit)){
                setBalance(0);
                this.credit = (getBalance() - a) + credit;
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + credit + ".");
            }
            else if(((getBalance() - a) + credit) < 0){
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString(){
        return "The " + getName() + " account has " + getBalance() + " baht and " + credit + " credits.";
    }
}
