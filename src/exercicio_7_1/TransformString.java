package exercicio_7_1;

import java.util.Scanner;

public abstract class TransformString {

	public String transform() {
		String inputString = readString();
		String convertedString = transformTo(inputString); 
		printString(convertedString);
		return convertedString;
	}
	
	public String readString() {
		System.out.println("------ Reading string ------");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert your text here: ");
		String inputString = scanner.next();
		System.out.println(inputString);
		
		System.out.println("-----------------------------");
		return inputString;
	}
	
	public abstract String transformTo(String str);
	
	public void printString(String str) {
		System.out.println("------ Printing string ------");
		System.out.println(str);
		System.out.println("-----------------------------");
	}
	
}
