
/*
Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();
*/

public class Main{
    public static void main(String[] args) {
        Horse horse = new Horse(4, false, "Бурый");
        horse.run();
        Pegasus pegasus = new Pegasus(4, false, "Белый", true);
        pegasus.fly();
    }
}

abstract class Animal {
    int paws;
    boolean blind;
    String color;

    public Animal(int paws, boolean blind, String color) {
        this.paws = paws;
        this.blind = blind;
        this.color = color;
    }
}

class Horse extends Animal {
    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }

    public Horse(int paws, boolean blind, String color) {
        super(paws, blind, color);
    }
}

class Pegasus extends Horse {
    boolean wings;
    public void fly() {
        System.out.println("Игого, я полетел(а)");
    }

    public Pegasus(int paws, boolean blind, String color, boolean wings) {
        super(paws, blind, color);
        this.wings = wings;
    }
}
