package org.example;

public class StringHandler {

    public static StringBuffer removeWords(String text, int lengthToRemove) {

        StringBuffer result = new StringBuffer();

        String vowels = "AEIOUYaeiouy";

        StringBuffer currentWord = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);
            if (!Character.isWhitespace(c)) {
                currentWord.append(c);

            } else {
                if (currentWord.length() != lengthToRemove || vowels.indexOf(currentWord.charAt(0)) != -1) {
                    result.append(currentWord).append(" ");
                }
                currentWord.setLength(0);
            }
        }

        if (!currentWord.isEmpty()) {
            if (currentWord.length() != lengthToRemove || vowels.indexOf(currentWord.charAt(0)) != -1) {
                result.append(currentWord);
            }
        }

        return result;
    }
}