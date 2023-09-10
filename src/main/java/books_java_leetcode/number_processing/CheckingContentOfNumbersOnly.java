package books_java_leetcode.number_processing;

public class CheckingContentOfNumbersOnly {

    public static boolean containsOnlyDigitsOne(String line){
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isDigit(line.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigits(String line){
        return line.chars().allMatch(Character::isDigit);
    }

    public static void main(String[] args) {
        boolean result = containsOnlyDigitsOne("1234");
        System.out.println(result);
    }
}
