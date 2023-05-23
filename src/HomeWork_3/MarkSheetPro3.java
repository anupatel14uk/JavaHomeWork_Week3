package HomeWork_3;
/*
Write a java program to input student Name, roll No, and three subjects Math,
Science and English marks (marks is between 0 to 100 and if it is out of range print error message
 “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and
also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And
print Mark Sheet in following format _______________________________ | |
 */
import java.util.Scanner;

public class MarkSheetPro3 {
    public static void main(String[] args) {
        MarkSheetPro3 obj = new MarkSheetPro3();
        obj.studentmarksheet();

    }

    public void studentmarksheet() {//instance method
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter rollnumber");
        int rollNumber = scan.nextInt();

        System.out.println("Enter name");
        String name = scan.next();

        System.out.println("Enter maths mark");
        int mathsMark = scan.nextInt();
        if (mathsMark < 0 || mathsMark > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return;
        }
        System.out.println("Enter science mark");
        int scienceMark = scan.nextInt();
        if (scienceMark < 0 || scienceMark > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return;
        }
        System.out.println("Enter english mark");
        int englishMark = scan.nextInt();
        if (englishMark < 0 || englishMark > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            return;
        }
        System.out.println(" ________________________________");
        System.out.println("|                                |");
        System.out.println("|          Mark Sheet            |");
        System.out.println("|________________________________|");
        System.out.println("|    Name      :  " + name + "            |");

        System.out.println("|    Roll Number  :  " + rollNumber + "        |");
        System.out.println("|________________________________|");
        System.out.println("|    Subject     :   Marks       |");
        System.out.println("|________________________________|");
        System.out.println("|    Math        :     " + mathsMark + "       |");

        System.out.println("|    Science     :    " + scienceMark + "     |");

        System.out.println("|    English     :     " + englishMark + "    |");


        System.out.println("|________________________________|");
        int total = mathsMark + scienceMark + englishMark;
        System.out.println("|   Total        :" + total + "            |");
        System.out.println("|________________________________|");
        double percentage = total / 3;
        System.out.println("|________________________________|");
        System.out.println("|   Percentage   :" + percentage + "           |");
        String result = passOrFail(percentage);
        System.out.println("|   Result       :" + result + "           |");
        String grade = resultGrade(percentage);
        System.out.println("|   Grade        :" + grade + "              |");
        System.out.println("|________________________________|");
    }

    public String passOrFail(double percentage) {
        boolean isPass = percentage >= 35;
        if (isPass) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public String resultGrade(double percentage) {
        boolean isGrade80 = percentage >= 80;
        boolean isGrade60 = percentage >= 60;
        boolean isGrade50 = percentage >= 50;
        boolean isGrade35 = percentage >= 35;

        if (isGrade80) {
            return "A+";
        } else if (isGrade60) {
            return "A";
        } else if (isGrade50) {
            return "B";
        } else if (isGrade35) {
            return "C";
        }
        return "Fail";
    }
}




