package com.company;

public class ReplacingCharacter {

    String capitalLetter = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    String smallLetter = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public char replaceTheCapitalLetter(int index, int encryptionKey) {

        return capitalLetter.charAt((index + encryptionKey) % 33);
    }

    public char replaceTheSmallLetter(int index, int encryptionKey) {

        return smallLetter.charAt((index + encryptionKey) % 33);
    }
}
