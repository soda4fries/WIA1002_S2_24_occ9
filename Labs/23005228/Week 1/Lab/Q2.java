package Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 10/3/2024
 * Objective: Q2: Write a program to read a text file that has a sequence of characters that
 are delimited (separated) by special character.
 */

public class Q2 {
    public static void main(String[] args){
       
        /*try{
            Scanner input = new Scanner (new FileInputStream ("text1.txt"));
            String s = "";
            while(input.hasNextLine()){
                s += (input.nextLine()+",");
                System.out.println(s);
            }
            String [] character = s.split(",");
            System.out.println("Number of character without special characters: "+character.length);
            System.out.println("Character without special characters: ");
            for(String value: character){
                System.out.print(value);
            }
            input.close();
        }
        
        catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }*/
    
    /*
    try{
            Scanner input = new Scanner (new FileInputStream ("text2.txt"));
            String s = "";
            while(input.hasNextLine()){
                s += (input.nextLine()+", ");
                System.out.println(s);
            }
            String [] character = s.split(",");
            System.out.println("Number of character without special characters: "+character.length);
            System.out.println("Character without special characters: ");
            for(String value: character){
                System.out.print(value);
            }
            input.close();
        }
        
        catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
    
    */
    /*
    try{
            Scanner input = new Scanner (new FileInputStream ("text3.txt"));
            String s = "";
            while(input.hasNextLine()){
                s += (input.nextLine()+"; ");
                System.out.println(s);
            }
            String [] character = s.split(";");
            System.out.println("Number of character without special characters: "+character.length);
            System.out.println("Character without special characters: ");
            for(String value: character){
                System.out.print(value);
            }
            input.close();
        }
        
        catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
    
    */
    
    try{
            Scanner input = new Scanner (new FileInputStream ("text4.txt"));
            String s = "";
            String t = "";
            while(input.hasNextLine()){
                s += input.nextLine();
                System.out.println(s);
            }
            for(int i=0; i<s.length(); i++){
                if(!(s.charAt(i)>='0' && s.charAt(i)<='9')){
                    t += s.charAt(i);
                }
            }
            System.out.println("Number of character without numbers: "+t.length());
            System.out.println("Character without numbers: "+t);
            
            input.close();
        }
        
        catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
    
    
    }
    
    
}
