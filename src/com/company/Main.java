package com.company;

public class Main {

    public static void main(String[] args) {

        CipherLogic cipherLogic = new CipherLogic();

        System.out.println("Введите зашифрованный текст:");
        cipherLogic.writeTheEncryptedText();
        for (int i = 0; i < 34; i++) {
            cipherLogic.encryptionKey = i;
            System.out.println();
            System.out.println("Расшифрованный текст со сдвигом " + i + ":");
            cipherLogic.sendTextForDecryption();
            System.out.println(cipherLogic.decryptedText.toString());
            cipherLogic.decryptedText.setLength(0);
        }
    }
}
