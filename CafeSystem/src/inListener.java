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
			//frame.noti.setText("�ܿ��¼��� �����ϴ�.");
			//frame.noti.On = true;
		}
		else {
			//frame.noti.setText("ȯ���մϴ�.");
			//frame.noti.On = true;
			seats -= customer;
			//frame.seatLabel.setText(seats+"");
		}
	}
}