import models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
/////////////// Конвеерный методы -> stream

        // Конвеерный метод filter() - фильтрация
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

      List<Integer> result =  list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(result);*/

        /*List<String> list = new ArrayList<>();
        list.add("ab1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");

        List<String> result =  list.stream().filter(n -> n.contains("b")).collect(Collectors.toList());
//        List<String> result =  list.stream().filter(n -> !n.equals("a3")).collect(Collectors.toList());
        System.out.println(result);*/

        /*List<Person> list = new ArrayList<>();
        list.add(new Person("Ivan", "Ivanov", 25));
        list.add(new Person("Petr", "Petrov", 30));
        list.add(new Person("Sidor", "Sidorov", 35));
        list.add(new Person("Igor", "Igorev", 40));
        list.add(new Person("Anton", "Antonov", 45));

        List<Person> result =  list.stream().filter(n -> n.getName().contains("va")).collect(Collectors.toList());
        System.out.println(result);*/

        // Конвеерный метод skip() - пропускает первые n элементов
        /*List<String> list = new ArrayList<>();
        list.add("ab1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");

      List<String> result =  list.stream().skip(2).collect(Collectors.toList());
        System.out.println(result);*/

        // Конвеерный метод distinct() - удаляет дубликаты
        /*List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a3");
        list.add("a4");
        list.add("a4");
        list.add("a5");
        list.add("a6");

        List<String> result =  list.stream().distinct().collect(Collectors.toList());
        System.out.println(result);*/

        // Конвеерный метод map() - преобразование элементов списка(возвращает новый список)
        /*List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");

      List<String> result =  list.stream().map(s -> s + "_changed").collect(Collectors.toList());
        System.out.println(result);*/

        // Конвеерный метод peek() - преобразование элементов списка(нет возвращаемого значения)
        /*List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");

        List<String> result =  list.stream().peek(s -> System.out.println(s)).collect(Collectors.toList());
        System.out.println(result);*/

        // Конвеерный метод limit() - ограничение количества элементов
        /*List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");

        List<String> result =  list.stream().limit(3).collect(Collectors.toList());
        System.out.println(result);*/

        // Конвеерный метод sorted() - сортировка
        /*List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a5");
        list.add("a6");

        List<String> result =  list.stream().sorted((x, y) -> y.compareTo(x)).collect(Collectors.toList());
        System.out.println(result);*/

        // Конвеерный метод mapToInt(), mapToLong(), mapToDouble() - преобразование элементов списка(возвращает новый список)
       /* List<String> list = new ArrayList<>();
        list.add("a1234");
        list.add("a2567");
        list.add("a3678");
        list.add("a4");
        list.add("a5");
        list.add("a6");

        int[] result =  list.stream().mapToInt(s -> Integer.parseInt(s.substring(1))).toArray();
        System.out.println(Arrays.toString(result));*/

        // Конвеерный метод flatMap() - преобразование элементов списка(возвращает новый список)
        /*List<String> list = new ArrayList<>();
        list.add("a, b, c, d");
        list.add("1, 2, 3, 4");
        list.add("Ivan, Oleg, Vlad");


        List<String> result =  list.stream().flatMap(s -> Arrays.stream(s.split(","))).collect(Collectors.toList());
        System.out.println(result);
        System.out.println(result.size());*/

        //////Терминальные методы -> обЪекты, массивы, коллекции, примитивы, Optional

        // Терминальный метод findFirst() - возвращает первый элемент
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Optional<Integer> result = Optional.of(list.stream().filter(n -> n % 2 != 0).findFirst().orElse(0));
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Not found");
        }*/

        // Терминальный метод findAny() - возвращает любой элемент
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Optional<Integer> result = Optional.of(list.stream().filter(n -> n > 1).findAny().orElse(0));
        if (result.isPresent()) {
            System.out.println(result.get());
        } else {
            System.out.println("Not found");
        }*/

        // Терминальный метод collect() - преобразование элементов списка (возвращает коллекцию)
        /*List<String> list = new ArrayList<>();
        list.add("a, b, c, d");
        list.add("1, 2, 3, 4");
        list.add("Ivan, Oleg, Vlad");

        List<String> result =  list.stream().flatMap(s -> Arrays.stream(s.split(","))).collect(Collectors.toList());
        System.out.println(result);*/

        ///Терминальные методы couunt() - возвращает количество элементов
        /*List<String> list = new ArrayList<>();
        list.add("a1b");
        list.add("a2");
        list.add("a3b");
        list.add("a4");
        list.add("a5b");
        list.add("a6");

        Long result =  list.stream().filter(x -> x.contains("b")).count();
        System.out.println(result);*/

       /// Терминальный метод anyMatch() - возвращает true, если хотя бы один элемент соответствует условию
       /// Терминальный метод allMatch() - возвращает true, если все элементы соответствуют условию
       /// Терминальный метод noneMatch() - возвращает true, если ни один элемент не соответствует условию
       /*List<String> list = new ArrayList<>();
        list.add("a1b");
        list.add("a2");
        list.add("a3b");
        list.add("a4");
        list.add("a5b");
        list.add("a6");

        boolean anyMatchresult =  list.stream().anyMatch((x -> x.contains("b")));
        boolean noneMatchresult =  list.stream().noneMatch(x -> x.contains("b"));
        boolean allMatchresult =  list.stream().allMatch(x -> x.contains("b"));
        System.out.println(anyMatchresult);
        System.out.println(noneMatchresult);
        System.out.println(allMatchresult);*/

        /// Терминальный метод max() - возвращает максимальный элемент
        /// Терминальный метод min() - возвращает минимальный элемент
       /* List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("z");


        String maxresult = String.valueOf(list.stream().max(String::compareTo));
        String minresult = String.valueOf(list.stream().min(String::compareTo));
        System.out.println(maxresult);
        System.out.println(minresult);

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);


        Optional<Integer> minresultInt = listInt.stream().min(Integer::compare);
        Optional<Integer> maxresultInt = listInt.stream().max(Integer::compare);
        System.out.println(minresultInt);
        System.out.println(maxresultInt);*/

        /// Терминальный метод forEach() - выполняет действие для каждого элемента
        /// Терминальный метод forEachOrdered() - выполняет действие для каждого элемента в отсортированном порядке
        /*Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
        stream.limit(10).parallel().forEachOrdered(System.out::println);
        System.out.println("\n\n");
        Stream<Integer> stream2 = Stream.iterate(1, i -> i + 1);
        stream2.limit(10).parallel().forEach(System.out::println);*/

        /// Терминальный метод toArray() - возвращает массив
        /*Object[] array = Stream.of(1, 2, 3, 4, 5).toArray();
        System.out.println(Arrays.toString(array));*/

        /// Терминальный метод reduce() - выполняет действие для каждого элемента
//        System.out.println(Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).reduce((n1, n2) -> n1 + n2));

        /// Терминальный метод sum() - возвращает сумму элементов
        System.out.println(Stream.of("1", "2", "3", "4", "5").mapToInt(Integer::parseInt).sum());

        /// Терминальный метод avarage() - возвращает среднее значение
        System.out.println(Stream.of("1", "2", "3", "4", "5").mapToInt(Integer::parseInt).average());

    }
}