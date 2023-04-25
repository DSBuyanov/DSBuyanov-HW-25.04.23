// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package ru.geekbrains.lesson2;

import java.util.*;

public class Task_03 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Земля");
        planets.add("Венера");

        Map<String, Integer> planetCounts = new HashMap<>();
        for (String planet : planets) {
            Integer count = planetCounts.get(planet);
            if (count == null) {
                planetCounts.put(planet, 1);
            } else {
                planetCounts.put(planet, count + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : planetCounts.entrySet()) {
            String planet = entry.getKey();
            Integer count = entry.getValue();
            System.out.println(planet + ": " + count);
        }
    }
    
}
