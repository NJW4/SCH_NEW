import java.util.Random;

public class ArrayPrint {

	public static void main(String[] args) {
	int array[][] = new int[4][4];
	Random r = new Random();
	for(int i=0; i<4; i++) {
		for(int j=0; j<4; j++) {
			array[i][j] = r.nextInt(10)+1;			
			System.out.print(array[i][j]+"\t");
		}
		System.out.println();
		
	}
	}

}