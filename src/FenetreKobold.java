import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.WindowListener;

public class FenetreKobold extends JFrame{
	
	public FenetreKobold () {
		Container c = this.getContentPane() ;
		c.add(new VueKobold());
		
        this.pack();
        this.setSize(1600,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	}

	public static void main (String[] s) {
		new FenetreKobold();
	}

}