package books_java_codewars.char_processing;

public class CountXorO {
    public static boolean countingChar(String line) {
        long countX = line.chars().filter(n -> (n == 'x' || n == 'X')).count();
        long countY = line.chars().filter(n -> (n == 'o' || n == 'O')).count();
        if (countX == 0 && countY == 0) {
            return true;
        }
        if (countX == countY) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(countingChar("Xxxx"));
    }
}
