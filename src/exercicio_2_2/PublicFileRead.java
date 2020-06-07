package exercicio_2_2;

import java.io.File;

public class PublicFileRead implements FileRead {

	@Override
	public String read() {
		System.out.println("Reading public file");
		FileUtil fUtil = new FileUtil("src", "exercicio_2_2");
		File file = fUtil.createFileIfNotExists("publico");
		return fUtil.readFromFile(file);
	}

}
