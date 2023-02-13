import java.util.Scanner;

import java.io.FileNotFoundException;
import java.io.File;

public class ExampleControl {
	static Scanner datainput = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
						   // Change me to your own file and path 
		String fileName = "C:\\Users\\jazderad\\Desktop\\sample.txt";
		File textFile = new File(fileName);
		Scanner datainput = new Scanner(textFile);
		String s;
		int words = 0;
		int[] counter = new int[26];

		while (datainput.hasNextLine()) {
			words++;
			s = datainput.nextLine();
			s = s.trim();
			System.out.println(s);
			for (int j = 0; j < s.length(); j++) {
				if ((s.charAt(j) == ' ') && (s.charAt(j + 1) != ' ')) {
					words++;
				}
				int ascii = (int) (s.charAt(j));
				if ((ascii >= 97) && (ascii <= 122)) {
					counter[ascii - 97]++;
				}
				if ((ascii >= 65) && (ascii <= 90)) {
					counter[ascii - 65]++;
				}

			}
		}
		System.out.println("There are " + words + " words in this document.");
		datainput.close();
		for (int j = 0; j <= 25; j++) {
			char c = (char) (j + 97);
			System.out.print(c + ":" + counter[j] + "  ");
		}

		System.out.println("\nProgram ended ...");
	}
}
