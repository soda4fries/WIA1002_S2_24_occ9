/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class L1Q2 {
    public static void main(String[] args) {
        String text = readTextFile("text1");
        text = filterText(text);
        int count = countChars(text);
        System.out.println("Number of non-special chars: " + count);
        System.out.println(text);
    }
    static String readTextFile(String filename) {
        try (Scanner sc = new Scanner(new FileInputStream(filename + ".txt"))){
            String s = "";
            while (sc.hasNextLine())
                s += sc.nextLine() + "\n";
            return s;
        } catch (FileNotFoundException ex){
            System.out.println("Error File not found");
        }
        return "";
    }
    static String filterText(String rawText){
        String s = "";
        for (int i = 0; i < rawText.length(); i++){
            if (!isSpecialChar(rawText.charAt(i)))
                s += rawText.charAt(i);
        }
        return s;
    }
    static boolean isSpecialChar(char c){
        return switch (c) {
            case ',' -> true;
            case ' ' -> true;
            case ';' -> true;
            case ':' -> true;
            case '?' -> true;
            case '.' -> true;
            case '/' -> true;
            default -> false;
        };
    }
    static int countChars(String text){
        int n = text.length();
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == '\n')
                n--;
        return n;
    }
}
