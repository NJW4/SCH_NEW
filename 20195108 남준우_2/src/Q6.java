import java.awt.*;
import javax.swing.*;
public class Q6 extends JFrame {
	Q6() {
		setTitle("³²ÁØ¿ì Random Labels");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < 20; i++) {
			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50;
			Container c = getContentPane();
			c.setLayout(null);

			
		JLabel label = new JLabel((int)(Math.random() * 100)+"");
		label.setBounds(x, y, 20, 20);
		label.setOpaque(true);
		label.setBackground(Color.BLUE);
		c.add(label);
	}
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Q6();

	}

}
