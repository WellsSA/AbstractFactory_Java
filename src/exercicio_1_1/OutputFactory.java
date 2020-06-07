package exercicio_1_1;

public class OutputFactory implements Factory {

	public static final int CONSOLE = 1;
	public static final int FILE = 2;

	@Override
	public Output getOutputInstance(int kind) {
		switch (kind) {
		case CONSOLE:
			return new ConsoleOutput();
		case FILE:
			return new FileOutput();
		}
		return null;
	}

}
