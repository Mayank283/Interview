package language.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileHandling {

	public static void main(String[] args) {

		// Step 1: Create a file
		File file = new File("C:\\Users\\agarwalm\\Desktop\\mayank.txt");
		Writer w;
		BufferedWriter bw = null;
		try {
			w = new FileWriter(file);
			bw = new BufferedWriter(w);
			bw.write("Hi mayank");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}