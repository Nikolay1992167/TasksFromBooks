package books_java_leetcode.number_processing;

import java.util.Scanner;

public class TheLongestSequenceOfUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLIne = input.nextLine();
        char[] charArray = inputLIne.toCharArray();
        int max = 0;
        int result = 0;
        for (char ch:charArray) {
            if (ch == '1') {
                result++;
            } else {
                if (result > max) {
                    max = result;
                }
                result = 0;
            }
        }
        System.out.println(result);
    }
}
