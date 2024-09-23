package org.example;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String inputText = scanner.nextLine();

        String[] words = inputText.split("\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith("А")) {
                words[i] = "а" + words[i].substring(1);
                count++;
            }
        }
        String result = String.join(" ", words);
        System.out.println("Измен текст: " + result);
        System.out.println("Начинающихся на 'а': " + count);
    }
}