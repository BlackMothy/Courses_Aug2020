package task41;

/*Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Нужно сравнить каждый критерий по отдельности, и победителем будет тот, у которого больше "победивших" критериев.
Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Если ничья и никто не выиграл, возвращаем либо true либо false, но должно выполняться условие:
если cat1.fight(cat2) возвращает true,
то cat2.fight(cat1) должен возвращать false.
Требования:
•	Класс Cat должен содержать конструктор без параметров.
•	Класс Cat должен содержать всего три поля: age, weight и strength. Поля должны быть публичные.
•	В классе Cat должен быть метод fight.
•	В методе fight реализовать механизм драки котов в зависимости от их веса, возраста и силы согласно условию.
•	Метод должен возвращать одно и тоже значение, если мы деремся с одним и тем же котом.
•	Если некий кот1 выигрывает у кота кот2, то кот2 должен проигрывать коту кот1.*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {        
        }

    public boolean fight(Cat anotherCat) {
        int firstCat[] = {this.age, this.weight, this.strength};
        int secondCat[] = {anotherCat.age, anotherCat.weight, anotherCat.strength};
        int firstCatCount = 0;
        int secondCatCount = 0;
        for (int i = 0; i < firstCat.length; i++) {
            if (firstCat[i] > secondCat[i])
                firstCatCount++;
            else if (firstCat[i] < secondCat[i])
                secondCatCount++;
        }
        if (firstCatCount > secondCatCount)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        
    }
}




