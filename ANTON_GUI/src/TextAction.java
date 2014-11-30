import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;


public class TextAction extends AbstractAction {
	public TextAction(String texte){
		super(texte);
	}
	 
	public void actionPerformed(ActionEvent e) { 
		System.out.println("Vous avez cliqué ici");
	} 

}
