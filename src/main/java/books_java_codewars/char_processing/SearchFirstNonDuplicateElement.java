package books_java_codewars.char_processing;

import java.util.LinkedHashMap;
import java.util.Map;

public class SearchFirstNonDuplicateElement {

    public static char firstNonDuplicateCharacter(String line){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            map.compute(ch,(k,v)->(v==null)?1:++v);
        }
        for (Map.Entry<Character, Integer> entry:map.entrySet()) {
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }

    public static void main(String[] args) {
        char c = firstNonDuplicateCharacter("jhhkjkjp");
        System.out.println(c);
    }


}
