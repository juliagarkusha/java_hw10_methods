package app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Введіть ціле число: ");
        int number = scanner.nextInt();
        double square = calculateSquare(number);
        System.out.println("Квадрат числа " + number + " " + "дорівнює " + square + ".");
        System.out.println();

        double radius = 3.5;
        double height = 10.0;
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("2. Об'єм циліндра з радіусом "
                + radius + " і висотою " + height + " дорівнює " + volume + ".");
        System.out.println();

        int[] numbers = {10, 20, 30, 40, 50};
        int sum = calculateArraySum(numbers);
        System.out.println("3. Масив чисел " + Arrays.toString(numbers));
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");
        System.out.println();

        scanner.nextLine();
        System.out.print("4. Введіть рядок: ");
        String originalString = scanner.nextLine();
        String reversedString = reverseString(originalString);
        System.out.println("Рядок в зворотньому порядку: " + reversedString);
        System.out.println();

        int baseNumber = 2;
        int power = 3;
        int powerResult = power(baseNumber, power);
        System.out.println("5. " + baseNumber + "^" + power + " = " + powerResult);
        System.out.println();

        System.out.print("6. Введіть ціле число n: ");
        int iterations = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String text = scanner.nextLine();
        repeatText(iterations, text);
    }

    public static double calculateSquare(int number) {
        return Math.pow(number, 2);
    }

    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static int calculateArraySum(int[] array) {
        int sum = 0;

        for (int item : array) {
            sum += item;
        }

        return sum;
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return a * power(a, b - 1);
    }

    public static void repeatText(int iterations, String text) {
        for (int i = 0; i < iterations; i++) {
            System.out.println(text);
        }
    }
}
