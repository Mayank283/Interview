package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * Machine understands only bytes and InputStream/OutputStream provides this
 * directly so are faster since no conversion is done here. It is thread safe.
 * 
 * Reader and it's implementation converts these bytes input into respective
 * characters and hence are slower than InputStream. It is also thread safe.
 */

public class IOLearn {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// Reads the input as bytes array from buffer
		InputStream bis = new BufferedInputStream(System.in);

		OutputStream bos = new BufferedOutputStream(System.out);

		/**************************************************************************************************************/
		// Reads the input as character Stream
		Reader in = new InputStreamReader(bis);

		// Reads the input as character streams from buffer
		BufferedReader br = new BufferedReader(in);
		// Reads line as string which is terminated by /n or /r(carriage return)
		int readerInput = Integer.parseInt(br.readLine());

		// Writes the output as character streams
		Writer ow = new OutputStreamWriter(bos);

		// Writes the output as character streams with buffer
		BufferedWriter bw = new BufferedWriter(ow);

		/*
		 * PrintWriter pw = new PrintWriter(System.out,true);
		 * pw.println("Printing after flushing");
		 * 
		 * PrintStream ps = new PrintStream(bos, true); ps.println("Working!");
		 */
	}

}
