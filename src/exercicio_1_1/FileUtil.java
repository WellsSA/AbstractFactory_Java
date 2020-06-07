package exercicio_1_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {
	public static String BASEDIR = Paths.get("").toAbsolutePath().toString();
	public String WORKDIR = BASEDIR + File.separatorChar;
	
	public FileUtil() {
		this.WORKDIR = BASEDIR + File.separatorChar;
	}
	
	public FileUtil(String... dirs) {
		String workdir = "";
		for(String dir: dirs) workdir+= dir + File.separatorChar;
		this.WORKDIR = BASEDIR + File.separatorChar + workdir;
	}
	
	public File createFileIfNotExists(String filename) {
		try {
			File myObj = new File(WORKDIR + filename + ".txt");
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

	public boolean writeToFile(String filename, String message) {
		try {
			FileWriter myWriter = new FileWriter(filename);
			myWriter.write(message);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
			return true;
		} catch (IOException e) {
			System.out.println("FileUtil@writeToFile: An error occurred.");
			e.printStackTrace();
		}

		return false;
	}
}
