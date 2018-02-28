package Stram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class outputStream1 {
	
	public static void main(String[] args) {
		output();
	}
	
	public static void output() {
		OutputStream out = null;
		
		try {
			out = new FileOutputStream("e.txt",true);
			String word = "helloworld";
			byte[] bytes = word.getBytes();
			out.write(bytes);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
