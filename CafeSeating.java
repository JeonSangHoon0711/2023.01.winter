
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class CafeSeating {
	JFrame jframe = new JFrame("peoplenumberlabelasd");
	public static PeopleNumberLabel peoplenumberlabel = new PeopleNumberLabel();
	public static PeopleNumberTextField peoplenumbertextfield = new PeopleNumberTextField();
	public static ResidualSeatsLabel residualseatslabel = new ResidualSeatsLabel();
	public static Inbutton inbutton = new Inbutton();
	public static Outbutton outbutton = new Outbutton();
	public static backgroundPanel bgp = new backgroundPanel(new ImageIcon("background.png").getImage());
//a
	public CafeSeating() {

		jframe.setLayout(null);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setSize(640, 480);
		jframe.add(bgp);
		bgp.add(peoplenumberlabel.getPeopleNumberLabel());
		bgp.add(peoplenumbertextfield.getPeoplenumbertextfield());
		bgp.add(residualseatslabel.getResidualseatslabel());
		bgp.add(inbutton.getInbutton());
		bgp.add(outbutton.getOutbutton());
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}

}