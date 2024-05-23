public class sum_array {
    public static void main(String[] args) {
        int[] array = { 2, 4, 23, 1, 65, 88, 43 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.err.println("the sum of array is:" + sum);

    }
}