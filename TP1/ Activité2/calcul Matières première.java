package tp1.revisions;

import java.util.*;
import java.awt.*;
import javax.swing.JOptionPane;

/**
 * @author Loris
 */


public class TP1Revisions {
    public static void main(String[] args) {
        // Init
        int hauteur, largeur, perimetre, surface;
        float prixBaguette, prixMatierePrem, prixVerre;
        
        // Saisies
        
        hauteur = Integer.parseInt(JOptionPane.showInputDialog("Hauteur en cm du tableau :"));
        largeur = Integer.parseInt(JOptionPane.showInputDialog("Largeur en cm du tableau :"));
        prixBaguette = Float.parseFloat(JOptionPane.showInputDialog("prix baguette au M :"));
        prixVerre = Float.parseFloat(JOptionPane.showInputDialog("prix verre au M^2"));
        
        // Calculs
        
        perimetre = 2 * (hauteur + largeur);
        surface = hauteur * largeur;
        prixMatierePrem = (prixVerre * surface/10000) + (prixBaguette * perimetre/100);
        
        // Output
        
        JOptionPane.showMessageDialog(null, "prix Matière Première : "+ prixMatierePrem);
    }
    
}
