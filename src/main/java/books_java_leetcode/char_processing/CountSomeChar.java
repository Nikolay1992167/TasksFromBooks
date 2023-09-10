package books_java_leetcode.char_processing;

public class CountSomeChar {

    public static long countOccurrencesOfACertainZCharacter(String line, char ch){
        return line.chars().filter(n -> n == ch).count();
    }

    public static void main(String[] args) {
        System.out.println(countOccurrencesOfACertainZCharacter("Parallelogram",'a'));
    }
}
