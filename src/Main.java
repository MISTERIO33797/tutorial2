import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 2, 2};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {5, 5, 5, 1};
        System.out.println(findDominant(array1));
        System.out.println(findDominant(array2));
        System.out.println(findDominant(array3));
    }

    public static int findDominant(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = array.length;
        int threshold = n / 2;
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > threshold) {
                return num;
            }
        }
        return -1;
    }
}