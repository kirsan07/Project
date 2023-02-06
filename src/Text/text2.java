package Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class text2 {
    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }

    public static void main(String[] args) throws IOException {
        String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\Desktop\\text2.txt")));
        String[] massiv = string.split("[\\s]");
        String[] word = string.split("[\\s]+");
        String letter = String.join("", word);
        String[] sentenc = string.split("[\\.]");
        System.out.println("Words:" + " " + massiv.length);
        System.out.println("Characters: " + " " + letter.length());
        System.out.println("Sentence: " + sentenc.length);
        int score = 0;
        int drob1 = letter.length();
        int drob2 = word.length;
        int drob3 = sentenc.length;
        double result = 4.71 * drob1 / drob2 + 0.5 * drob2 / drob3 - 21.43;
        System.out.println("The score is: " + result);
        int i = 0;
        while (i < result) {
            i++;
        }
        i = i - 1;
        if (i == 1) {
            System.out.println("This text should be understood by 5-6 year-olds");
        }
        if (i == 2) {
            System.out.println("This text should be understood by 6-7 year-olds");
        }
        if (i == 3) {
            System.out.println("This text should be understood 7-9 year-olds");
        }
        if (i == 4) {
            System.out.println("This text should be understood by 9-10 year-olds");
        }
        if (i == 5) {
            System.out.println("This text should be understood by 10-11 year-olds");
        }
        if (i == 6) {
            System.out.println("This text should be understood by 11-12 year-olds");
        }
        if (i == 7) {
            System.out.println("This text should be understood by 12-13 year-olds");
        }
        if (i == 8) {
            System.out.println("This text should be understood by 13-14 year-olds");
        }
        if (i == 9) {
            System.out.println("This text should be understood by 14-15 year-olds");
        }
        if (i == 10) {
            System.out.println("This text should be understood by 15-16 year-olds");
        }
        if (i == 11) {
            System.out.println("This text should be understood by 16-17 year-olds");
        }
        if (i == 12) {
            System.out.println("This text should be understood by 17-18 year-olds");
        }
        if (i == 13) {
            System.out.println("This text should be understood by 18-19 year-olds");
        }
        if (i == 14) {
            System.out.println("This text should be understood by 24+ year-olds");
        }
    }
}