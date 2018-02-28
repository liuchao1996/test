package printCopy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printCopys {

	public static void main(String[] args) {
		copy();
	}
	
	public static void copy() {
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			br = new BufferedReader(new FileReader("src/copy/copyFile.java"));
			pw = new  PrintWriter(new FileWriter("a.java"),true);
			String line = null;
			while( (line = br.readLine()) != null ) {
			  pw.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
