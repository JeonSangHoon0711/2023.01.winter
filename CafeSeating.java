
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class CafeSeating {
	JFrame jframe = new JFrame("asdfasdfasd");
	PeopleNumberLabel asdf = new PeopleNumberLabel();
	PeopleNumberTextField ffff = new PeopleNumberTextField();
	ResidualSeatsLabel dddd = new ResidualSeatsLabel();
	Inbutton inbutton = new Inbutton();
	Outbutton outbutton = new Outbutton();
	
	String str = "/background.png";
	ImageIcon img = new ImageIcon(str);
	
	public CafeSeating() {

		jframe.setLayout(null);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setSize(640, 480);
		jframe.add(asdf.getPeopleNumberLabel());
		jframe.add(ffff.getPeoplenumbertextfield());
		jframe.add(dddd.getResidualseatslabel());
		
		jframe.add(new backgroundPanel(img));

		jframe.add(inbutton.getInbutton());
		jframe.add(outbutton.getOutbutton());
		

		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}

	public void go() {
		while (true) {
			dddd.getResidualseatslabel().setText("<html><body style = 'text-align:center;'>잔여 좌석 수 <br> "
					+ dddd.getResidualseats() + "<body></html>");
			dddd.setResidualseats(dddd.getResidualseats() + 1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jframe.repaint();
		}
	}
}