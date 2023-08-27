package books_java_codewars.string_processing;

public class RemoveSpaces {
    public static String remove(String line){
        return line.replaceAll("\\s","");
    }

    public static void main(String[] args) {
        System.out.println(remove("Hello world! My name Nikolay"));
    }
}
