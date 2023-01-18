import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Inbutton {
  JButton inbutton = new JButton("입장하기");
  
  public Inbutton(){
		inbutton.setBackground(new Color(124, 190, 249));
    inbutton.setForeground(Color.WHITE);
    inbutton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		inbutton.setBounds(490,20,90,20);
    inbutton.addActionListener(new inListener());
  }
  public JButton getInbutton(){
    return inbutton;
  }
  
}
