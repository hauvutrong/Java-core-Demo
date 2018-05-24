
public class dulieuDemo implements printable{
  @Override
  public void abc(){
	  System.out.println("Ok chạy ngon!");
  }
  
  public static void main(String[] args) {
	    printable dog = new dulieuDemo();
	    dog.abc();
	}
}
