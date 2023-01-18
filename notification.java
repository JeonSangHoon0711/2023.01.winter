import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

class notification extends JLabel implements Runnable{
	Thread Th; boolean On;
	int X, Y, Width, Height;
	
	public notification(String str) {
		Th = new Thread(this, "notification");

		X = 170; Y = 140; Width = 300; Height = 100;

		On = false;
		setText(str);
		setHorizontalAlignment(JLabel.CENTER);
		setBackground(Color.WHITE);
		setFont(new Font("맑은 고딕",Font.BOLD,18));
		setOpaque(true);
		setBounds(X, Y, Width, Height);
		setVisible(false);
		Th.start();
	}
	
	public void run() {
		while(true){
			if(On) {
				setVisible(true);
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					;
				}
				setVisible(false);
				On = false;
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				;
			}
		}
	}
}