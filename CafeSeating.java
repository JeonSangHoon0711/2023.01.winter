
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class CafeSeating {
	JFrame jframe = new JFrame("asdfasdfasd");
	public static PeopleNumberLabel asdf = new PeopleNumberLabel();
	public static PeopleNumberTextField ffff = new PeopleNumberTextField();
	public static ResidualSeatsLabel dddd = new ResidualSeatsLabel();
	Inbutton inbutton = new Inbutton();
	Outbutton outbutton = new Outbutton();
	backgroundPanel bgp = new backgroundPanel(new ImageIcon("background.png").getImage());
	public static notification noti = new notification("");

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
		bgp.add(noti);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}

}