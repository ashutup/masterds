package reflection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {

		BufferedReader br = null;

		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("C:\\Users\\ashutosh.sharma\\Desktop\\qs.txt"));
			StringBuffer buf = new StringBuffer();
			while ((sCurrentLine = br.readLine()) != null) {
				buf.append(sCurrentLine);
			}
			
			String[] qs = buf.toString().split(",");
			for (String string : qs) {
				System.out.println("Q- " + string.trim());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
