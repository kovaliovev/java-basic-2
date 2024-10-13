package org.example;

public class Main {

    public static void main(String[] args) {
        String inputText = "This is an example of text entered by user that needs processing";

        int wordToRemoveLength = 4;

        StringBuffer result = StringHandler.removeWords(inputText, wordToRemoveLength);

        System.out.println("Original text: " + inputText);
        System.out.println("Formatted text: " + result);
    }
}