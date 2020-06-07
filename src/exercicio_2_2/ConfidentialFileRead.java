package exercicio_2_2;

import java.io.File;

public class ConfidentialFileRead implements FileRead {

	@Override
	public String read() {
		System.out.println("Reading confidential file");
		FileUtil fUtil = new FileUtil("src", "exercicio_2_2");
		File file = fUtil.createFileIfNotExists("confidencial");
		return fUtil.readFromFile(file);
	}
}
