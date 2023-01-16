
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class CafeSeating {
	JFrame jframe = new JFrame("asdfasdfasd");
	PeopleNumberLabel asdf = new PeopleNumberLabel();
	PeopleNumberTextField ffff = new PeopleNumberTextField();
	ResidualSeatsLabel dddd = new ResidualSeatsLabel();
	Inbutton inbutton = new Inbutton();
	Outbutton outbutton = new Outbutton();
	backgroundPanel bgp = new backgroundPanel(new ImageIcon("background.png").getImage());

	public CafeSeating() {

		jframe.setLayout(null);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setSize(640, 480);
		jframe.add(bgp);
		bgp.add(asdf.getPeopleNumberLabel());
		bgp.add(ffff.getPeoplenumbertextfield());
		bgp.add(dddd.getResidualseatslabel());
		bgp.add(inbutton.getInbutton());
		bgp.add(outbutton.getOutbutton());
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}

}