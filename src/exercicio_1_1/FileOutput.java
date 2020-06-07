package exercicio_1_1;

public class FileOutput implements Output {

	@Override
	public void print(String message) {
		System.out.println("Printing to file");
		
		System.out.println(message);
	}

}
