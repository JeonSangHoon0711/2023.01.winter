
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class PeopleNumberTextField {
	JTextField peoplenumbertextfield = new JTextField();
	public PeopleNumberTextField() {
		
		peoplenumbertextfield.setHorizontalAlignment(JLabel.CENTER);
		
		peoplenumbertextfield.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		peoplenumbertextfield.setBounds(390,20,90,45);
		peoplenumbertextfield.setBorder(null);
		peoplenumbertextfield.setBackground(new Color(124, 190, 249));
		peoplenumbertextfield.setForeground(Color.WHITE);
	}
	public JTextField getPeoplenumbertextfield() {
		return peoplenumbertextfield;
	}
	public String gettext (){
		return peoplenumbertextfield.getText();
	}
	public void settext (String text){
		peoplenumbertextfield.setText(text);
	}

}
