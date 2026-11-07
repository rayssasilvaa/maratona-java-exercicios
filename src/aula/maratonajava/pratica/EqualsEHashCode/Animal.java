package aula.maratonajava.pratica.EqualsEHashCode;

public class Animal {
    private String animal;
    private String color;
    private int age;

    public Animal(String animal, String color, int age) {
        this.animal = animal;
        this.color = color;
        this.age = age;
    }


    public String getAnimal() {
        return animal;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void animalSpecie() {
        System.out.println("The animal is: ");
    }

    public void animalColor() {
        System.out.println("Animal color: ");
    }

    public void animalAge() {
        System.out.println("Age animal: ");
    }
}

class Cat extends Animal {
    public Cat(String animal, String color, int age) {
        super(animal, color, age);
    }

    @Override
    public void animalSpecie() {
        System.out.println("The animal is: " + getAnimal());
    }

    @Override
    public void animalColor() {
        System.out.println("The animal color is: " + getColor());
    }

    @Override
    public void animalAge() {
        System.out.println("The animal age is: " + getAge());
    }
}

class Dog extends Animal {
    public Dog(String animal, String color, int age) {
        super(animal, color, age);
    }

    @Override
    public void animalSpecie() {
        System.out.println("The animal is: " + getAnimal());
    }

    @Override
    public void animalColor() {
        System.out.println("The animal color is: " + getColor());
    }

    @Override
    public void animalAge() {
        System.out.println("The animal age is: " + getAge());
    }
}

class Main {
    public static void main(String[] args) {
        Animal a1 = new Cat("Cat", "White", 2);
        Animal a2 = new Dog("Dog", "Brown", 7);

        Animal[] animals = {a1, a2};

        for (Animal a : animals) {
            System.out.println(a.getAnimal());
            System.out.println(a.getColor());
            System.out.println(a.getAge());
        }
    }
}