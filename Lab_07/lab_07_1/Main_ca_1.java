package lab_07_1;
public class Main_ca_1 {
    public static void main(String[] args) {
        CheckingAccount a1 = new CheckingAccount(1000, "61070033", 500);
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw(1800);
        System.out.println(a1);
        a1.withdraw(300);
        System.out.println(a1);
        a1.deposit(1000);
        System.out.println(a1);
        a1.withdraw(200);
        System.out.println(a1);
        System.out.println(a1.toString());
    }
}
