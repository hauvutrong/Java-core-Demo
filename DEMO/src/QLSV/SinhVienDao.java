package QLSV;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class SinhVienDao {
	private static final String STUDENT_FILE_NAME = "student.txt";

	public void writer(List<SinhVien> SV) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(new File(STUDENT_FILE_NAME));
			oos = new ObjectOutputStream(fos);
			oos.writeObject(SV);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeStream(fos);
			closeStream(oos);
	
		}
	}

	public List<SinhVien> read() {
		List<SinhVien> list = new ArrayList<SinhVien>();
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(new File(STUDENT_FILE_NAME));
			ois = new ObjectInputStream(fis);
			list = (List<SinhVien>) ois.readObject();
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			closeStream(fis);
			closeStream(ois);
		}

		return list;

	}

	private void closeStream(InputStream is) {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private void closeStream(OutputStream os) {
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
