package exercicio_2_3;

public class OutputFactory implements Factory {

	public static final int CONSOLE = 0;
	public static final int FILE = 1;

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
