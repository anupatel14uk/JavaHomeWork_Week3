package HomeWork_3;
/*Write a Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;

public class SortProg17 {

    public static void main(String[] args) {
        SortProg17 sortProg17 = new SortProg17();
        sortProg17.sortNumberic();
        sortProg17.sortString();
    }

    private void sortString() {
        String[] stringsArray = {"C", "D", "A", "E", "B"};
        Arrays.sort(stringsArray);

        System.out.println("Sorted String Array ");
        for (String temp : stringsArray) {
            System.out.println(temp);
        }
    }

    private void sortNumberic() {

        int[] numericArray = {5, 4, 1, 2, 3};
        Arrays.sort(numericArray);

        System.out.println("Sorted Numeric Array ");
        for (int temp : numericArray) {
            System.out.println(temp);
        }
    }
}
