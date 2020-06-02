import java.util.Scanner;
class Pp {
	private String name;
	private Scanner scanner = new Scanner(System.in);
	
	public Pp(String name) {
		this.name = name;
	}
	public String getName() { return name; }
	public int turn() {
		System.out.print(name + "[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
		return  scanner.nextInt();
	}
}
class Com extends Pp {
	public Com(String name) {
		super(name);
	}
	public int turn() {
		return (int)(Math.random() * 3 + 1); // 1부터 3까지의 수
	}	
}

public class Rcp {
	private final String s[] = {"가위", "바위", "보"};
	private Pp [] pp = new Pp[2];
	public Rcp() {
		pp[0] = new Pp("철수");
		pp[1] = new Com("컴퓨터");
	}
	
	public void run() {
		int userChoice, computerChoice;
		while (true) {
			userChoice = pp[0].turn();
			if (userChoice == 4) 
				break;
			
			computerChoice = pp[1].turn();
			
			if (userChoice < 1 || userChoice > 3) { 
				System.out.println("잘못 입력하셨습니다.");
			} 
			else {
				System.out.print(pp[0].getName() + "(" + s[userChoice-1] + ")" + " : ");				
				System.out.println(pp[1].getName() + "(" + s[computerChoice-1] + ")");
				int diff = userChoice - computerChoice; 
				switch (diff) {
				case 0:
					System.out.println("비겼습니다.");
					break;
				case -1: 
				case 2:
					System.out.println(pp[1].getName()+"가 이겼습니다.");
					break;
				case 1:
				case -2:
					System.out.println(pp[0].getName()+"가 이겼습니다.");
				}
			}
		}	
	}

	public static void main(String[] args) {
	Rcp g = new Rcp();
	g.run();

	}

}
