package Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Name: Heng Xin Phei
 * Occ: 9
 * Date: 10/3/2024
 * Objective: Q1: Write a letter to lecturer.
 */

public class Q1 {
    public static void main(String[] args) {
        String fileName= "HengXinPhei_23005228.txt";
        try{
            Scanner input = new Scanner (new FileInputStream (fileName));
            PrintWriter output = new PrintWriter (new FileOutputStream(fileName, true));
     
            //Append
            output.println("");
            output.println("\nWednesday, 12 June 2024.");
            output.println("It's me again. Finally, it's the end of the term and the DS class");
            output.println("has finished! I think I did well in this course and I'm happy and satisfy with");
            output.println("my performance too. I have learnt a lot from DS, especially the ways to deal with");
            output.println("thousand sets of data. Hopefully I can get A in DS. In this course, I learn actively");
            output.println("and trying to solve all the tutorial and lab questions by my own. However, I think");
            output.println("it will be better to have a discussion with Dr to gain a thorough understanding. ");
            
            while(input.hasNextLine()){
                System.out.println(input.nextLine());
            }
            
            output.close();
            input.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File was not found.");
        }
        catch(IOException e){
            System.out.println("Problem with file output.");
        }
    }
}
