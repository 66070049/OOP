package LAB_02;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary;
        salary = sc.nextDouble();
        if (salary <= 50000) {
            System.out.print(salary * 0.05);
        }else{
            System.out.print(salary * 0.10);
    }
}
}