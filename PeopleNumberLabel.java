
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class PeopleNumberLabel {
	JLabel peoplenumberlabel = new JLabel("<html><body style = 'text-align:center;'>인원수를<br>입력하세요<body></html>");
	
	public PeopleNumberLabel() {
		
		peoplenumberlabel.setOpaque(true);
		peoplenumberlabel.setHorizontalAlignment(JLabel.CENTER);
		peoplenumberlabel.setBackground(new Color(124, 190, 249));
		peoplenumberlabel.setForeground(Color.WHITE);
		peoplenumberlabel.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		peoplenumberlabel.setBounds(290,20,100,45);
	}

	public JLabel getPeopleNumberLabel() {
		return peoplenumberlabel;
	}

	
	


	

	

	
}
