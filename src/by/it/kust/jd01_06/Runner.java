package by.it.kust.jd01_06;

/**
 * Created by User on 14.05.2016.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("TaskA1");
        TaskA.replaceSymbol();
        System.out.println("TaskA2");
        TaskA.numberOfWords();
        System.out.println("TaskA3");
        TaskA.vowel();

        System.out.println("TaskB1");
        TaskB.deleteWords();
        System.out.println("TaskB2");
        TaskB.sortSentences();
        System.out.println("TaskB3");
        TaskB.sortWords();
    }
}
