package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(java.lang.String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        String saturn = new String("Сатурн");
        String uranus = new String("Уран");
        String neptune = new String("Нептун");
        //создаем два списка, один из которых не модифицируемый
        List<String> solarSystemPart1 = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars)));
        ArrayList<String> solarSystemPart2 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));
        System.out.println(solarSystemPart1);
        System.out.println(solarSystemPart2);
        solarSystemPart2.add("Плутон");
        System.out.println("добавляем новый эелемент: "+solarSystemPart2);
        solarSystemPart2.remove("Плутон");
        System.out.println("удаляем эелемент: "+solarSystemPart2);
        solarSystemPart2.set(1,"Плутон");
        System.out.println("Заменяем эелемент: "+solarSystemPart2);
        Collections.shuffle(solarSystemPart2);
        System.out.println("перемешиваем эелементы: "+solarSystemPart2);
        System.out.println("выведем индекс планеты Юпитер: "+solarSystemPart2.indexOf(jupiter));
        System.out.println("Находится ли в списке Нептун: " + solarSystemPart2.contains(neptune));
        Collections.swap(solarSystemPart2, solarSystemPart2.indexOf(neptune), solarSystemPart2.indexOf(uranus));
        System.out.println("Меняем местами Уран и Нептун: "+solarSystemPart2);
    }
}