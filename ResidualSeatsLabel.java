package testest;

import java.awt.Font;

import javax.swing.JLabel;

public class ResidualSeatsLabel {
	int residualseats = 0;
	JLabel residualseatslabel = new JLabel("<html><body style = 'text-align:center;'>ÀÜ¿© ÁÂ¼® ¼ö <br> "+ residualseats + "<body></html>");
	public ResidualSeatsLabel() {
		residualseatslabel.setBounds(210, 190, 300, 250);
		residualseatslabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 25));
		
		
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
