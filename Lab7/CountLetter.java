package Lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLetter {
    private final char lookFor;
    private FileReader file01 = new FileReader("C:\\Users\\carvo\\Documents\\30322\\src\\Lab7\\Lab7_ex2.txt");

    CountLetter(FileReader file, char lookFor) throws IOException {
        this.file01 = file;
        this.lookFor = lookFor;

    }

    private String readFile() throws IOException {

        String everything;

        try (BufferedReader br = new BufferedReader(file01)) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

            }
            everything = sb.toString();
        }
        return everything;
    }

    private int count(String line) {
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == lookFor) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        FileReader file01 = new FileReader("C:\\Users\\carvo\\Documents\\30322\\src\\Lab7\\Lab7_ex2.txt");
        CountLetter cl1 = new CountLetter(file01, 'e');

        System.out.println(cl1.count(cl1.readFile()));
    }

}