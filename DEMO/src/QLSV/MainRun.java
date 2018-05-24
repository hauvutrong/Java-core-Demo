package QLSV;

import java.io.IOException;
import java.util.Scanner;

public class MainRun {
	public static void showmenu() {
		System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
	}
public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		int choose;
		SinhVienManagament svmanager = new SinhVienManagament();
		int svID;
		
		showmenu();
		do {
			System.out.println("Mời bạn nhập lựa chọn");
			choose = Integer.parseInt(sc.nextLine());
			switch (choose) {
			case 1: 
				svmanager.add();
				break;
			case 2:
				svID = svmanager.inputId();
				svmanager.Edit(svID);
				break;
			case 3:
				svID = svmanager.inputId();
				svmanager.delete(svID);
				break;
			case 4:
				svmanager.sortsvbyGpa();
				break;
			case 5:
				svmanager.SortsvByName();
				break;
			case 6:
				svmanager.show();
				break;
			case 0:
				System.out.println("exited!");
				break;
				

			default:
				break;
			}
		} while (choose !=0);
		
		
		

	}

}
