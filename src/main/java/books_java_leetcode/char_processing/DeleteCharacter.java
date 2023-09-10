package books_java_leetcode.char_processing;

import java.util.stream.Collectors;

public class DeleteCharacter{
    public static void main(String[] args) {
        String s = deleteCharacter("My name is NIkolay!", 'a');
        System.out.println(s);
    }
    public static String deleteCharacter(String line, char ch){
       StringBuilder builder = new StringBuilder();
       char [] chars = line.toCharArray();
       for (char element:chars){
           if (element!=ch){
               builder.append(element);
           }
       }
       return builder.toString();
    }
}
