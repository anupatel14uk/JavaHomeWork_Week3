package HomeWork_3;
/*Write a java program to input any two number and ask user to
enter their symbol (+, -, /, *) find addition, Subtraction,
multiplication and division according to their symbol (using if else)
*/
import java.util.Scanner;

public class CalculationAllSymbolPro10 {
    public static void main(String[] args) {
        CalculationAllSymbolPro10 symbolPro10 = new CalculationAllSymbolPro10();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int firstNumber = scan.nextInt();

        System.out.println("Enter your Second number");
        int secondNumber = scan.nextInt();

        System.out.println("Enter enter their symbol");
        String symbol = scan.next();


        symbolPro10.calculationallsymbol(firstNumber, secondNumber, symbol);
    }

    private int calculationallsymbol(int first, int second, String symbol) {
        if (symbol.equals("+")) {
            int result = first + second;
            System.out.println("result =" + result);
        } else if (symbol.equals("-")) {
            int Subtraction = first - second;
            System.out.println("result =" + Subtraction);
        } else if (symbol.equals("/")) {
            double division = first / second;
            System.out.println("result =" + division);
        } else if (symbol.equals("*")) {
            int multiplication = first * second;
            System.out.println("result =" + multiplication);
        }
        return 0;
    }
}
