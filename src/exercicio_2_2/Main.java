package exercicio_2_2;

public class Main {
	public static void main(String[] args) {

		System.out.println(args.length);
		String password = "desi gnpatt er ns";

		int kind = FileReadFactory.PUBLIC;

		if (args.length != 0 && args[0].equals(password)) {
			kind = FileReadFactory.CONFIDENTIAL;
		}

		FileRead fileRead = (new FileReadFactory()).getFileReadInstance(kind);

		if (fileRead != null) {
			System.out.println(fileRead.read());
		} else {
			System.out.println("Nenhum parametro especificado");
		}

	}
}
