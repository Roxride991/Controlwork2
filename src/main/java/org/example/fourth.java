package org.example;
import java.sql.SQLOutput;
import java.util.regex.Pattern;
import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        System.out.println("Введите Id");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("#[0-9a-fA-F]{6}");
        if (pattern.matcher(input).matches()) {
            System.out.println(input + " - Правильный");
        } else {
            System.out.println(input + " - Неправильный");
        }

    }
}
