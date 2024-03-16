package lab_10_1;
public class Bank {
    private Account acct[];
    private int numAcct;
    public Bank(){
        acct = new Account[10];
    }
    public void addAccount(Account ac){
        for(int i=0; i<acct.length; i++){
            if(acct[i] == null){
                acct[i] = new Account(ac.getBalance(), ac.getName());
                numAcct += 1;
                break;
            }
        }
    }
    public Account getAccount(int index){
        return acct[index];
    }
    public int getNumAccount(){
        return numAcct;
    }
}
