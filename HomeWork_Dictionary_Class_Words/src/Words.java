import java.util.*;
public class Words {
        private Map<String, List<String>> translations;

        public Words() {
            translations = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        }

        public void addTranslation(String word, String translation) {
            List<String> translationsList = translations.get(word);
            if (translationsList == null) {
                translationsList = new ArrayList<>();
                translations.put(word, translationsList);
            }
            translationsList.add(translation);
        }

        public void addTranslations(String word, String[] translationsArray) {
            for (String translation : translationsArray) {
                addTranslation(word, translation);
            }
        }

        public void removeTranslation(String word) {
            translations.remove(word);
        }

        public List<String> getTranslations(String word) {
            return translations.get(word);
        }

        public Set<String> getWords() {
            return translations.keySet();
        }

        public boolean containsWord(String word) {
            return translations.containsKey(word);
        }

        public boolean isEmpty() {
            return translations.isEmpty();
        }

        @Override
        public String toString() {
            return translations.toString();
        }
}

