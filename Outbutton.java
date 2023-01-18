import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Outbutton {
  JButton outbutton = new JButton("퇴장하기");
  
  public Outbutton(){
		outbutton.setBackground(new Color(124, 190, 249));
    outbutton.setForeground(Color.white);
    outbutton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		outbutton.setBounds(490,45,90,20);
    outbutton.addActionListener(new outListener());
  }
  public JButton getOutbutton(){
    return outbutton;
  }
  
}
