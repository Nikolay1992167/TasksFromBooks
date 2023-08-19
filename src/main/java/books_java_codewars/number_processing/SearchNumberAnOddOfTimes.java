package books_java_codewars.number_processing;

public class SearchNumberAnOddOfTimes {
    public static int findIt(int[] array) {
        int res = 0;
        for (int num : array) {
            res = res ^ num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 3};
        System.out.println("Число, встречающееся нечетное число раз: " + findIt(arr));
    }
}
