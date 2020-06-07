package exercicio_1_1;

public class ConsoleOutput implements Output {

	@Override
	public void print(String message) {
		System.out.println("Printing to console");
		
		System.out.println(message);
	}

}
