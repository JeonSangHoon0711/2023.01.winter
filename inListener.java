import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class inListener implements ActionListener{
	notification noti;
	int seats, customer;

	public void actionPerformed(ActionEvent e) {
		seats = Integer.parseInt(CafeSeating.dddd.getText());
		customer = Integer.parseInt(CafeSeating.ffff.getText());
		CafeSeating.ffff.settext("");
		
		if(seats-customer <= 0) {
			CafeSeating.noti.setText("좌석이 없습니다.");
			CafeSeating.noti.On = true;
		}
		else {
			CafeSeating.noti.setText("환영합니다.");
			CafeSeating.noti.On = true;
			seats -= customer;
			CafeSeating.dddd.setText(seats);
		}
	}
}
