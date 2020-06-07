package exercicio_7_1;

public abstract class TransformString {

	public String transform() {
		String inputString = readString();
		String convertedString = transformTo(inputString); 
		printString(convertedString);
		return convertedString;
	}
	
	public String readString() {
		System.out.println("Lendo string");
		
		return "teste teste";
	}
	
	public abstract String transformTo(String str);
	
	public void printString(String str) {
		System.out.println("Printando string");
	}
	
}
