package HomeWork_3;
/*Write a Java program which input any number between 1 to 7 and
it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
*/
import java.util.Scanner;

public class WeekContainPro13 {
    public static void main(String[] args) {
        WeekContainPro13 weekContainPro13 = new WeekContainPro13();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter input any number between 1 to 7");
        String enterNumber = scan.nextLine();
        weekContainPro13.printWeekdaysName(enterNumber);

    }

    private void printWeekdaysName(String weekDaysName) {//With switch condition
        switch (weekDaysName) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("sunday");
                break;
            default:
                System.out.println("Week contains only 1 to 7 days:");
                break;

        }


    }
}

     /*if (weekdaysname.equals("1")) {//With If else condition
            System.out.println("Monday");
        } else if (weekdaysname.equals("2")) {
            System.out.println("Tuesday");
        } else if (weekdaysname.equals("3")) {
            System.out.println("wednesday");
        } else if (weekdaysname.equals("4")) {
            System.out.println("thursday");
        } else if (weekdaysname.equals("5")) {
            System.out.println("friday");
        } else if (weekdaysname.equals("6")) {
            System.out.println("saturday");
        } else if (weekdaysname.equals("7")) {
            System.out.println("sunday");
        } else {
            System.out.println("alphabet should be invalid entry:");
        }
    }
    */

