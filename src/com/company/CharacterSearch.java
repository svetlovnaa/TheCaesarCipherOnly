package com.company;

public class CharacterSearch {

    String capitalLetter = new String("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ");
    String smallLetter = new String( "абвгдеёжзийклмнопрстуфхцчшщъыьэюя");
    String punctuationMarks = ",. ";

    public int findTheCapitalLetter(char currentChar) {

        for (int i = 0; i < capitalLetter.length(); i++) {
            if (capitalLetter.charAt(i) == currentChar) {
                return i;
            }
        }
        return -1;
    }

    public int findTheSmallLetter(char currentChar) {

        for (int i = 0; i < smallLetter.length(); i++) {
            if (smallLetter.charAt(i) == currentChar) {
                return i;
            }
        }
        return -1;
    }

    public int findThePunctuationMarks(char currentChar) {

        return punctuationMarks.indexOf(currentChar);
    }
}
