package DS.Lab.Lab1.L1Q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadMyLetter_22113308 {
	public static void main(String[] args) {
		String filePath = "/home/jquan18/UM/Y1S2/DS/Lab/L1Q1/JunQuan_22113308.txt";
		Scanner conInput = new Scanner(System.in);

		readTxt(filePath);
		System.out.println("Enter content to append to file: ");
		String content = conInput.nextLine();
		appendTxt(filePath, content);

		System.out.println("File after appending: ");
		readTxt(filePath);
	}

	public static void readTxt(String path) {
		try {
			Scanner sc = new Scanner(new FileInputStream(path));

			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			System.out.println();
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error reading file");
		}
	}

	public static void appendTxt(String path, String content) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(path, true));
			pw.println(content);
			pw.close();
		} catch (IOException e) {
			System.out.println("Error writing to file");
		}
	}

}
