package books_java_leetcode.number_processing;

public class SumNumbersInInterval {
    public static int getSum(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum(-5,-1));
    }
}
