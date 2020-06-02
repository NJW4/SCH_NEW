class Circlee {
	private int x, y, radius;
	public Circlee(int x, int y, int radius) {
		this.x = x;
		this.y = y;		
		this.radius = radius;		
	}
	public String toString() {
		return "Circlee(" + x + "," + y + ")" + "반지름" + radius; 
	}
	public boolean equals(Object obj) {
		Circlee b = (Circlee)obj;
		if(x == b.x && y == b.y) return true;
		else return false;
	}	
}

public class Circle {

	public static void main(String[] args) {
		Circlee a = new Circlee(2,3,5); // 중심 (2,3)에 반지름 5인 원
		Circlee b = new Circlee(2,3,30); // 중심 (2,3)에 반지름 30인 원
		System.out.println("원 a : " + a);
		System.out.println("원 b : " + b);
		if(a.equals(b)) 
			System.out.println("같은 원");
		else 
			System.out.println("서로 다른 원");
	}

}



