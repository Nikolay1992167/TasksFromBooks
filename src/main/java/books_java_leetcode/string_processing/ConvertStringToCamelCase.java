package books_java_leetcode.string_processing;

public class ConvertStringToCamelCase {
    public static String toCamelCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-' || c == '_') {
                i++;
                if (i < s.length() && Character.isLetter(s.charAt(i))) {
                    result.append(Character.toUpperCase(s.charAt(i)));
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] inputs = {"the-stealth-warrior", "The_Stealth_Warrior", "A-B-C"};
        for (String input : inputs) {
            String result = toCamelCase(input);
            System.out.println(result);
        }
    }
}
