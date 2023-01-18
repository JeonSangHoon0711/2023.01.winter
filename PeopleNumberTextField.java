
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class PeopleNumberTextField {
	JTextField peoplenumbertextfield = new JTextField();
	public PeopleNumberTextField() {
		
		peoplenumbertextfield.setHorizontalAlignment(JLabel.CENTER);
		peoplenumbertextfield.setBackground(Color.pink);
		peoplenumbertextfield.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		peoplenumbertextfield.setBounds(390,20,90,45);
		
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
