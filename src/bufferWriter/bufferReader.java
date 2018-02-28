package bufferWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferReader {

	public static void main(String[] args) {
		bufferReader2();
	}
	
	public static void bufferReader2() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("a.txt");
			br = new BufferedReader(fr);
		    char[] cr = new char[1024];
		    int len = -1;
		    while( (len = br.read(cr)) != -1 ) {
		    	System.out.println(new String(cr,0,len));
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch ( IOException e) {
			e.printStackTrace();
		}
	
		
		
	}

}
