import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Inbutton {
  JButton inbutton = new JButton("입장하기");
  
  public Inbutton(){
		inbutton.setBackground(Color.blue);
    inbutton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		inbutton.setBounds(490,10,90,20);
  }
  public JButton getInbutton(){
    return inbutton;
  }
  
}
