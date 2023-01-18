
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class ResidualSeatsLabel {
	static int residualseats = 30;
	JLabel residualseatslabel = new JLabel("<html><body style = 'text-align:center;'>잔여 좌석 수 <br> "+ residualseats + "<body></html>");
	public ResidualSeatsLabel() {
		residualseatslabel.setHorizontalAlignment(JLabel.CENTER);
		residualseatslabel.setBounds(235, 300, 170, 100);
		residualseatslabel.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		residualseatslabel.setOpaque(true);
		residualseatslabel.setBackground(Color.pink);
		
		
	}
	public JLabel getResidualseatslabel() {
		return residualseatslabel;
	}
	public void setResidualseatslabel(JLabel residualseatslabel) {
		this.residualseatslabel = residualseatslabel;
	}
	public int getResidualseats() {
		return residualseats;
	}
	public void setResidualseats(int residualseats) {
		this.residualseats = residualseats;
	}

}
