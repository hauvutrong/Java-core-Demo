package QLSV;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SinhVienManagament {
	public static Scanner scanner = new Scanner(System.in);
	private List<SinhVien> studentList;
	SinhVien sv = new SinhVien();
	private SinhVienDao SinhVienDao;

	/**
	 * init StudentDao object and read list student when init StudentManager object
	 * 
	 * @throws IOException
	 */
	public SinhVienManagament() throws IOException {
		SinhVienDao = new SinhVienDao();
		studentList = SinhVienDao.read();
	}

	public void add() throws IOException {
		int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
		System.out.println("Student id :" + id);
		String name = inputName();
		int age = inputAge();
		String address = inputAddress();
		double gpa = inputGpa();
		sv = new SinhVien(id, name, address, age, gpa);
		studentList.add(sv);
		SinhVienDao.writer(studentList);
	}

	public void show() {
		if (studentList.size() > 0) {
			for (SinhVien student : studentList) {
				System.out.format("%5d | ", student.getId());
				System.out.format("%20s | ", student.getName());
				System.out.format("%5d | ", student.getAge());
				System.out.format("%20s | ", student.getAddress());
				System.out.format("%10.1f%n", student.getGpa());
			}
		} else {
			System.out.println("No data members!");
		}
	}

	public void Edit(int id) {
		boolean isExited = false;
		int size = studentList.size();
		for (int i = 0; i < size; i++) {
			if (studentList.get(i).getId() == id) {
				isExited = true;
				studentList.get(i).setName(inputName());
				studentList.get(i).setAge(inputAge());
				studentList.get(i).setAddress(inputAddress());
				studentList.get(i).setGpa(inputGpa());
				break;
			}

		}
		if (!isExited) {
			System.out.printf("id = %d not existed.\n", id);
		} else {
			SinhVienDao.writer(studentList);
		}
	}

	public void delete(int id) {
		SinhVien sv = null;
		int size = studentList.size();
		for (int i = 0; i < size; i++) {
			if (studentList.get(i).getId() == id) {
				sv = studentList.get(i);
				break;
			}
		}
		if (sv != null) {
			studentList.remove(sv);
			SinhVienDao.writer(studentList);
			System.out.printf("Deleted student has code : %d. %n", id);
		} else {
			System.out.printf("id =%d not existed .%n", id);
		}
	}

	public void sortsvbyGpa() {
		Collections.sort(studentList, new SortStudentbyGpa());
		show();
	}

	public void SortsvByName() {
		Collections.sort(studentList, new SortStudentByName());
		show();
	}

	public Scanner sc = new Scanner(System.in);

	public int inputId() {
		System.out.print("Input student id: ");
		while (true) {
			try {
				int id = Integer.parseInt(sc.nextLine());
				return id;
			} catch (NumberFormatException ex) {
				System.out.print("invalid! Input student id again: ");
			}
		}
	}

	private String inputName() {
		System.out.print("Input student name: ");
		return sc.nextLine();
	}

	private String inputAddress() {
		System.out.print("Input student address: ");
		return sc.nextLine();
	}

	private int inputAge() {
		System.out.print("Input student age: ");
		while (true) {
			try {
				int age = Integer.parseInt((sc.nextLine()));
				if (age < 0 && age > 100) {
					throw new NumberFormatException();
				}
				return age;
			} catch (NumberFormatException ex) {
				System.out.print("invalid! Input student age again: ");
			}
		}
	}

	private double inputGpa() {
		System.out.print("Input student gpa: ");
		while (true) {
			try {
				double gpa = Double.parseDouble(sc.nextLine());
				if (gpa < 0.0 && gpa > 10.0) {
					throw new NumberFormatException();
				}
				return gpa;
			} catch (NumberFormatException ex) {
				System.out.print("invalid! Input student Gpa again: ");
			}
		}
	}
}
