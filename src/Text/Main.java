package Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Main {
    public static String readFileAsString(String filename) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filename)));
    }

    public static void main(String[] args) throws IOException {
        String string = new String(Files.readAllBytes(Paths.get("C:\\Users\\user\\Desktop\\text.txt")));
        String[] massive = string.split("[\\s]");
        String[] words = string.split("[\\s]+");
        String letters = String.join("", words);
        String[] sentence = string.split("[\\.]");
        System.out.println("Words:" + " " + massive.length);
        System.out.println("Characters: " + " " + letters.length());
        System.out.println("Sentence: " + sentence.length);
        int score = 0;
        int drob1 = letters.length();
        int drob2 = words.length;
        int drob3 = sentence.length;
        double result = 4.71 * drob1 / drob2 + 0.5 * drob2 / drob3 - 21.43;
        System.out.println("The score is: " + result);
        String syllables = String.join("aeyuio",letters);
        System.out.println(syllables.length());
        System.out.println("Enter the score you want to calculate (ARI, FK, SMOG, CL, all):");
        //double score = (0.39 * (drob2 / drob3) + 11.8 * (syllables / drob2) - 15.59);
        //double score2 = score = 1.043 * Math.sqrt(polysyllables * (30 / drob3)) + 3.1291;
        //double score3 = 0.0588 * L - 0.296 * S - 15.8;
































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
