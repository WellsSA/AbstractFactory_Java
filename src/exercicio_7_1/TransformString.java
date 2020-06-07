package exercicio_7_1;

public abstract class TransformString {

	public String transform() {
		String inputString = readString();
		String convertedString = transformTo(inputString); 
		printString(convertedString);
		return convertedString;
	}
	
	public String readString() {
		System.out.println("------ Reading string ------");
		String inputString = "Teste Teste";
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
