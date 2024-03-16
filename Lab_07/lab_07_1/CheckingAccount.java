package lab_07_1;
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
        return this.credit;
    }
    @Override
    public void withdraw(double a){
        if(0 < a){
            if(0 <= (this.getBalance() - a)){
                this.setBalance(getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + credit + ".");
            }
            else if (0 <= ((this.getBalance() - a) + this.credit)){
                setBalance(0);
                this.credit = (this.getBalance() - a) + this.credit;
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + credit + ".");
            }
            else{
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString(){
        return "The " + this.getName() + " account has " + this.getBalance() + " baht and " + this.credit + " credits.";
    }
}
