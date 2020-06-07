package exercicio_1_1;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		String message = "I'll print it!";
		Random random = new Random();
		//int kind = random.nextInt(2);
		int kind = OutputFactory.FILE;
		
		System.out.println(kind);
		
		Output outputFactory = (new OutputFactory()).getOutputInstance(kind);
		
		if(outputFactory != null) {
			outputFactory.print(message);
		}
		
	}
}
