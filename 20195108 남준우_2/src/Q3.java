import java.awt.*;
import javax.swing.*;

public class Q3 extends JFrame {
	Q3() {
		setTitle("���ؿ� BorderLayout Practice");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new GridLayout(1,10));
		for(int i=0; i<10; i++) { c.add(new JButton(i + ""));
		}
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Q3();

	}

}
