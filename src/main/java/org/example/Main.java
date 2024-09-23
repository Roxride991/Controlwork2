import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ввод строки
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        String Pattern = "^[+-]?\\d*\\.\\d+$|^[+-]?\\d+\\.\\d*$";

        if (input.matches(Pattern)) {
            String[] parts = input.split("\\.");
            String Part1 = parts[0].replaceAll("[+-]", "");
            String fractionalPart = parts[1];
            int Digits = Part1.length();
            int fractionalDigits = fractionalPart.length();
            System.out.println("Количество знаков в целой части: " + Digits);
            System.out.println("Количество знаков в дробной части: " + fractionalDigits);
        } else {
            System.out.println("Строка не является десятичным числом.");
        }
    }
}
