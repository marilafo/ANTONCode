import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;



public class DiagnoseWindow extends JFrame{
	private JButton bModify = new JButton("MODIFY");
	private JButton bMusic = new JButton("MUSIC OUTPUT");
	private JButton bSheet = new JButton("SHEET MUSIC OUTPUT");
	
	
	private JSplitPane split, split2, split3, split4;
	public DiagnoseWindow(){             
		this.setTitle("DIAGNOSE");
		this.setSize(1200,700);
		this.setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
	    
		this.setVisible(true);
	}   
	
	private JPanel buildContentPane(){
		
		JPanel panel = new JPanel();
		panel.setLayout((LayoutManager) new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setAlignmentX(0.0f);
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		panel.add(buttonPanel);
		
		
		
		buttonPanel.add(bModify);
        //distance entre les bouttons
		buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		buttonPanel.add(bMusic);
		buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		buttonPanel.add(bSheet);
		buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
		
		JPanel pan = new JPanel();
		pan.setBackground(Color.blue);  
		JPanel pan2 = new JPanel();
		pan2.setBackground(Color.red);
		JPanel pan3 = new JPanel();
		pan3.setBackground(Color.orange);
		JPanel pan4 = new JPanel();
		pan4.setBackground(Color.GREEN);
		
		//On construit enfin notre séparateur
		split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, pan, pan2);
		//On place le premier séparateur
		split.setDividerLocation(300);
		split2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, pan3, pan4);
		//On place le deuxième séparateur
		split2.setDividerLocation(50);
		
		//On passe les deux précédents JSplitPane à celui-ci
		split3 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, split, split2);
		//On place le troisième séparateur
		split3.setDividerLocation(600);
		
		
		
		
	    
	    
		panel.add(split3, BorderLayout.CENTER);
		return panel;
		
	}
}
