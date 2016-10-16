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
		int i, j;
		char ch;
		String input = console.nextLine();
		String [] splArr = input.split(",");
	}	
}