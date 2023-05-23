package HomeWork_3;
/*
Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.Scanner;

public class InputNumAlphaSymbolPro12 {
    public static void main(String[] args) {
        InputNumAlphaSymbolPro12 inputNumAlphaSymbol_pro12 = new InputNumAlphaSymbolPro12();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any number/alphabet/symbol");
        char value = scan.next().charAt(0);

        inputNumAlphaSymbol_pro12.verify(value);
    }

    private void verify(char value) {
        if (Character.isDigit(value)) {
            System.out.println("Input character is digit");
        } else if (Character.isLetter(value)) {
            System.out.println("Input character is letter");
        } else {
            System.out.println("Input character is symbol");
        }
    }
}


