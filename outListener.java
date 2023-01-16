import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class outListener implements ActionListener{
	int seats, customer;

	public void actionPerformed(ActionEvent e) {
		seats = Integer.parseInt(frame.seatLabel.getText());
		customer = Integer.parseInt(frame.txtf.getText());
		frame.txtf.setText("");
		
		frame.noti.setText("감사합니다.");
		frame.noti.On = true;
		seats += customer;
		frame.seatLabel.setText(seats+"");
	}
}