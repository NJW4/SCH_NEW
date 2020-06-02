import java.util.Scanner;
class Pp {
	private String name;
	private Scanner scanner = new Scanner(System.in);
	
	public Pp(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	public int turn() {
		System.out.print(name + "[����(1), ����(2), ��(3), ������(4)]>>");
		return  scanner.nextInt();
	}
}
class Com extends Pp {
	public Com(String name) {
		super(name);
	}
	public int turn() {
		return (int)(Math.random() * 3 + 1); // 1���� 3������ ��
	}	
}

public class Rcp {
	private final String s[] = {"����", "����", "��"};
	private Pp [] pp = new Pp[2];
	public Rcp() {
		pp[0] = new Pp("ö��");
		pp[1] = new Com("��ǻ��");
	}
	
	public void run() {
		int userChoice, computerChoice;
		while (true) {
			userChoice = pp[0].turn();
			if (userChoice == 4) 
				break;
			
			computerChoice = pp[1].turn();
			
			if (userChoice < 1 || userChoice > 3) { 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} 
			else {
				System.out.print(pp[0].getName() + "(" + s[userChoice-1] + ")" + " : ");				
				System.out.println(pp[1].getName() + "(" + s[computerChoice-1] + ")");
				int diff = userChoice - computerChoice; 
				switch (diff) {
				case 0:
					System.out.println("�����ϴ�.");
					break;
				case -1: 
				case 2:
					System.out.println(pp[1].getName()+"�� �̰���ϴ�.");
					break;
				case 1:
				case -2:
					System.out.println(pp[0].getName()+"�� �̰���ϴ�.");
				}
			}
		}	
	}

	public static void main(String[] args) {
	Rcp g = new Rcp();
	g.run();

	}

}
