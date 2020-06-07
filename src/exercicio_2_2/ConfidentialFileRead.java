package exercicio_2_2;

import java.io.File;

public class ConfidentialFileRead implements FileRead {

	@Override
	public String read() {
		return "arquivo confidencial";
	}
}
