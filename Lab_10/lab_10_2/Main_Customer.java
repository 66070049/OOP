package lab_10_2;
public class Main_Customer {
    public static void main(String[] args) {
        Customer_1 cust = new Customer_1("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(4000, "Somsri02");
        Account acct3 = new Account(3000, "Somsri03");
        Account acct4 = new Account(2000, "Somsri04");
        Account acct5 = new Account(1000, "Somsri05");
        //add
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        cust.addAccount(acct3);
        cust.addAccount(acct4);
        cust.addAccount(acct5);
        //test deposit & withdrawn
        cust.getAccount(0).withdraw(3000);//01 = 2000
        cust.getAccount(1).deposit(3000);//02 = 7000
        cust.getAccount(2).withdraw(2000);//03 = 1000
        cust.getAccount(3).withdraw(500);//04 = 1500
        cust.getAccount(4).deposit(4000);//05 = 5000
        //show customer info
        System.out.println(cust);
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }   
}
