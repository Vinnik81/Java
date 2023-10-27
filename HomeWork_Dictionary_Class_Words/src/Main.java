import java.util.*;

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

    }
}