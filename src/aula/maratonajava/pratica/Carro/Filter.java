package aula.maratonajava.pratica.Carro;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    private static List<Car> cars = List.of(
            new Car("Ferrari 488", "Red", 2018),
            new Car("Lamborghini Huracan", "Blue", 2021),
            new Car("Porsche 911 GT3", "White", 2021),
            new Car("McLaren 720S", "Yellow", 2012),
            new Car("Chevrolet Corvette", "Red", 2019),
            new Car("Audi R8", "Black", 2016),
            new Car("Ford GT", "Blue", 2024),
            new Car("Bugatti Chiron", "Blue", 2018),
            new Car("Ferrari LaFerrari", "Red", 2026),
            new Car("Lamborghini Aventador", "White", 2012)
    );

    public static List<Car> filterByColor(List<Car> cars, String color) {
        List<Car> carsColor = new ArrayList<>();

        for (Car c : cars) {
            if (c.getColor().equalsIgnoreCase(color)) {
                carsColor.add(c);
            }
        }

        return carsColor;
    }


    public static List<Car> filterByYear(List<Car> cars, int years) {
        List<Car> carsYear = new ArrayList<>();

        for (Car c : cars) {
            if (c.getYear() == years) {
                carsYear.add(c);
            }
        }

        return carsYear;
    }


        public static void main(String[] args) {
            System.out.println(filterByColor(cars, "Red"));
            System.out.println();
            System.out.println(filterByYear(cars, 2012));
        }
    }


