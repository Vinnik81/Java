import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a1");
        list.add("a4");
        list.add("a5");
        list.add("a1");

        System.out.println("Введите номер задачи:\n" +
                "1) Дана коллекция строк а1,а2,а3,а1,a4,a5,a1 вернуть количество вхождений объекта a1 с помощью StreamApi\n" +
                "2) Найти элемент в коллекции равный а3 или вывести ошибку\n" +
                "3) Вернуть последний элемент коллекции или empty если коллекция пуста\n" +
                "4) Вернуть 2 элемента начиная со второго элемента коллекции\n" +
                "5) Из коллекции имен убрать все повторение и найти среднюю длину имен\n" +
                "6) Отсортировать коллекцию строк по убыванию и убрать дубликаты\n" +
                "7) Вернуть сумму нечетных чисел или 0\n");

        Scanner scanner = new Scanner(System.in);
        int task = scanner.nextInt();

        while (true) {
            switch (task) {
                case 1:
                    //1) Дана коллекция строк а1,а2,а3,а1,a4,a5,a1 вернуть количество вхождений объекта a1 с помощью StreamApi
                    long result_1 = list.stream().filter(x -> x.equals("a1")).count();
                    System.out.println("Количество вхождений объекта a1: " + result_1);
                    break;
                case 2:
                    //2) Найти элемент в коллекции равный а3 или вывести ошибку
                    String element = list.stream()
                            .filter(x -> x.equals("a3"))
                            .findFirst()
                            .orElseThrow(() -> new RuntimeException("Элемент а3 не найден в коллекции"));
                    System.out.println("Найденный элемент: " + element);
                    break;
                case 3:
                    //3) Вернуть последний элемент коллекции или empty если коллекция пуста
                    Optional<String> lastElement = list.stream().reduce((x, y) -> y);
                    String result_3 = lastElement.orElse("Коллекция пуста(empty)");
                    System.out.println("Последний элемент коллекции: " + result_3);
                    break;
                case 4:
                    //4) Вернуть 2 элемента начиная со второго элемента коллекции
                    List<String> result_4 = list.stream()
                            .skip(1)
                            .limit(2)
                            .collect(Collectors.toList());
                    System.out.println("2 элемента начиная со второго элемента коллекции: " + result_4);
                    break;
                case 5:
                    //5) Из коллекции имен убрать все повторение и найти среднюю длину имен
                    double result_5 = list.stream()
                            .distinct()
                            .mapToInt(x -> x.length())
                            .average()
                            .orElse(0.0);
                    System.out.println("Средняя длина имен: " + result_5);
                    break;
                case 6:
                    //6) Отсортировать коллекцию строк по убыванию и убрать дубликаты
                    List<String> result_6 = list.stream()
                            .sorted((x, y) -> y.compareTo(x))
                            .distinct()
                            .collect(Collectors.toList());
                    System.out.println("Отсортированная коллекция строк по убыванию и без дубликатов: " + result_6);
                    break;
                case 7:
                    //7) Вернуть сумму нечетных чисел или 0
                    int result_7 = list.stream()
                            .mapToInt(x -> Integer.parseInt(x.substring(1)))
                            .filter(x -> x % 2 != 0)
                            .sum();
                    if (result_7 != 0) {
                        System.out.println("Сумма нечетных чисел: " + result_7);
                    } else {
                        System.out.println("Сумма нечетных чисел: 0");
                    }
                    break;
                default:
                    System.out.println("Такой задачи нет");
            }
            System.out.println("Введите номер задачи или любую клавишу кроме цифр для завершения работы");
            if (scanner.hasNextInt()) {
                task = scanner.nextInt();
            } else {
                break;
            }
        }
    }
}