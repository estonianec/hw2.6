package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    private static void task1() {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(integer -> integer % 2 == 1);
        System.out.println(nums);
    }

    private static void task2() {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 6, 7, 5, 4, 6, 2, 4, 8, 7, 9,56, 43, 3, 2, 3, 2));
        List<Integer> numsForPrint = new ArrayList<>(Set.copyOf(nums));
        numsForPrint.removeIf(integer -> integer % 2 == 1);
        numsForPrint.sort(Comparator.naturalOrder());
        System.out.println(numsForPrint);
    }

    public static void  task3() {
        String phrase = "Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли. В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения. Это может быть произвольный набор слов, литературный текст или произвольное предложение.  Код должен работать с любой последовательностью и объемом списка слов.";
        String phraseWithoutDots = phrase.replace(".", "");
        String phraseWithoutDotsAndComas = phraseWithoutDots.replace(",", "");
        String resultPhrase = phraseWithoutDotsAndComas.toLowerCase();
        String[] result = resultPhrase.split(" ");
        List<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, result);
        Set<String> uniqueWords = new HashSet<>(wordList);
        List<String> doubleWords = new ArrayList<>(wordList);
        for (String uniqueWord : uniqueWords) {
            doubleWords.remove(uniqueWord);
        }
        doubleWords.forEach(uniqueWords::remove);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        List<String> wordList = new ArrayList<>(List.of("Первое", "Уникальное", "Отличное", "Повтор", "Пятое", "Повтор", "Уникальное"));
        Set<String> doubleWords = new HashSet<>(wordList);
        int counter = wordList.size() - doubleWords.size();
        System.out.println(counter);
    }
}

