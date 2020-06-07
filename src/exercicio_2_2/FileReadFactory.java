package exercicio_2_2;

public class FileReadFactory implements Factory {

	public static final int PUBLIC = 0;
	public static final int CONFIDENTIAL = 1;

	@Override
	public FileRead getFileReadInstance(int kind) {
		switch (kind) {
		case PUBLIC:
			return new PublicFileRead();
		case CONFIDENTIAL:
			return new ConfidentialFileRead();
		}
		return null;
	}

}
