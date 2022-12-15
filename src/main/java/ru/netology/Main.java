package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int max = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        for(int i = 0; i < size; i++) {
            list.add(random.nextInt(max));
        }
        System.out.println("Вот случайный список: " + list);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int f = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(list);

        logger.log("Прошло фильтр " + result.size() + " элемента из " + list.size());

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);

        logger.log("Завершаем программу");
    }
}