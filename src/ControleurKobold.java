import java.awt.event.*;
import javax.swing.*;
import java.io.Serializable;

public class ControleurKobold implements MouseListener, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4459033474271754570L;
	private VueKobold vue;
	private ModeleKobold modele;
	
	
	public ControleurKobold (VueKobold v) {
		this.vue = v;
		this.modele = new ModeleKobold();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		this.modele.genKobold();
		vue.afficherStats(modele.getTabStats());
		vue.afficherAlignement(modele.getAlignement());
		vue.afficherBonus(modele.getBonus());
		vue.afficherMalus(modele.getMalus());
		vue.afficherEquipement(modele.getTabEquipement());
		vue.afficherSexe(modele.getSexe());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}