import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HouseMD {
	public static void main(String [] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		Scanner sympt = new Scanner (new File("Symptoms.txt"));
		Scanner ill = new Scanner (new File("Illnesses.txt"));
		Scanner prescript = new Scanner (new File("Prescriptions.txt"));
		Scanner analys = new Scanner (new File("Analysis.txt"));
		String analysis = "";
		String prescription = "";
		String illness = "";
		String symptom = "";
		String result = "";
		String input = console.nextLine();
		input = input.toLowerCase();
		String [] splArr = input.split(",");
			do {
				illness = ill.nextLine().toLowerCase();
				prescription = prescript.nextLine().toLowerCase();
				symptom = sympt.nextLine().toLowerCase();
				analysis = analys.nextLine().toLowerCase();
				analysis = " " + analysis;
				if ((symptom.equals(splArr[0]))&&(analysis.equals(splArr[1]))) {
					result ="You have " +  illness + ". Prescriptions: " + prescription;
				}
			}
			while  ((sympt.hasNextLine())&&(analys.hasNextLine()));
		System.out.println(result);
	}	
}