
public class RectTest {

	static class Shape {
		  int x;
		  int y;
		public Shape(int x , int y) {
			this.x=x;
			this.y=y;
		}
		public void print() {
			System.out.print("x좌표:"+ x + " y좌표:" + y +"\n");
	

		}
	}
	
		static class Rectangle extends Shape{
			int w;
			int h;
			public Rectangle(int x,int y ,int w ,int h) {
				super(x,y);
				this.w=w;
				this.h=h;
			}
			public void width() {
				
				System.out.print("가로:" + w);
			}
			public void height() {
				
				System.out.print("세로:" + h);
			}
			public void draw() {
				System.out.print("("+ x +","+ y + ")" +"위치에 " );
				width();
				height();
				System.out.println();
			}
			public void area() {
				int area;
				area = w*h;
			}
	
		}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5,3,10,20);
		
		r.print();
		r.draw();
		Rectangle t = new Rectangle(8,9,10,20);
		t.print();
		t.draw();
	}
	}
