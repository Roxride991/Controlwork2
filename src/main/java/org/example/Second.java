package org.example;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        int maxLength = findLongest(input);
        System.out.println("Длина наибольшей последовательности: " + maxLength);
    }

    private static int findLongest(String str) {
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((int) str.charAt(i) < (int) str.charAt(i + 1)) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            }
        }
        maxLength = Math.max(maxLength, currentLength);
                return maxLength + 1;
    }
}



