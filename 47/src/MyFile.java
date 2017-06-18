
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MyFile {

	public static void main(String[] args) {
		String data = "OK";
		//File outFile = new File("./dir1/brad.txt");
		try {
			FileOutputStream fout = new FileOutputStream(new File("./dir1/MyFile.txt"), true);
			fout.write(data.getBytes());
			fout.flush();
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}