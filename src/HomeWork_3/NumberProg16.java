package HomeWork_3;
/*Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
*/
import java.util.Scanner;

public class NumberProg16 {

    public static void main(String[] args) {
        NumberProg16 numberProg16 = new NumberProg16();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number");
        int number = scan.nextInt();
        numberProg16.validate(number);
    }

    private void validate(int number) {
        if(number< 0){
            System.out.println("Negative");
        }else if(number > 0){
            System.out.println("Positive");
        }else {
            System.out.println("Zero");
        }
    }
}
