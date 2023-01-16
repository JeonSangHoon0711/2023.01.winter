import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

class notification extends JLabel implements Runnable{
	Thread Th; boolean On = false;
	int X, Y, Width, Height;
	
	public notification(String str) {
		Th = new Thread(this, "notification");
		X = 0; Y = 0; Width = 10; Height = 10;
		setText(str);
		setHorizontalAlignment(JLabel.CENTER);
		setBackground(Color.WHITE);
		setFont(new Font("±¼¸²",Font.BOLD,18));
		setOpaque(true);
		setBounds(X, Y, Width, Height);
		Th.start();
	}
	
	public void run() {
		while(true){
			if(On) {
				setVisible(true);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					;
				}
				setVisible(false);
				On = false;
			}
		}
	}
}