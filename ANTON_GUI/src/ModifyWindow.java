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


public class ModifyWindow extends JFrame {
	private JLabel style = new JLabel("STYLE");
	private JLabel time = new JLabel("TIME");
	private JLabel mode = new JLabel("MODE");
	private JLabel rhythm = new JLabel("RHYTHM");
	private JLabel timeSignature = new JLabel("TIME-SIGNATURE");
	
	private JButton modify = new JButton("Modify");
	private JButton reset = new JButton("Reset");
	private JButton experiment = new JButton("Experiment");
	
	private JTextField textFieldTime = new JTextField();
	private JTextField textFieldTimeSignature = new JTextField();
	
	private JComboBox<Object> styleChoice; // faire la gestion des évenements pour JComboBox
	private JComboBox<Object> modeChoice;
	
	private Checkbox rhythmCheck = new Checkbox();
	
	
	
	public ModifyWindow(){             
		this.setTitle("MODIFY");
		this.setSize(251,270);
		this.setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	    
		this.setVisible(true);
	}   
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout((LayoutManager) new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		
		
		textFieldTime.setColumns(2);
		textFieldTimeSignature.setColumns(2);
		
		
		
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
		timePanel.add(Box.createRigidArea(new Dimension(185, 0)));
		
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
		timeSignaturePanel.add(Box.createRigidArea(new Dimension(115, 0)));
		
		panel.add(Box.createRigidArea(new Dimension(0, 20)));

		//Buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setAlignmentX(0.0f);
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		panel.add(buttonPanel);
		
		buttonPanel.add(modify);
		buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		buttonPanel.add(reset);
        //distance entre les bouttons
		buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		buttonPanel.add(experiment);
		buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
       

        
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        
        return panel;
	}
  
}
