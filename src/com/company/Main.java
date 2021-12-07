package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here



//        Car деген класс тузунуз (Id, номер авто)
//        Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
//        HashMap тузунуз ключ - машина, маани - машинанын данныйлары
//        HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.

        Map<Car,Porsche>car=new HashMap<>();
        car.put(new Car(1, 758),
                new Porsche(2020,2015," ♥♥♥ Porsche ♠♠♠ ",30000000," ♠♠♠ Чорный ♥♥♥ "));
        car.put(new Car(1,306),
                new Porsche(2013,2001," *** Kadilak *** ",1000000," ♥♥♥ Серый ♥♥♥ "));
        car.put(new Car(3,446),
                new Porsche(2017,2008,"♦♦♦AUDI♣♣♣",105000,"☺☺☺Красный☻☻☻"));
        car.put(new Car(4,566),
                new Porsche(2000,2003,"◘◘◘Kia○○○",700000,"○○○серый◘◘◘"));
       for (Map.Entry iterate:car.entrySet()){
           System.out.println(iterate.getKey()+"\n"+iterate.getValue());
       }










    }
}
