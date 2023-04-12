// Дан следующий код, исправьте его там, где требуется (задание 3)

package ru.geekbrains.lesson2;


public class task_03 {

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[2] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Ошибка: деление на ноль!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива!");
        } catch (Exception ex) {
            System.out.println("Файл не найден!");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
