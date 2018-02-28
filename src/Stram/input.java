package Stram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class input {
	
	public static void main(String[] args) {
		inputS();
	}

	public static void inputS() {
		
		InputStream in = null;
		
		try {
			in = new FileInputStream("e.txt");
			byte [] cr = new byte[1024];
			
		 int len =  in.read(cr);
		  System.out.println(new String(cr,0,len));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
