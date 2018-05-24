import java.util.ArrayList;

public class abc {
	 public static void main(String[] args) {
		 ArrayList<xyz> list = new ArrayList<>();
		 list.add(new xyz("vũ Trọng Hậu", "20"));
		 list.add(new xyz("vũ Trọng Hậu1", "21"));
		 list.add(new xyz("vũ Trọng Hậu2", "22"));
		 list.add(new xyz("vũ Trọng Hậu3", "23"));
		 list.add(new xyz("vũ Trọng Hậu4", "24"));
		 
		for(xyz x:list) {
			System.out.println(x.toString());
		}
		
		int size = list.size();
		for(int i=0; i<size; i++) {
			System.out.println(list.get(i));
		}
		 
	 }
}
