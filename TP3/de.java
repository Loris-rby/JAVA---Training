/**
 * @author Loris
 */

import java.awt.Panel;
import java.util.Random;
import javax.swing.JPanel;

public class de {
	private int laFace;
	public de()
	{	laFace = 1;
	}
	public int getLaFaceVisible() 
	{ 	return (laFace);
	
	}
	public void lancer()
	{	Random rnd;
		rnd = new Random();
		
		
		laFace = rnd.nextInt(6)+ 1;
		
	}
	public void afficher (JPanel leTapis, int lAbscisse, int lOrdonnée)
	{	Img lImage = new Img(laFace);
		lImage.setBounds(lAbscisse,lOrdonnée,124,127);
		leTapis.add((lImage));
	}
}

