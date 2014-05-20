public class Frame extends JFrame {

	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Snake");
		setResizable(false);
		
		init();
	}
	
	public void init() {
		setLayout(new GridLayout(1, 1, 0, 0));
		//Когато си направим Screen класа
		Screen s = new Screen();
		add(s);
		
		pack();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Frame();
	}
	
}
