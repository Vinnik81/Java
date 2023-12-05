# Java
# [1) HomeWork_FifteenSticksGame](https://github.com/Vinnik81/Java/tree/master/HomeWork_FifteenSticksGame)
Написать игру 15 палочек
В игре есть 15 палочек
Каждый игрок может брать от 1-3 палочек
Проигрывает тот кто берет последнию палочку
Реализовать режим игры с исскуственным интелектом для игры с компьютером
Цель задания написать интеллект компьютеру , что бы он практически всегда выигрывал человека

1 режим ЧЕЛОВЕК - ЧЕЛОВЕК
2 режим ЧЕЛОВЕК - КОМПЬЮТЕР (HARD режим)

# [2) HomeWork_Enum](https://github.com/Vinnik81/Java/tree/master/HomeWork_Enum)
Написать продвинутый функционал с помощью Enum.

# [3a) HomeWork_Dictionary](https://github.com/Vinnik81/Java/tree/master/HomeWork_Dictionary)
# [3b) HomeWork_Dictionary_Class_Words](https://github.com/Vinnik81/Java/tree/master/HomeWork_Dictionary_Class_Words)
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
3a Пример со структурой  Map<String, Map<String,List<String>>> dictionary  = new TreeMap<>();
3b Пример со структурой  Map<String, Words> dictionary  = new TreeMap<>();

# [4) HomeWork_File_Thread](https://github.com/Vinnik81/Java/tree/master/HomeWork_File_Thread)
Написать метод который создает по 20 папок а внутри по 20 файлов и внутри каждого файла нумерация от 1 - 1.000.000
Использовать потоки

В main
старт времени
вызов метода
стоп времени

Время работы программы без использования Thread: 119179 миллисекунд.
Время работы программы с использованием Thread: 109404 миллисекунд.

# [5) HomeWork_Stream](https://github.com/Vinnik81/Java/tree/master/HomeWork_Stream)
1) Дана коллекция строк а1,а2,а3,а1,a4,a5,a1 вернуть количество вхождений объекта a1 с помощью StreamApi
2) Найти элемент в коллекции равный а3 или вывести ошибку\n
3) Вернуть последний элемент коллекции или empty если коллекция пуста
4) Вернуть 2 элемента начиная со второго элемента коллекции
5) Из коллекции имен убрать все повторение и найти среднюю длину имен
6) Отсортировать коллекцию строк по убыванию и убрать дубликаты
7) Вернуть сумму нечетных чисел или 0

# [6) HomeWork_Spring_Cars](https://github.com/Vinnik81/Java/tree/master/HomeWorkSpring_Car)
Написать приложение с фреймворком Spring:
Должны быть реализованы классы:
- Двигатель (количество лошадиных сил, объём, вес, цена)
- Трансмиссия (количество передач, тип, вес, цена)
- Колесо (диаметр, веc, цена)
- Кузов (тип, вес, цена)
- Автомобиль (двигатель, трансмиссия, 4 колеса, кузов, стоимость, бренд, название)

В конфигурациях Spring настроить 3-4 автомобиля.
В main функции из context получить пару этих автомобилей.

# [7) HomeWorkSpring_HibernateDb](https://github.com/Vinnik81/Java/tree/master/HomeWorkSpring_HibernateDb)
Написать приложение на спринг, подключить базу данных, реализовать Crud операции.