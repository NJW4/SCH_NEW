
public class Phone {
private String name;
private String manufacturer;

public Phone(String name , String manufacturer) {
	this.name = name;
	this.manufacturer = manufacturer;
}
public static void sendMessage(String m) {
	System.out.println("������ �޼���:" + m);
}
public void calling() {
	System.out.println("��������!");
}

public  void info() {
	System.out.println("���̸�:" + name + ", ������:" + manufacturer);
	
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
		
		smartPhone.sendMessage("������, ������ �־ �����帳�ϴ�.");
		smartPhone.infom();

	}
}

	

