package ListenerMENU;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
	

public class OPTION extends JFrame{
	
	private JPanel pan1 = new JPanel(); 
	private JPanel pan2 = new JPanel(); 
	private JPanel pan3 = new JPanel(); 
	private JComboBox comboNbTour = new JComboBox();
	public static JFrame op = new JFrame();
	private JLabel NbTour = new JLabel("Nombre de Tour");
	private JLabel NbCouleur = new JLabel("Nombre de Couleur");
	private JLabel VoirRep = new JLabel("Voir les réponses");
	String[] tab = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	String[] tabYN = {"0" ,"1"};
	JComboBox comboNbCouleur = new JComboBox(tab);
	JComboBox comboVoirRep = new JComboBox(tabYN);
	static JTextField JTNbTour = new JTextField();
	Retour RETOUR = new Retour();
	public OPTION(){
		
	    //…
		op.setTitle("MASTERMIND option") ;
	    op.setSize(650,280);
	    op.setLocationRelativeTo(null);
	    op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // Reading from System.in
	   
	    
	    JTNbTour.setPreferredSize(new Dimension(100, 20));
	    pan3.add(NbTour);
	    pan3.add(JTNbTour);
	    comboNbCouleur.setPreferredSize(new Dimension(100, 20));
	    comboNbCouleur.addItem(tab);
	    pan1.add(NbCouleur);
	    pan1.add(comboNbCouleur);
	    comboVoirRep.setPreferredSize(new Dimension(100, 20));
	    comboVoirRep.addItem(tabYN);
	    pan2.add(VoirRep);
	    pan2.add(comboVoirRep);
	  //  comboNbCouleur.addItemListener(new ItemState1());
	    comboNbCouleur.addActionListener(new ItemAction1());
	  //  comboVoirRep.addItemListener(new ItemState2());
	    comboVoirRep.addActionListener(new ItemAction2());
	    pan2.setBounds(0,100,650,50);
	    pan1.setBounds(0,50	,650,50);
	    pan3.setBounds(0,150,650,50);
	    op.add(pan1);
	    op.add(pan2);
	    op.add(pan3);
	    pan3.add(RETOUR);
	    op.add(pan3);
	    op.setVisible(true);
	   
	    //…         
	  }
	
	class ItemAction1 implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	      System.out.println("ActionListener : action sur " + comboNbCouleur.getSelectedItem());
	      String n = comboNbCouleur.getSelectedItem().toString();
	      int nn = Integer.parseInt(n);
	      ListenerMENU.DomParser.NbCouleur = nn ;
	      
	    }               
	  }
	

	class ItemAction2 implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	      System.out.println("ActionListener : action sur " + comboVoirRep.getSelectedItem());
	      String o = comboVoirRep.getSelectedItem().toString();
	      int oo = Integer.parseInt(o);
	      System.out.println(oo);
	      ListenerMENU.DomParser.VoirRep = oo ;
	    }               
	  }
	
}
