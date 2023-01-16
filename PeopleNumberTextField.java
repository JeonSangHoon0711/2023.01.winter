package testest;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class PeopleNumberTextField {
	JTextField peoplenumbertextfield = new JTextField();
	public PeopleNumberTextField() {
		
		peoplenumbertextfield.setHorizontalAlignment(JLabel.CENTER);
		peoplenumbertextfield.setBackground(Color.pink);
		peoplenumbertextfield.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		peoplenumbertextfield.setBounds(460,10,40,30);
	}
	public JTextField getPeoplenumbertextfield() {
		return peoplenumbertextfield;
	}

}
