// Если необходимо, исправьте данный код (задание 2)

package ru.geekbrains.lesson2;

public class task_02 {
    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e);
        } catch (NullPointerException e) {
            System.out.println("Catching NullPointerException: " + e);
        }
    }
}
