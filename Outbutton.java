import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.text.AttributeSet.ColorAttribute;

public class Outbutton {
  JButton outbutton = new JButton("입장하기");
  
  public Outbutton(){
		outbutton.setBackground(Color.blue);
    outbutton.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		outbutton.setBounds(490,30,90,20);
  }
  public JButton getOutbutton(){
    return outbutton;
  }
  
}
