import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HouseMD {
	
	public static void main(String [] args) throws FileNotFoundException {
		
		Scanner console = new Scanner(System.in);
		Scanner sympt = new Scanner (new File("Symptoms.txt"));
		Scanner ill = new Scanner (new File("Illnesses.txt"));
		Scanner prescript = new Scanner (new File("Prescriptions.txt"));
		String choice = "";
		String prescription = "";
		String illness = "";
		String symptom = "";
		String symptomShown = "";
		String result = "";
		System.out.println("Tell me your symptoms");
		String input = console.nextLine().toLowerCase();
		do {
			illness = ill.nextLine();
			prescription = prescript.nextLine();
			symptomShown = sympt.nextLine();
			symptom = symptomShown.toLowerCase();
			if (symptom.startsWith(input)) {
				System.out.println("Are these your symptoms?" + "\n" + symptomShown);
				System.out.println("Y / N");
				choice = console.nextLine().toLowerCase();
				if (choice.equals("y")){
					result ="You have " +  illness + "." + "\n" + "Prescriptions: " + "\n" + prescription;
				}
				else if (choice.equals("n")) {
					continue;
				}
			}
		}
		while  (sympt.hasNextLine());
		if (result.equals("")){
			System.out.println("I'm sorry, we don't have such symptoms in our database.");
			System.out.println("Please, come back later, we'll certainly add them to our knowledge base:)");
		}
		else {
			System.out.println(result);
		}
		
	}
	
}