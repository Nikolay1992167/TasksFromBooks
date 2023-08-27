package books_java_codewars.char_processing;

import java.util.HashSet;
import java.util.Set;

public class GeneratingPermutations {
    private static Set<String> permuteAndStore(String prefix, String line){
        Set<String> permutations = new HashSet<>();
        int n = line.length();
        if (n==0){
            permutations.add(prefix);
        }else {
            for (int i = 0; i < n; i++) {
                permutations.addAll(permuteAndStore(prefix+line.charAt(i), line.substring(i+1, n)+line.substring(0,i)));
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        Set<String> test = permuteAndStore("", "TEST");
        System.out.println(test);
    }
}
