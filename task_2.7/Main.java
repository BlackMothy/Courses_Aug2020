/*
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
Пример:
Метод sumDigitsInNumber вызывается с параметром 546.
Пример вывода:
15
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }
    
    public static int sumDigitsInNumber(int number) {
        int firstDigit = (number - number % 100) / 100;
        int secondDigit = (number % 100 - number % 10) / 10;
        int thirdDigit = number % 10;
        return firstDigit + secondDigit + thirdDigit;
    }
}

