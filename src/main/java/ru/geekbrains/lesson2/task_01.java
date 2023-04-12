// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
// необходимо повторно запросить у пользователя ввод данных.

package ru.geekbrains.lesson2;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        float input = readFloatFromConsole();
        System.out.println("Вы ввели число: " + input);
    }

    private static float readFloatFromConsole() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Введите дробное число: ");
                try {
                    float input = Float.parseFloat(scanner.nextLine());
                    return input;
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели некорректное значение, попробуйте еще раз");
                }
            }
        }
    }
    
}
