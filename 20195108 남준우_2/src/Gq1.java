import javax.swing.*;
import java.awt.*;
public class Gq1 extends JFrame {
	private String[] month = {"January","February","march","March","April","May","June","July","August","September","October","November","December"};
	private JPanel panel = new JPanel();
	private JSpinner spinner;
	JTextArea ta = new JTextArea(7, 20); 
	JPanel main_panel;
JComboBox<String> cbb_fruit;
	JLabel lb_print;
	
	Gq1(){
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,7));
		c.setLayout(new FlowLayout());
		c.add(new JButton("버튼"), BorderLayout.WEST);
		setVisible(true);

		c.setLayout(new FlowLayout());
		ImageIcon[] image={new ImageIcon("imagies/cc.jpg")};
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리");
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
	
		setSize(250,150);
		setVisible(true);
		
		ButtonGroup g = new ButtonGroup();
		
		JRadioButton apple1 = new JRadioButton("사과");
		JRadioButton pear1 = new JRadioButton("배", true);
		JRadioButton cherry1 = new JRadioButton("체리");
		
		g.add(apple1);
		g.add(pear1);
		g.add(cherry1);
		
		c.add(apple1);
		c.add(pear1);
		c.add(cherry1);
		setSize(250,150);
		setVisible(true);
		
		JSlider js = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		
		js.setPaintLabels(true);
        js.setPaintTicks(true);
        js.setPaintTrack(true);
        js.setMajorTickSpacing(50);
        js.setMinorTickSpacing(10);
        
        this.add(js, BorderLayout.CENTER);
        this.setSize(300,300);
        this.setVisible(true);

        c.add(new JLabel("이름 "));
		c.add(new JTextField("남준우",20));
		c.add(new JLabel("학과 "));
		c.add(new JTextField("의료IT공학과", 20)); 
		c.add(new JLabel("주소 "));
		c.add(new JTextField("순천향로....", 20)); 		
		setSize(300,150);
		setVisible(true);
		
		c.add(new JLabel("Enter the password:"));
		c.add(new JPasswordField(20));
		setSize(300,150);
		setVisible(true);
		
		String[] monthStrings = {"January","February","march","March","April","May","June","July","August","September","October","November","December"}; 
		SpinnerListModel monthModel = new SpinnerListModel(monthStrings);
		JSpinner spinner = new JSpinner(monthModel);
		setSize(300,150);
		setVisible(true);
		
				c.add(new JLabel("month "));
				SpinnerListModel listModel = new SpinnerListModel(month);
				spinner = new JSpinner(listModel);
				panel.add(spinner);
				add(panel);
				setVisible(true);
		 
				c.add(new JScrollPane(ta));
				setSize(300,300);
				setVisible(true);
				
				
				
				String[] fruits={"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
			    String[] name={"nam", "jun", "woo", "IT"};
			     
			        JComboBox strCombo= new JComboBox(fruits);
			        this.add(strCombo);
			        
			        JComboBox nameCombo = new JComboBox(name);
			        this.add(nameCombo);
			        
			        this.setLocationRelativeTo(null);
			        this.setSize(300,300);
			        this.setVisible(true);

			        String[] fruitss={"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
			        ImageIcon[] images={new ImageIcon("e0.jpg"), new ImageIcon("e1.jpg"), new ImageIcon("e2.jpg"), new ImageIcon("e3.jpg")};

			        JList strList = new JList(fruits);
			        this.add(strList);
			        
			        JList imageList = new JList(images);
			        this.add(imageList);
			        
			        JList scrollList = new JList(fruitss);
			        this.add(new JScrollPane(scrollList));
			        
			        this.setLocationRelativeTo(null);
			        this.setSize(300,300);
			        this.setVisible(true);
			        
			        
				
	}
	
	




	public static void main(String[] args) {
		new Gq1();

	}

}
