package QLSV;

import java.util.Comparator;

public class SortStudentbyGpa implements Comparator<SinhVien> {
	@Override
	public int compare(SinhVien o1, SinhVien o2) {
		if (o1.getId() > o2.getId()) {
			return 1;
		} else if (o1.getId() < o2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}
}
