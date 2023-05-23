package HomeWork_3;
/*Input any alphabet from “A" to “F” and print their city name accordingly
 (use if else) if any other alphabet should be invalid entry
*/
import java.util.Scanner;

public class CityNameProg8 {
    public static void main(String[] args) {
        CityNameProg8 cityNameProg8 = new CityNameProg8();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any Alphabet");
        String alphabetName = scan.nextLine();
        cityNameProg8.printCityName(alphabetName);
    }

    private void printCityName(String alphabetName) {
        if (alphabetName.equals("A")) {
            System.out.println("Ahemdabad");
        } else if (alphabetName.equals("B")) {
            System.out.println("Bombay");
        } else if (alphabetName.equals("C")) {
            System.out.println("chicago");
        } else if (alphabetName.equals("D")) {
            System.out.println("Delhi");
        } else if (alphabetName.equals("E")) {
            System.out.println("Ellora");
        } else if (alphabetName.equals("F")) {
            System.out.println("Faizabad");
        } else {
            System.out.println("alphabet should be invalid entry:");
        }

    }
}




