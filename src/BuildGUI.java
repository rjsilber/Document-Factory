import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class BuildGUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4331421966781835517L;
	protected JButton txtBtn = new JButton("TXT");
    protected JButton csvBtn = new JButton("CSV");
    protected JButton xmlBtn = new JButton("XML");
    private static BuildGUI singleGUI = null;
	
	
	private BuildGUI(){
		
		this.setTitle("Factory Method Design Pattern");
		this.setSize(500, 150);
		this.getContentPane().setLayout(
                new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS)); //or, can use PAGE_AXIS
		this.setResizable(false);
		
		JPanel panel1 = new JPanel();
		panel1.setPreferredSize(new Dimension(500,10));
        this.add(panel1);
        
        JLabel createDocLabel = new JLabel("Create new Document");
        panel1.add(createDocLabel);
		
        JPanel panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(500,10));
        this.add(panel2);
        
        panel2.add(txtBtn);
        panel2.add(csvBtn);
        panel2.add(xmlBtn);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
		setSingleGUI(this);	
	}


	public static BuildGUI getSingleGUI() {
		if(singleGUI == null){
			return new BuildGUI();
		}
		return singleGUI;
	}


	private static void setSingleGUI(BuildGUI singleGUI) {
		BuildGUI.singleGUI = singleGUI;
	}

}
