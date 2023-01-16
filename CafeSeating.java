
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class CafeSeating {

	JFrame jframe = new JFrame("peoplenumberlabelasd");
	PeopleNumberLabel peoplenumberlabel = new PeopleNumberLabel();
	PeopleNumberTextField peoplenumbertextfield = new PeopleNumberTextField();
	ResidualSeatsLabel residualseatslabel = new ResidualSeatsLabel();
	Inbutton inbutton = new Inbutton();
	Outbutton outbutton = new Outbutton();
	backgroundPanel bgp = new backgroundPanel(new ImageIcon("background.png").getImage());


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