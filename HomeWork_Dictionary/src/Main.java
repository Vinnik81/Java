import java.util.*;

class Dictionary {
    //1  Чтобы все слова были регистронезависимые
    Map<String, Map<String, List<String>>> dictionary = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    //2  Добавление раскладки
    void addLayout(String layout) {
    dictionary.put(layout, new TreeMap<>(String.CASE_INSENSITIVE_ORDER));
    }

    //3  Добавление раскладки , слово , и перевод
    void addTranslation(String layout, String word, String translation) {
        Map<String, List<String>> layoutDictionary = dictionary.get(layout);

        if (layoutDictionary == null) {
            layoutDictionary = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
            dictionary.put(layout, layoutDictionary);
        }

        List<String> translations = layoutDictionary.get(word);
        if (translations == null) {
            translations = new ArrayList<>();
            layoutDictionary.put(word, translations);
        }
        translations.add(translation);
    }

    //4  Добавление раскладки , слово , и массив переводов
    void addTranslations(String layout, String word, String[] translations) {
        for (String translation : translations) {
            addTranslation(layout, word, translation);
        }
    }

    //5  Напечатать все раскладки
    void printAllLayouts() {
        for (String layout : dictionary.keySet())
            System.out.println("Раскладки: " + layout);
    }

    //6  Напечатать слова конкретной раскладки
    void printWords(String layout) {
        Map<String, List<String>> layoutDictionary = dictionary.get(layout);
        if (layoutDictionary != null) {
            System.out.println("Слова в раскладке: " + layout + ":" + layoutDictionary.keySet());
        } else {
            System.out.println("Раскладки: " + layout + " не существует");
        }
    }

    //7  Напечатать весь словарь
    void printDictionary() {
            System.out.println("Словарь: " + dictionary);
    }

    //8  Удалить раскладку
    void removeLayout(String layout) {
        dictionary.remove(layout);
    }

    //9  Удалить конкретное слово в конкретной раскладке
    void removeWord(String layout, String word) {
        Map<String, List<String>> layoutDictionary = dictionary.get(layout);
        if (layoutDictionary != null) {
            layoutDictionary.remove(word);
        }
    }

    //10 Очистить словарь
    void clearDictionary() {
        dictionary.clear();
    }

    //11 Поиск слов в конкретной раскладке ( ru , ca)  ca*  (car , capital , caron )
    List<String> searchWords(String layout, String prefix) {
        List<String> result = new ArrayList<>();
        Map<String, List<String>> layoutDictionary = dictionary.get(layout);
        if (layoutDictionary != null) {
            for (String word : layoutDictionary.keySet()) {
                if (word.startsWith(prefix)) {
                    result.add(word);
                }
            }
        }
        return result;
    }

    //12 Поиск перевода конкретного слова в конкретной раскладке
    List<String> searchTranslations(String layout, String word) {
        List<String> result = new ArrayList<>();
        Map<String, List<String>> layoutDictionary = dictionary.get(layout);
        if (layoutDictionary != null) {
            List<String> translations = layoutDictionary.get(word);
            if (translations != null) {
                result.addAll(translations);
            }
        }
        return result;
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dictionary dictionary = new Dictionary();

        System.out.println("Введите номер действия:\n" +
                "1-Добавить раскладку\n" +
                "2-Добавление раскладки , слово , и перевод\n" +
                "3-Добавление раскладки , слово , и массив переводов\n" +
                "4-Напечатать все раскладки\n" +
                "5-Напечатать слова конкретной раскладки\n" +
                "6-Напечатать весь словарь\n" +
                "7-Удалить раскладку\n" +
                "8-Удалить конкретное слово в конкретной раскладке\n" +
                "9-Очистить словарь\n" +
                "10-Поиск слов в конкретной раскладке\n" +
                "11-Поиск перевода конкретного слова в конкретной раскладке\n");

        int num = scanner.nextInt();

        while (true) {
            switch (num) {
                case 1: {
                    System.out.println("Введите раскладку: ");
                    String layout = scanner.next();
                    dictionary.addLayout(layout);
                    dictionary.printAllLayouts();
                }
                break;
                case 2: {
                    System.out.println("Введите раскладку: ");
                    String layout = scanner.next();
                    System.out.println("Введите слово: ");
                    String word = scanner.next();
                    System.out.println("Введите перевод: ");
                    String translation = scanner.next();
                    dictionary.addTranslation(layout, word, translation);
                    dictionary.printWords(layout);
                }
                break;
                case 3: {
                    System.out.println("Введите раскладку: ");
                    String layout = scanner.next();
                    System.out.println("Введите слово: ");
                    String word = scanner.next();
                    scanner.nextLine();
                    System.out.println("Введите переводы через запятую: ");
                    String translationsInput = scanner.nextLine();
                    String[] translations = translationsInput.split(",");
                    dictionary.addTranslations(layout, word, translations);
                }
                break;
                case 4: {
                    dictionary.printAllLayouts();
                }
                break;
                case 5: {
                    System.out.println("Введите раскладку: ");
                    String layout = scanner.next();
                    dictionary.printWords(layout);
                }
                case 6: {
                    dictionary.printDictionary();
                }
                break;
                case 7: {
                    System.out.println("Введите раскладку: ");
                    String layout = scanner.next();
                    dictionary.removeLayout(layout);
                }
                break;
                case 8: {
                    System.out.println("Введите раскладку: ");
                    String layout = scanner.next();
                    System.out.println("Введите слово: ");
                    String word = scanner.next();
                    dictionary.removeWord(layout, word);
                }
                break;
                case 9: {
                    dictionary.clearDictionary();
                }
                break;
                case 10: {
                    System.out.println("Введите раскладку: ");
                    String layout = scanner.next();
                    System.out.println("Введите префикс: ");
                    String prefix = scanner.next();
                    List<String> words = dictionary.searchWords(layout, prefix);
                    System.out.println(words);
                }
                break;
                case 11: {
                    System.out.println("Введите раскладку: ");
                    String layout = scanner.next();
                    System.out.println("Введите слово: ");
                    String word = scanner.next();
                    List<String> translations = dictionary.searchTranslations(layout, word);
                    System.out.println(translations);
                }
                break;
                default:
                    System.out.println("Неверный номер действия");
            }

            System.out.println("Введите номер действия или нажмите любую клавишу, кроме цифр, для завершения программы: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else break;
        }


        //dictionary.addLayout("en");
        //dictionary.addTranslation("ru", "привет", "hello");
        //dictionary.addTranslation("ru", "пока", "bye");
        //dictionary.addTranslation("en", "hello", "привет");
        //dictionary.printAllLayouts();
       // dictionary.printWords("ru");
       // dictionary.printWords("en");
       // dictionary.printDictionary();
        //dictionary.removeLayout("en");
        //dictionary.printAllLayouts();
       // dictionary.printDictionary();
        //dictionary.removeWord("ru", "пока");
       // dictionary.printWords("ru");
        //dictionary.clearDictionary();
       // dictionary.printDictionary();
        //dictionary.addTranslations("ru, en, az, chien", "привет", new String[]{"hello", "salam", "你好"});
        //dictionary.printDictionary();
        //System.out.println(dictionary.searchWords("ru", "п"));
        //System.out.println(dictionary.searchWords("en", "hello"));
        //System.out.println(dictionary.searchTranslations("ru", "привет"));
    }
}