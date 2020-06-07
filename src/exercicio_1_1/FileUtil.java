package exercicio_1_1;

import java.io.File;
import java.io.IOException;

public class FileUtil {
	public File createFileIfNotExists(String filename) {
		try {
			File myObj = new File(filename+".txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
			
			return myObj;
		} catch (IOException e) {
			System.out.println("FileUtil@createFileIfNotExists: An error occurred.");
			e.printStackTrace();
		}
		return null;
	}
}
