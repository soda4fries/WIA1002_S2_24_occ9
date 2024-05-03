package DS.Lab.Lab1.L1Q2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class ft_split {
	public static void main(String[] args) {

		String filePath = "/home/jquan18/UM/Y1S2/DS/Lab/Lab1/L1Q2/test4.txt";
		String fileContent = readTxtToString(filePath);
		String delim = "\\d";
		//Use regex as delim
		// delim = "\\d"; for digits
		// delim = ";| "; for semicolon and space

		if (fileContent.length() > 0) {
			String[] tokens = fileContent.split(delim);
			for (String token : tokens) {
				System.out.print(token);
			}
			System.out.println();
		}

	}

	public static String readTxtToString(String path){
		StringBuilder fileContent = new StringBuilder();

		try {
			Scanner sc = new Scanner(new FileInputStream(path));

			while (sc.hasNextLine()) {
				fileContent.append(sc.nextLine() + "\n");
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error reading file");
		}

		return fileContent.toString();
	}
}
