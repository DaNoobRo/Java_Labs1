package Lab6;

import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Dictionary dict = new Dictionary();
        char ans = '1';
        String word,wordy, definition,defy;



        do {
            System.out.println("\nMenu");
            System.out.println("1 - Add one of 'em fancy words");
            System.out.println("2 - gimme def");
            System.out.println("3 - gimme all words");
            System.out.println("4 - gimme all defs");
            System.out.println("e - Bye bye");

            System.out.print("Your choice,mortal : ");
            ans = scanner.next().charAt(0);

            switch (ans) {
                case '1' -> {
                    System.out.print("\n word : ");
                    word = scanner.next();
                    Word anon=new Word(word);
                    scanner.nextLine();
                    if (word.length() > 1) {
                        System.out.print("definition : ");
                        definition = scanner.nextLine();
                        Definition anonD = new Definition(definition);
                        dict.addWord(anon, anonD);
                    }
                }
                case '2' -> {
                    //
                    //This one doesn't work yet,throws null pointer exception
                    //
                    System.out.print("\nWhere are youuuu ?: ");
                    wordy = scanner.next();
                    Word anon=new Word(wordy);
                    defy = null;
                    if (wordy.length() > 1) {
                        defy = dict.getDefinition(anon).getDescription();
                        if (defy == null)
                            System.out.println("\nPare rau frate dar nu e asta aci.");
                        else
                            System.out.println("\nDefiniton : " + defy);
                    }
                }
                case '3' -> dict.getAllWords();
                case '4' -> dict.getAllDefinitions();
            }
        } while(ans != 'e' && ans != 'E');
        System.out.println("\nGoodbye everybody,I got to gooooo.");
    }

}