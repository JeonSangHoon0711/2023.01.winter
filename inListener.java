import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class inListener implements ActionListener{
	notification noti;
	int seats, customer;

	public void actionPerformed(ActionEvent e) {
		seats = CafeSeating.residualseatslabel.getResidualseats();
		customer = Integer.parseInt(CafeSeating.peoplenumbertextfield.gettext());
		CafeSeating.peoplenumbertextfield.settext("");

		if(seats-customer < 0) {
			CafeSeating.noti.setText("잔여좌석이 없습니다.");
			CafeSeating.noti.On = true;
		}
		else {
			CafeSeating.noti.setText("환영합니다.");
			CafeSeating.noti.On = true;
			seats -= customer;
			CafeSeating.residualseatslabel.setResidualseats(seats);
			CafeSeating.residualseatslabel.residualseatslabel.setText("<html><body style = 'text-align:center; font-size:30px'><div style = font-size:12px>잔여 좌석 수</div>"+ seats + "<body></html>");
		}
	}
}