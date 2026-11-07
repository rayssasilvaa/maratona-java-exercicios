package aula.maratonajava.javacore.ZZBcomportamento.test;

import aula.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Blue", 2011), new Car("Blue", 2023));

    private static List<Car> filterCar(List<Car> cars, String color){
        List<Car> carsByColor = new ArrayList<>();

        for (Car c : cars){
            if (c.getColor().equalsIgnoreCase(color)){
                carsByColor.add(c);
            }
        }

        return carsByColor;
    }

    private static List<Car> filterCarYear(List<Car> cars, int year){
        List<Car> carsByYear = new ArrayList<>();

        for (Car c : cars){
            if (c.getYear() < year){
                carsByYear.add(c);
            }
        }

        return carsByYear;
    }

    public static void main(String[] args) {
        System.out.println(filterCar(cars, "blue"));
        System.out.println(filterCarYear(cars, 2020));
    }
}
