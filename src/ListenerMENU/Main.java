package ListenerMENU;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame{
	private JPanel PanMENU = new JPanel() ;
	static ListenerJOUER JOUER = new ListenerJOUER();
	static ListenerQUITTER QUITTER = new ListenerQUITTER();
	static ListenerOPTION OPTION = new ListenerOPTION();
	
	public static JFrame Menu = new JFrame() ;
	
	public Main() {
		
		
	 	Menu.setTitle("MASTERMIND") ;
	    Menu.setSize(650,280);
	    Menu.setLocationRelativeTo(null);
	    Menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    PanMENU.add(JOUER);
	    PanMENU.add(OPTION);
	    PanMENU.add(QUITTER); 
	    
	    Menu.add(PanMENU);
	    Reload.Reload.Reload.setVisible(false);
	    Menu.setVisible(true);
	}
	
	 public static void main(String[] args)   {
	    	new Main();
	    	new DomParser();
	 }

	

}
