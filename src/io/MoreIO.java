package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MoreIO {

	public static void main(String[] args) throws IOException {

		/*******************************************************
		 * File Handling and I/O
		 *******************************************************/

		/** working with files directly with char array */
		File file = new File("C:/Users/Mayank/Desktop/mayank.txt"); //
		file.createNewFile();

		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write("Hello!");
		bw.close();

		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();// reads only one line identified by /n or /r
		}
		br.close();

		/** working with files as byte array */
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis.read());// just 1 byte is read from
										// file.Character H as 72

		BufferedInputStream in = new BufferedInputStream(fis);
		System.out.println(in.read());
		in.close();

		FileOutputStream fos = new FileOutputStream(file);
		fos.write(72);
		fos.close();

		ByteArrayOutputStream outputstream = new ByteArrayOutputStream();
		/**
		 * Outputstreamwriter(or any writer) works as a wrapper for
		 * any output stream to convert character into bytes internally.
		 */
		OutputStreamWriter writer = new OutputStreamWriter(outputstream);
		writer.write("Hello!");
		writer.close();
		byte[] bh = (outputstream).toByteArray();
		ByteArrayInputStream kok = new ByteArrayInputStream(bh);
		System.out.println("Print:: " + kok.read());
	}
}
