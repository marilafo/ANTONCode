//import java.awt.Color; 



import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class MainWindow extends JFrame  {
	private JLabel style = new JLabel("STYLE");
	private JLabel time = new JLabel("TIME");
	private JLabel mode = new JLabel("MODE");
	private JLabel rhythm = new JLabel("RHYTHM");
	private JLabel timeSignature = new JLabel("TIME-SIGNATURE");
	private JLabel piece = new JLabel("PIECE");
	
	private JButton compose = new JButton("Compose");
	private JButton diagnose = new JButton("Diagnose");
	private JButton experiment = new JButton("Experiment");
	private JButton settings = new JButton("Settings");
	private JButton search = new JButton("Search");
	
	private JTextField textFieldTime = new JTextField();
	private JTextField textFieldTimeSignature = new JTextField();
	private JTextField textFieldPiece = new JTextField();
	
	private JComboBox<Object> styleChoice; // faire la gestion des évenements pour JComboBox
	private JComboBox<Object> modeChoice;
	
	private Checkbox rhythmCheck = new Checkbox();
	
	
	
	public MainWindow(){             
		this.setTitle("Ma première fenêtre Java");
		this.setSize(375,315);
		this.setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	    
		this.setVisible(true);
	}   
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout((LayoutManager) new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
		
		//compose.addActionListener(this);
		//diagnose.addActionListener(this);
		//JButton compose = new JButton(new TextAction("Cliquez ici !"));
		
		textFieldTime.setColumns(2);
		textFieldTimeSignature.setColumns(2);
		textFieldPiece.setColumns(40);
		
		
		Object[] elementsStyle = new Object[]{"solo", "duet", "trio", "quartet"};
		Object[] elementsMode = new Object[]{"minor", "major", "dorian", "phrygian", "lydian", "mixolydian" };
		styleChoice = new JComboBox<Object>(elementsStyle);
		modeChoice = new JComboBox<Object>(elementsMode);
		
		rhythmCheck.setState(false);
		
		//style
		JPanel stylePanel = new JPanel();
		stylePanel.setAlignmentX(0.0f);
		stylePanel.setLayout(new BoxLayout(stylePanel, BoxLayout.X_AXIS));
		panel.add(stylePanel);
		stylePanel.add(style);
		stylePanel.add(Box.createRigidArea(new Dimension(15, 0)));
		stylePanel.add(styleChoice);
		stylePanel.add(Box.createRigidArea(new Dimension(240, 0)));
		
		panel.add(Box.createRigidArea(new Dimension(0, 20)));
		//time
		JPanel timePanel = new JPanel();
		timePanel.setAlignmentX(0.0f);
		timePanel.setLayout(new BoxLayout(timePanel, BoxLayout.X_AXIS));
		panel.add(timePanel);
		timePanel.add(time);
		timePanel.add(Box.createRigidArea(new Dimension(15, 0)));
		timePanel.add(textFieldTime);
		timePanel.add(Box.createRigidArea(new Dimension(300, 0)));
		
		panel.add(Box.createRigidArea(new Dimension(0, 20)));
		//mode
		JPanel modePanel = new JPanel();
		modePanel.setAlignmentX(0.0f);
		modePanel.setLayout(new BoxLayout(modePanel, BoxLayout.X_AXIS));
		panel.add(modePanel);
		
		modePanel.add(mode);
		modePanel.add(Box.createRigidArea(new Dimension(15, 0)));
		modePanel.add(modeChoice);
		modePanel.add(Box.createRigidArea(new Dimension(200, 0)));
		
		panel.add(Box.createRigidArea(new Dimension(0, 20)));
		//rhythm
		JPanel rhythmPanel = new JPanel();
		rhythmPanel.setAlignmentX(0.0f);
		rhythmPanel.setLayout(new BoxLayout(rhythmPanel, BoxLayout.X_AXIS));
		panel.add(rhythmPanel);
		
		rhythmPanel.add(rhythm);
		rhythmPanel.add(Box.createRigidArea(new Dimension(15, 0)));
		rhythmPanel.add(rhythmCheck);
		rhythmPanel.add(Box.createRigidArea(new Dimension(15, 0)));
		
		panel.add(Box.createRigidArea(new Dimension(0, 20)));
		//time signature
		JPanel timeSignaturePanel = new JPanel();
		timeSignaturePanel.setAlignmentX(0.0f);
		timeSignaturePanel.setLayout(new BoxLayout(timeSignaturePanel, BoxLayout.X_AXIS));
		panel.add(timeSignaturePanel);
		
		timeSignaturePanel.add(timeSignature);
		timeSignaturePanel.add(Box.createRigidArea(new Dimension(15, 0)));
		timeSignaturePanel.add(textFieldTimeSignature);
		timeSignaturePanel.add(Box.createRigidArea(new Dimension(235, 0)));
		
		panel.add(Box.createRigidArea(new Dimension(0, 20)));
		
		//Piece
		JPanel piecePanel = new JPanel();
		piecePanel.setAlignmentX(0.0f);
		piecePanel.setLayout(new BoxLayout(piecePanel, BoxLayout.X_AXIS));
		panel.add(piecePanel);
		
		
		piecePanel.add(piece);
		piecePanel.add(Box.createRigidArea(new Dimension(15, 0)));
		piecePanel.add(textFieldPiece);
		piecePanel.add(Box.createRigidArea(new Dimension(20, 0)));
		piecePanel.add(search);
		
		panel.add(Box.createRigidArea(new Dimension(0, 20)));
		//Buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setAlignmentX(0.0f);
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		panel.add(buttonPanel);
		
		buttonPanel.add(compose);
		buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		buttonPanel.add(diagnose);
        //distance entre les bouttons
		buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		buttonPanel.add(experiment);
		buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		buttonPanel.add(settings);
		buttonPanel.add(Box.createRigidArea(new Dimension(15, 0)));
       

        
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        
        return panel;
	}
  
	/*public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
 
		if(source == compose){
			System.out.println("Vous avez cliqué sur compose.");
		} 
		else if(source == diagnose){
			System.out.println("Vous avez cliqué sur diagnose");	
		}
	}*/
}
