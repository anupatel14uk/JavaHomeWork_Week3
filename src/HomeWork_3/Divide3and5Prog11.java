package HomeWork_3;
/*Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
public class Divide3and5Prog11 {

    public static void main(String[] args) {
        Divide3and5Prog11 divide3and5Prog11 = new Divide3and5Prog11();
        divide3and5Prog11.divide3and5();
    }

    private void divide3and5() {
        for (int i = 0; i < 100; ++i) {
            boolean divideByThree = i % 3 == 0;
            if (divideByThree) {
                System.out.println("Number divide by 3 " + i);
            }
        }

        for (int i = 0; i < 100; ++i) {
            boolean divideByFive = i % 5 == 0;
            if (divideByFive) {
                System.out.println("Number divide by 5 " + i);
            }
        }
    }
}
