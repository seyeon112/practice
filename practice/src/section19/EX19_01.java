package section19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EX19_01 {
	public static void main(String[] args) {
		int read = 0;
		InputStream in = null;
		try {
			in = new FileInputStream("my_file.txt");
			
			while (true) {
				read = in.read();
				if (read == -1) {
					break;
				}
				System.out.print((char)read);
			}
		}catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
