
public class Gugudan2 {

	public static void main(String[] args) {

	int i=1;
	int k;
	int j=0;
	int z;
		for(j=0; j<9; j=j+3) {
				for(z=1; z<4; z++) {
				System.out.print("-" + (j+z) + "´Ü-\t");
				}
						
						for(k=1; k<10; k++) {
							System.out.println();
					
					for(i=1; i<4; i++) {
						System.out.print(i+j +"*"+k +"=" +(i+j)*k + "\t");
					
				}
			
			}
						System.out.println();
		}
	}
}