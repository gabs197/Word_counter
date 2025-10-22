package com.example.wordcounter;

public class Counter {

    public int countWords(String txtInput) {
        if (txtInput == null || txtInput.isEmpty()) {
            return 0;
        }
        String[] words = txtInput.trim().split(" ");
        return words.length;
    }

    public int countCharacters(String txtInput) {
        if (txtInput == null || txtInput.isEmpty()) {
            return 0;
        }
        return txtInput.length();
    }

}
