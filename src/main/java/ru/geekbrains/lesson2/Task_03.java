// Посчитайте сколько драгоценных камней в куче обычных камней.

package ru.geekbrains.lesson2;

// import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";

        String result = countGemstones(jewels, stones);
        System.out.println(result);
    }

    public static String countGemstones(String jewels, String stones) {
        int[] count = new int[64]; // массив для подсчета количества камней каждого типа

        // перебираем все камни и увеличиваем соответствующий счетчик
        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            count[c - 'A']++;
        }

        // перебираем все драгоценные камни и добавляем количество их вхождений
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            result.append(c);
            result.append(count[c - 'A']);
        }

        return result.toString();
    }
    
}
