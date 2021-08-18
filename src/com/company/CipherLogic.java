package com.company;
import java.util.Scanner;

public class CipherLogic {

    CharacterSearch characterSearch = new CharacterSearch();
    ReplacingCharacter replacingCharacter = new ReplacingCharacter();

    StringBuilder encryptedText = new StringBuilder();
    StringBuilder decryptedText = new StringBuilder();

    char changedChar;
    char currentChar;
    int encryptionKey;

    String inTextNext;
    Scanner inText = new Scanner(System.in);

    public void writeTheEncryptedText() {

        inTextNext = inText.nextLine();
        while (!inTextNext.equals("")) {
            encryptedText.append(inTextNext);
            inTextNext = inText.nextLine();
        }
    }

    public void sendTextForDecryption() {

        for (int i = 0; i < encryptedText.length(); i++) {
            currentChar = encryptedText.charAt(i);
            decryptTheText(currentChar);
        }
    }

    public void decryptTheText (char currentChar) {

        int symbolIndexCapital = characterSearch.findTheCapitalLetter(currentChar);
        int symbolIndexSmall = characterSearch.findTheSmallLetter(currentChar);
        int symbolIndexMarks = characterSearch.findThePunctuationMarks(currentChar);

        if (symbolIndexCapital != -1) {
            changedChar = replacingCharacter.replaceTheCapitalLetter(symbolIndexCapital, encryptionKey);
            decryptedText.append(changedChar);
        }
        if (symbolIndexSmall != -1) {
            changedChar = replacingCharacter.replaceTheSmallLetter(symbolIndexSmall, encryptionKey);
            decryptedText.append(changedChar);
        }
        if (symbolIndexMarks != -1) {
            decryptedText.append(currentChar);
        }
    }

}
