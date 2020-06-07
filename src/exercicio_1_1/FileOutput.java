package exercicio_1_1;

import java.io.File;

public class FileOutput implements Output {

	@Override
	public void print(String message) {
		System.out.println("Printing to file");
		FileUtil fUtil = new FileUtil("src", "exercicio_1_1");
		File file = fUtil.createFileIfNotExists("test");
		System.out.println(file);
		fUtil.writeToFile(file.getName(), message);
		System.out.println(message);
	}
}
