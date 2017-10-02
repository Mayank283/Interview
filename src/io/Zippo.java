package io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zippo {

	private static final String filePath = "C:\\Users\\Mayank\\Desktop\\";

	private static final String sourcefileName = "Zippy.txt";

	private static final String destfileName = "Zipped.zip";

	public static void main(String[] args) throws IOException {

		File sourcefile = new File(filePath + sourcefileName);
		if (sourcefile.exists()) {
			sourcefile.delete();
		}
		sourcefile.createNewFile();

		File destFile = new File(filePath + destfileName);
		if (destFile.exists()) {
			destFile.delete();
		}
		destFile.createNewFile();

		FileWriter writer = new FileWriter(sourcefile);
		BufferedWriter bwriter = new BufferedWriter(writer);
		bwriter.write("Zipping up the file!!");
		bwriter.close();

		FileInputStream fis = new FileInputStream(sourcefile);
		FileOutputStream fos = new FileOutputStream(destFile);
		
		//If want to send the zipped file over server for download uncomment below:
		/*ByteArrayOutputStream byteArrayOutpustStream = new ByteArrayOutputStream();
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutpustStream);
		ZipOutputStream zos = new ZipOutputStream(bufferedOutputStream);*/
		
		
		ZipOutputStream zos = new ZipOutputStream(fos);

		ZipEntry ze = new ZipEntry(sourcefileName);
		zos.putNextEntry(ze);

		int length;
		byte[] buffer = new byte[1024];
		while ((length = fis.read(buffer)) > 0) {
			zos.write(buffer, 0, length);
		}
		zos.closeEntry();
		zos.close();
	}
}