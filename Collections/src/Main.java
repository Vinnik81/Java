import java.util.*;

class Dictionary{
    //Пример какая структура решаете сами
//    Map<String, Map<String,List<String>>> dictionary  = new TreeMap<>();

    //1  Чтобы все слова были регистронезависимые
    //2  Добавление раскладки
    //3  Добавление раскладки , слово , и перевод
    //4  Добавление раскладки , слово , и массив переводов
    //5  Напечатать все раскладки
    //6  Напечатать слова конкретной раскладки
    //7  Напечатать весь словарь
    //8  Удалить раскладку
    //9  Удалить конкретное слово в конкретной раскладке
    //10 Очистить словарь
    //11 Поиск слов в конкретной раскладке ( ru , ca)  ca*  (car , capital , caron )
    //12 Поиск перевода конкретного слова в конкретной раскладке
}

public class Main {
    public static void main(String[] args) {
//        Map<String, String> dictionary = new TreeMap<>(); // car - masina
//        Map<String, Map<String, String>> dictionary = new TreeMap<>(); // en car - masina
//        Map<String, Map<String, List<String>>> dictionary = new TreeMap<>(); // en car - masina, автомобиль - машина
//        Map<String, Map<String,Map<String,List<String>>>> dictionary  = new TreeMap<>(); // en ru  car -> masina , автомобиль ,

//        Queue<String> queues = new ArrayDeque<>();
       /* Deque<String> queues = new ArrayDeque<>();
        queues.add("1");
        queues.add("2");
        queues.add("3");
        queues.add("4");
        queues.add("5");

        queues.offer("6");

        System.out.println("\n================================");
       // System.out.println(queues.pool());
        // System.out.println(queues.peek());
//        System.out.println(queues.remove());// выдаёт исключение

        queues.push("1"); // добавить в начало
        queues.peek(); // выдаёт первый элемент
        queues.add("a"); // добавить в конец
        queues.addFirst("b"); // добавить в начало
        queues.addLast("c"); // добавить в конец
        //queues.addAll(queues);
        queues.pop(); // удалить из начала
        queues.getFirst(); // выдаёт первый элемент
        queues.getLast(); // выдаёт последний элемент
        queues.peekFirst(); // выдаёт первый элемент
        queues.peekLast(); // выдаёт последний элемент
        queues.poll(); // удалить из начала
        queues.pollFirst(); // удалить из начала
        queues.pollLast(); // удалить из конца
        queues.offer("d"); // добавить в начало возвращая true
        queues.offerFirst("e"); // добавить в начало возвращая true
        queues.offerLast("f"); // добавить в конец возвращая true
        queues.remove(); // удалить из начала
        queues.removeFirst(); // удалить из начала
        queues.removeLast(); // удалить из кон
        queues.clear(); // очистить
        System.out.println("=================================");

        for (String str : queues) {
            System.out.println(str);
        }*/

       /* String str = "Hello";
        StringBuilder stringBuilder = new StringBuilder("Hello");

        for (int i = 0; i < 100; i++) {
           str += i;
           stringBuilder.append(i);
        }

        System.out.println("String: " + str);
        System.out.println("StringBuilder: " + stringBuilder);*/

        /*ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("g");
        list.add(0, "f");

        *//*System.out.println(list.get(0));
        System.out.println(list.get(0));
        System.out.println(list.get(0));
        System.out.println(list.get(0));*//*
//        list.clear();
        list.addAll(list);
        list.remove("d");
        list.trimToSize();
        list.ensureCapacity(100);
        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }*/
    }
}