package exercicio_2_3;

public class ConsoleOutput implements Output {

	@Override
	public void print(String message) {
		System.out.println("Printing to console");
		
		System.out.println(message);
	}

}
