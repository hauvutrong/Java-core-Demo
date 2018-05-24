
public class Static {
	   int id;  
	    String name;  
	    Static(){System.out.println("Constructor mac dinh duoc goi");}  
	      
	    Static(int id,String name){  
	    this (); //no duoc su dung de goi constructor cua lop hien tai.  
	    this.id = id;  
	    this.name = name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	      
	    public static void main(String args[]){  
	    	Static e1 = new Static(111,"Hoang");  
	    	Static e2 = new Static(222,"Thanh");  
	    e1.display();  
	    e2.display();  
	    System.out.printf("%s\n%s\n","Welcome to","Java Programming!");
	   }     
}
