package HomeWork_3;
/*Write a Java program to calculate the average value of array elements.
 */

public class AvgArrayProg19 {
    public static void main(String[] args) {
        AvgArrayProg19 avgArrayProg19 = new AvgArrayProg19();
        avgArrayProg19.avg();
    }

    private void avg() {

        int[] numericArray = {1, 2, 3, 4, 5};
        int result = 0;
        for (int temp : numericArray) {
            result = result + temp;
        }

        double avg = result/5;

        System.out.println("Avg =" + avg);

    }
}

