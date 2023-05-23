package HomeWork_3;
/*
Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */
import java.util.Scanner;

public class OddEvenUsingTernaryPro1 {

    public static void main(String[] args) {
        OddEvenUsingTernaryPro1 obj = new OddEvenUsingTernaryPro1();
        obj.oddEvenNumber();
    }

    public void oddEvenNumber() {//instance method
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to test=");
        int number = scan.nextInt();
        boolean isEven = number % 2 == 0;

        String result = isEven ? "Even Number" : "Odd Number";
        System.out.println(number + " is " + result);


        /*if(isEven){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }*/
    }
}