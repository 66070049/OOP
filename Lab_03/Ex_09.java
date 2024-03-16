package LAB_03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = -1, num = 0;
        while(num != -1){
            num = sc.nextInt();
            if (num % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.print("Odd number = " + odd + " and " + "Even number = " + even);
    }
}
