
/*1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();    // Вводим имя файла

            FileReader fileReader = new FileReader(fileName);       // Читаем из файла, введённого ранее            
            int c;
            String numbers = "";
            while ((c = fileReader.read()) != -1) {
                numbers += (char) c;
            }
            String[] numbersArrayStr = numbers.split("\n");    // Добавление чисел в строке в массив, считывая построчно, т.е. с переносом строки
            List<Integer> listOfNumbers = new ArrayList<>();       // Создание коллекции
            for (int i = 0; i < numbersArrayStr.length; i++) {      // Добавление чётных цифр из массива в коллекцию, конвертиря их в инт и удаляя пробелы до и после
                if (Integer.parseInt(numbersArrayStr[i].trim()) % 2 == 0)
                    listOfNumbers.add(Integer.parseInt(numbersArrayStr[i].trim()));
            }
            Collections.sort(listOfNumbers);    // Сортируем элементы в коллекции по возрастанию
            for (int i = 0; i < listOfNumbers.size(); i++) {    // Выводим цифры в коллекции столбиком
                System.out.println(listOfNumbers.get(i));
            }
        }
       catch (Exception e) {
           e.printStackTrace();
       }
    }
}



