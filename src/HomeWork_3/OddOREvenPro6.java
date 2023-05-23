package HomeWork_3;
/*
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class OddOREvenPro6 {
    public void oddOrEven() {
        Scanner num = new Scanner(System.in);
        System.out.print(" Insert any number :  ");
        int x = num.nextInt();
        num.close();
        if (x % 2 == 0) {
            System.out.println(x + " This number is even number");
        } else {
            System.out.println(x + " This number is odd number");
        }
    }

    public static void main(String[] args) {
        OddOREvenPro6 obj = new OddOREvenPro6();
        obj.oddOrEven();
    }
}
