
/*
Перед решением прочтите https://www.codeflow.site/ru/article/java-buffered-reader
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Модернизация ПО
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> cityList = new ArrayList<>();      // Создание коллекции городов
        List<String> familyList = new ArrayList<>();    // Создание коллекции фамилий

        while (true) {
            String city = reader.readLine();    // Вводим город
            if (city.isEmpty()) {               // Если город не ввели, прерываем цикл добавления городов и фамилий в коллекции
                break;
            }
            String family = reader.readLine();  // Вводим фамилию
            cityList.add(city);                 // Введённый город добавляется в коллекцию городов
            familyList.add(family);             // Введённая фамилия добавляется в коллекцию фамилий
        }

        // Счирывание города
        String neededCity = reader.readLine();     // Ввод нужного города

        // Выуживание из коллекции фамилий фамилию, под номером элемента, соответствующего номеру элемента введённого города в коллекции городов
        String familyName = familyList.get(cityList.indexOf(neededCity));
        System.out.println(familyName);            // Вывод фамилии
    }
}
