package books_java_leetcode.number_processing;

import java.util.*;

public class CheckReferencesToNull {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,null,4,null,16,7, null);
        boolean b = integersContainsNulls(integers);
        System.out.println(b);


    }

    public static List<Integer> evenIntegers(List<Integer> integers){
        if(Objects.isNull(integers)){
            return Collections.emptyList();
        }
        List<Integer> actual = new ArrayList<>();

        for (Integer number:integers){
            if (Objects.nonNull(number) && number%2==0){
                actual.add(number);
            }
        }
        return actual;
    }

    public static int sumIntegers(List<Integer> integers){
        if (Objects.isNull(integers)){
            throw new IllegalArgumentException("List cannot be null!");
        }
        return integers.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue).sum();
    }

    public static boolean integersContainsNulls(List<Integer> integers){
        if (Objects.isNull(integers)){
            return false;
        }
        return integers.stream()
                .anyMatch(Objects::isNull);
    }
}
