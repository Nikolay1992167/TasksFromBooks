package books_java_leetcode.number_processing;

public class CheckPIN {
    public static boolean validatePin(String pin) {
        if (pin.isEmpty() || !pin.matches("\\d+")) {
            return false;
        }
        return pin.length() == 4 || pin.length() == 6;
    }

    public static void main(String[] args) {
        boolean result = validatePin("122445");
        System.out.println(result);
    }
}
