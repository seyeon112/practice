package section19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EX19_03 {
	public static void main(String[] args) {
		OutputStream out = null;
		try {
			out = new FileOutputStream("write.txt", false);
			out.write('H');
			out.write('E');
			out.write('L');
			out.write('L');
			out.write('O');
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
