package HomeWork_3;
/*Same as above program-8 using switch statement.
*/

import java.util.Scanner;

public class AlphabetSwitchStatmentPro9 {

    public static void main(String[] args) {
        AlphabetSwitchStatmentPro9 statmentPro9 = new AlphabetSwitchStatmentPro9();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Any Alphabet");
        String alphabetName = scan.nextLine();
        statmentPro9.printCityName(alphabetName);
    }

    private void printCityName(String alphabetName) {
        switch (alphabetName) {
            case "A":
                System.out.println("Ahemdabad");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("chicago");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Ellora");
                break;
            case "F":
                System.out.println("Faizabad");
                break;
            default:
                System.out.println("alphabet should be invalid entry:");
                break;

        }

    }
}
