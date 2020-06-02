
public class Phone {
private String name;
private String manufacturer;

public Phone(String name , String manufacturer) {
	this.name = name;
	this.manufacturer = manufacturer;
}
public static void sendMessage(String m) {
	System.out.println("보내는 메세지:" + m);
}
public void calling() {
	System.out.println("여보세요!");
}

public  void info() {
	System.out.println("폰이름:" + name + ", 제조사:" + manufacturer);
	
}



static class SmartPhone  extends Phone{
	public SmartPhone(String name , String manufacturer) {
	super(name,manufacturer);
	}
	
	public void sendMessage() {
		sendMessage();
		
	}
	public void infom() {
		info();
	}
}
	
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone ("Galexy 10", "Samsung");
		
		smartPhone.sendMessage("교수님, 질문이 있어서 연락드립니다.");
		smartPhone.infom();

	}
}

	

