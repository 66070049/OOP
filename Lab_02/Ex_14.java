package LAB_02;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 375.99, total = 0;
        System.out.println("Please insert your monitor size 38 or 43 only");
        int size = sc.nextInt();
        System.out.println("Do you wan DVD-ROM? 1 is Yes / 0 is No");
        int checkD = sc.nextInt();
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int checkP = sc.nextInt();
        System.out.println("======= Your order =======");
        System.out.println("*computer >>> 375.99$");
        if (size == 38){
            System.out.println("*38'Monitor >>> 75.99$");
            total = price + 75.99;
        }else if (size == 43){
            System.out.println("*43'Monitor >>> 99.99$");
            total = price + 99.99;
        }if (checkD == 1){
            System.out.println("*DVD-Rom >>> 65.99$");
            total = total + 65.99;
        }if (checkP == 1){
            System.out.println("Printer >>> 125.00$");
            total = total + 125.00;
        }
        System.out.println("======= Total price >>> " + total + " =======");
    }
    
}
