package HomeWork_3;
/*Write a Java program to test if an array contains a specific value.
 */


public class ArrayContains20 {
    public static void main(String[] args) {
        ArrayContains20 arrayContains20 = new ArrayContains20();
        arrayContains20.isContains();
    }

    private void isContains() {
        int[] numericArray = {1, 2, 3, 4, 5};
        for (int temp : numericArray) {
            if(temp == 3){
                System.out.println("3 is available in array");
            }
        }
    }
}
