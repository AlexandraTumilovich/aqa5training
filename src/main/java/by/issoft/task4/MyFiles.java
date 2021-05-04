package by.issoft.task4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MyFiles {
    public static void main(String[] args) throws IOException {
        String path = "D:\\AutomationTraining\\aqa5training\\src\\main\\resources\\sample1.txt";
        String content = new String(Files.readAllBytes(Paths.get(path)), "UTF-8");
        String content2 = content.replaceAll("[^а-яА-Я\\s]", "");
        String content3 = content2.replaceAll(" +", " ");
        String[] words = content3.split("\\s");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        ArrayList<String> onlyWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() > 0 && !word.contains(" ")) {
                onlyWords.add(word);
            }
        }
        Set<String> uniqueWords = new HashSet<>(onlyWords);

        Map<String, Integer> frequency = new HashMap<>();
        for (String word:uniqueWords) {
            frequency.put(word, Collections.frequency(onlyWords, word));
        }
        List<Integer> frequencyNumber = new ArrayList<>(frequency.values());
        frequencyNumber.sort(Collections.reverseOrder());

        Map<String, Integer> mostFrequentWords = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
                if(entry.getValue().equals(frequencyNumber.get(i)) && !mostFrequentWords.containsKey(entry.getKey())){
                    mostFrequentWords.put(entry.getKey(), entry.getValue());
                    continue;
                }
            }
        }

//        for (int a:frequencyNumber
//             ) {
//            System.out.println(a);
//        }

        for (Map.Entry<String, Integer> entry : mostFrequentWords.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }



    }
}
