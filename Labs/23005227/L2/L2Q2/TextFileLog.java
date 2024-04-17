
package L2Q2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileLog implements SimpleLog {
    protected String filename;
    protected int maxsize;
    private int size;

    public TextFileLog(String filename, int maxsize) {
        this.filename = filename;
        this.maxsize = maxsize;
    }

    @Override
    public void insert(String c) {
        try {
            //append true so that it adds new log entries to the existing file
            PrintWriter output = new PrintWriter(new FileOutputStream(filename,true));
                if (!isFull()){
                    output.println(c);
                    size++;
                } else {
                    System.out.println("Adding another record \nThe log is full.");
            }
            output.close();
        } catch (IOException e){
            System.out.println("Problem with output file.");
        }
    }

    @Override
    public boolean isFull(){
        return (size >= maxsize);
    }

    @Override
    public void getSize() {
        System.out.println("Text file log size " + size);
    }

    @Override
    public void exist(String n) {
        System.out.printf("Searching for %s in the file\n", n);
        try {
            Scanner input = new Scanner(new FileInputStream(filename));
            boolean found = false;
            while (input.hasNextLine()){
                String line = input.nextLine();
                if (line.equalsIgnoreCase(n)){
                    found = true;
                    break;
                }
            }
            input.close();
            
            if (found){
                System.out.println("Text File Log contains " + n);
            } else {
                System.out.println("Text File Log does not contains " + n);
            }

        } catch (IOException e){
            System.out.println("Problem with input file.");
        }
    }

    @Override
    public void delete() {
        System.out.println("Clear the text file log");
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream(filename));
            output.print("");
            output.close();
            // reset size;
            size = 0; 
        } catch (IOException e){
            System.out.println("Problem with output file.");
        }
    }


    @Override
    public void display() {
        try {
            Scanner input = new Scanner(new FileInputStream(filename));
            while (input.hasNextLine()){
                System.out.println(input.nextLine());
            }
            input.close();
        } catch (IOException e){
            System.out.println("Problem with input file.");
        }
        
    } 
}
