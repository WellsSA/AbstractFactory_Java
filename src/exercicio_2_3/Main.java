package exercicio_2_3;

public class Main {
	public static void main(String[] args) {
		
		String message = "";
		
		System.out.println(args.length);
		System.out.println(args[0]);
		
		int kind = args.length != 0 ? 
				args[0].equals("arquivo") ? OutputFactory.FILE : 
				args[0].equals("console") ? OutputFactory.CONSOLE : -1 
				: -1;
		
		for(int i = 0; i <= 10; i++) message += i + "\n";
		
		Output outputFactory = (new OutputFactory()).getOutputInstance(kind);
		
		if(outputFactory != null) {
			outputFactory.print(message);
		} else {
			System.out.println("Nenhum parametro especificado");
		}
		
	}
}
