/**
 * @author Loris
 */


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JPanel;

public class Img extends JPanel{
	Image img;
	public Img (int noImage)
	{	File file;
    	
    	file = new File("/Users/etudiant/Desktop/dés/" + noImage + ".jpg");
    	try
    	{	
    	   FileImageInputStream fiis = new FileImageInputStream(file);
    	   img = ImageIO.read(fiis);
    	 }
    	catch (Exception e)
    	{	e.printStackTrace();
    	   
    	}
	}
	  public void paint(Graphics g) {
	    	g.drawImage(img,0,0,getWidth(),getHeight(),Color.green,null);
	    	
	   }
}
