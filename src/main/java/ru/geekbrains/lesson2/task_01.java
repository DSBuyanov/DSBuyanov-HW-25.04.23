// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.


package ru.geekbrains.lesson2;

public class task_01 {
    public static void main(String[] args) {
        String s = "dcba";
        int[] index = { 3, 2, 1, 0 };
        String result = shuffle(s, index);
        System.out.println(result); // "abc"
    }

    public static String shuffle(String s, int[] index) {
        if (s == null || index == null || s.length() != index.length) {
            throw new IllegalArgumentException("Некорректный ввод данных");
        }
        char[] shuffled = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int newIndex = index[i];
            if (newIndex < 0 || newIndex >= s.length()) {
                throw new IllegalArgumentException("Некорректный ввод данных");
            }
            shuffled[newIndex] = s.charAt(i);
        }
        return new String(shuffled);
    }
}

