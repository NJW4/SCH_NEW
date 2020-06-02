
public class Lotto {

	public static void main(String[] args) {
	double d = Math.random();
	
	for(int i = 0; i<10; i++) {
		int n = (int)(Math.random()*100+1);
		System.out.print(n + " ");
	}
}

}
