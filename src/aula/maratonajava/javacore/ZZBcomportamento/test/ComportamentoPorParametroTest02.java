package aula.maratonajava.javacore.ZZBcomportamento.test;

import aula.maratonajava.javacore.ZZBcomportamento.domain.Car;
import aula.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("Blue", 2011), new Car("Blue", 2023));

    public static void main(String[] args) {
        List<Car> blueCars = filterCar(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("blue");
            }
        });
        System.out.println(blueCars);

        //lambda
        blueCars = filterCar(cars, car -> car.getColor().equalsIgnoreCase("blue"));
        System.out.println(blueCars);
    }

    private static List<Car> filterCar(List<Car> cars, CarPredicate carPredicate){
        List<Car> carsByColor = new ArrayList<>();

        for (Car c : cars){
            if (carPredicate.test(c)){
                carsByColor.add(c);
            }
        }

        return carsByColor;
    }
}
