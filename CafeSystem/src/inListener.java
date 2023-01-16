import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class inListener implements ActionListener{
	notification noti;
	int seats, customer;

	public void actionPerformed(ActionEvent e) {
		//seats = Integer.parseInt(frame.seatLabel.getText());
		//customer = Integer.parseInt(frame.txtf.getText());
		//frame.txtf.setText("");
		
		if(seats-customer <= 0) {
			//frame.noti.setText("잔여좌석이 없습니다.");
			//frame.noti.On = true;
		}
		else {
			//frame.noti.setText("환영합니다.");
			//frame.noti.On = true;
			seats -= customer;
			//frame.seatLabel.setText(seats+"");
		}
	}
}