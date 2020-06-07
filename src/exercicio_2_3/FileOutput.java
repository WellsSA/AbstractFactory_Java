package exercicio_2_3;

import java.io.File;

public class FileOutput implements Output {

	@Override
	public void print(String message) {
		System.out.println("Printing to file");
		FileUtil fUtil = new FileUtil("src", "exercicio_2_3");
		File file = fUtil.createFileIfNotExists("log");
		fUtil.writeToFile(file, message);
	}
}
