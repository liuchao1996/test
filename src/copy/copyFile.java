package copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyFile {
	public static void main(String[] args) {
		copy();
	}
	
	public static void copy() {
		
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("src/bufferWriter/bufferReader.java");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("c.java");
			bw = new BufferedWriter(fw);
			
			String str = null;
			while( (str = br.readLine()) != null) {
				
				bw.write(str);
				bw.newLine();
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bw != null) {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}
		
	}

}
