package books_java_leetcode.number_processing;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 15);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] twoSum(int[] array, int number){
        int [] output = new int[2];
        for (int i =0; i< array.length;i++){
            for (int j = i+1; j < array.length; j++) {
                int result = array[i]+array[j];
                if (result == number){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
    }
}
