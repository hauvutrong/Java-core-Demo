
public class xyz {
String hoten;
String tuoi;
public xyz() {
	super();
	// TODO Auto-generated constructor stub
}
public xyz(String hoten, String tuoi) {
	super();
	this.hoten = hoten;
	this.tuoi = tuoi;
}
public String getHoten() {
	return hoten;
}
public void setHoten(String hoten) {
	this.hoten = hoten;
}
public String getTuoi() {
	return tuoi;
}
public void setTuoi(String tuoi) {
	this.tuoi = tuoi;
}
@Override
	public String toString() {
		return "Student@[name=" + hoten + ", age=" + tuoi + "]";
	}
}
