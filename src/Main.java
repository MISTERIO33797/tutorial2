import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};
        System.out.println(Arrays.toString(rotateArray(array1, 2)));
        System.out.println(Arrays.toString(rotateArray(array2, 3)));
    }

    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0) return array;

        positions = positions % n;
        if (positions == 0) return array;
        reverse(array, 0, n - 1);
        reverse(array, 0, positions - 1);
        reverse(array, positions, n - 1);

        return array;
    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}