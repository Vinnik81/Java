import java.util.*;
public class Dictionary {
        //1  Чтобы все слова были регистронезависимые
        Map<String, Words> dictionary = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        //2  Добавление раскладки
        void addLayout(String layout) {
            dictionary.put(layout, new Words());
        }

        //3  Добавление раскладки , слово , и перевод
        void addTranslation(String layout, String word, String translation) {
            Words layoutDictionary = dictionary.get(layout);;

            if (layoutDictionary == null) {
                layoutDictionary = new Words();
                dictionary.put(layout, layoutDictionary);
            }
            layoutDictionary.addTranslation(word, translation);
        }

        //4  Добавление раскладки , слово , и массив переводов
        void addTranslations(String layout, String word, String[] translations) {
            Words layoutDictionary = dictionary.get(layout);

            if (layoutDictionary == null) {
                layoutDictionary = new Words();
                dictionary.put(layout, layoutDictionary);
            }
            layoutDictionary.addTranslations(word, translations);
        }

        //5  Напечатать все раскладки
        void printAllLayouts() {
            for (String layout : dictionary.keySet())
                System.out.println("Раскладки: " + layout);
        }

        //6  Напечатать слова конкретной раскладки
        void printWords(String layout) {
            Words layoutDictionary = dictionary.get(layout);
            if (layoutDictionary != null) {
                System.out.println("Слова в раскладке: " + layout + ":" + layoutDictionary.getWords());
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
            Words layoutDictionary = dictionary.get(layout);
            if (layoutDictionary != null) {
                layoutDictionary.removeTranslation(word);
            }
        }

        //10 Очистить словарь
        void clearDictionary() {
            dictionary.clear();
        }

        //11 Поиск слов в конкретной раскладке ( ru , ca)  ca*  (car , capital , caron )
        List<String> searchWords(String layout, String prefix) {
            List<String> result = new ArrayList<>();
            Words layoutDictionary = dictionary.get(layout);
            if (layoutDictionary != null) {
                for (String word : layoutDictionary.getWords()) {
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
            Words layoutDictionary = dictionary.get(layout);
            if (layoutDictionary != null) {
                List<String> translations = layoutDictionary.getTranslations(word);
                if (translations != null) {
                    result.addAll(translations);
                }
            }
            return result;
        }
}

