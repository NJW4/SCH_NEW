class Circlee {
	private int x, y, radius;
	public Circlee(int x, int y, int radius) {
		this.x = x;
		this.y = y;		
		this.radius = radius;		
	}
	public String toString() {
		return "Circlee(" + x + "," + y + ")" + "������" + radius; 
	}
	public boolean equals(Object obj) {
		Circlee b = (Circlee)obj;
		if(x == b.x && y == b.y) return true;
		else return false;
	}	
}

public class Circle {

	public static void main(String[] args) {
		Circlee a = new Circlee(2,3,5); // �߽� (2,3)�� ������ 5�� ��
		Circlee b = new Circlee(2,3,30); // �߽� (2,3)�� ������ 30�� ��
		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);
		if(a.equals(b)) 
			System.out.println("���� ��");
		else 
			System.out.println("���� �ٸ� ��");
	}

}



