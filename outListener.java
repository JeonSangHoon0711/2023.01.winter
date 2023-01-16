import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class outListener implements ActionListener{
	int seats, customer;

	public void actionPerformed(ActionEvent e) {
		seats = CafeSeating.residualseatslabel.getResidualseats();
		customer = Integer.parseInt(CafeSeating.peoplenumbertextfield.gettext());
		CafeSeating.peoplenumbertextfield.settext("");
		
		if(seats > customer){
			CafeSeating.noti.setText("감사합니다.");
			CafeSeating.noti.On = true;
			seats += customer;
			CafeSeating.residualseatslabel.setResidualseats(seats);
		}
	}
}