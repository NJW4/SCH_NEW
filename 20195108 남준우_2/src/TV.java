import java.util.Scanner;
public class TV {
	
	String a;
	int b;
	int c;
	
	public TV(	String a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	public void show() {
		System.out.print(a +" ���� ���� " + b +"���� " + c +"��ġ TV");
	}

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
