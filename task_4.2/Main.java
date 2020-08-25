/*
Создай классы Dog, Cat, Mouse.
Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри.
Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse("Jerry", 12 , 5),
где 12 - высота в см,
5 - длина хвоста в см.
Требования:
•	Создай класс Dog.
•	Создай класс Cat.
•	В классе Dog должно быть три переменные.
•	В классе Cat должно быть три переменные.
•	Должен быть создан хотя бы один объект типа Mouse.
•	Должен быть создан хотя бы один объект типа Dog.
•	Должен быть создан хотя бы один объект типа Cat.
*/

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Джерри", 12, 5);
        Mouse jerryFriendMouse = new Mouse("Пикси", 10, 4);
        Dog bigBully = new Dog("Бульдог", 10, "Кость");
        Dog miniDog = new Dog("Такса", 1, "Объедки");
        Cat tomCat = new Cat("Том", "Синий", bigBully);
        Cat tomGirlCat = new Cat("Киска", "Белый", bigBully);

        // System.out.println(tomCat.enemy.favMeal);
    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
class Cat {
    String name;
    String color;
    Dog enemy;

    public Cat(String name, String color, Dog enemy) {
        this.name = name;
        this.color = color;
        this.enemy = enemy;
    }
}

class Dog {
    String breed;
    int evilLevel;
    String favMeal;

    public Dog(String breed, int evilLevel, String favMeal) {
        this.breed = breed;
        this.evilLevel = evilLevel;
        this.favMeal = favMeal;
    }
}
