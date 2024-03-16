package LAB_02;

import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        int money = sc.nextInt();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        String acType = sc.next();
        if (acType.equals("A") || acType.equals("C")){
            System.out.print("Your total money in one year = ");
            System.out.print((money * (1.5 / 100)) + money);
        } else if (acType.equals("B")){
            System.out.print("Your total money in one year = ");
            System.out.print((money * (2.0 / 100)) + money);
        } else if (acType.equals("X")){
            System.out.print("Your total money in one year = ");
            System.out.print((money * (5.0 / 100)) + money);
        }
    }
    
}
