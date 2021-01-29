package StringEditor;

public class StringEditor {
    public static String ReplaceSymbol(String input, int k, char Symbol){
        String[] InputSplitByWords = input.split(" ");
        StringBuilder output = new StringBuilder(); //Перевожу строку в stringbuilder чтобы ее можно было изменять

        for( String words : InputSplitByWords) {
            StringBuilder word = new StringBuilder(words);
            if (k < input.length()) {
                word.setCharAt(k, Symbol);
            }
            output.append(word);

        }
        String OutputAsString = output.toString();

        return OutputAsString;
    }
}
