/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anas Mohammad 23055727
 */
public class L1Q1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileInputStream("Anas_23055727.txt"))) {
            String s = "";
            while (sc.hasNextLine())
                s += sc.nextLine() + "\n";
            System.out.println(s);
            s += getUserInput();
            System.out.println("Newly Appended Letter:\n" + s);
            writeToNewFile(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(L1Q1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static String getUserInput() {
        String s = "\n\n";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Would you like to append to the letter?: (y\\n) ");
            String ans = sc.nextLine();
            if (ans.equals("n"))
                return s;
            else if (ans.equals("y"))
                break;
        }
        System.out.println("Type \"x\" to stop writing");
        s += "Thursday, 18 June 2021.\n";
        while (true){
            String x = sc.nextLine();
            if (x.equals("x"))
                return s;
            s += x + "\n";
        }
    }
    static void writeToNewFile(String text){
        try {
            PrintWriter wr = new PrintWriter("Anas_23055727new.txt");
            wr.write(text);
            wr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(L1Q1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
