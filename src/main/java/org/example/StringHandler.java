package org.example;
import java.util.StringTokenizer;

public class StringHandler {

    public static StringBuffer removeWords(String text, int lengthToRemove) {

        StringBuffer result = new StringBuffer();

        String vowels = "AEIOUYaeiouy";

        StringTokenizer tokenizer = new StringTokenizer(text);

        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();

            if (word.length() == lengthToRemove && vowels.indexOf(word.charAt(0)) == -1) {
                continue;
            }

            result.append(word).append(" ");
        }

        if (!result.isEmpty()) result.deleteCharAt(result.length() - 1);
        return result;
    }
}