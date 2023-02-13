import java.util.Scanner;

public class ExampleTextFileCharacterAnalysis {
	static Scanner userinput = new Scanner(System.in);
	public static void main (String[] args)
	{
		// the six measurements for the 6 people (5 should eventually be read from a file)
		double [][] measure;
		measure = new double[6][6];

		// the fifteen ratios for the 6 people
		double [][] ratio;
		ratio = new double [6][15];
		int person;
		int i;
		for (person = 0; person <= 5; person++) {
			for (i = 0; i<= 5; i++) {
				System.out.print("Enter Person # " + person + " measurement # " + i + ": ");
				measure[person][i] = userinput.nextInt();
				userinput.nextLine();
			}
		}
		
		for (person = 0; person <= 5; person++) {
			ratio[person][0] = measure[person][0] / measure [person][1];
			ratio[person][1] = measure[person][0] / measure [person][2];
		}
		
	}
}
