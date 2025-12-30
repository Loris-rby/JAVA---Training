package tp1.revisions;

import java.util.*;
import java.awt.*;
import javax.swing.JOptionPane;

/**
 * @author Loris
 */
public class TP1Revisions {

    public static void main(String args[]) {
        // Init
        int nombreADeviner, nombrePropose, nbTentatives;
        boolean trouve;
        Random rnd;
        nbTentatives = 0;
        rnd = new Random();
        nombreADeviner = rnd.nextInt(100) + 1;
        
        // Main
        System.out.println("nombre : " + nombreADeviner);
        trouve = false;
        do {
            nombrePropose = Integer.parseInt(JOptionPane.showInputDialog("Propose un nombre"));
            if (nombrePropose > nombreADeviner) {
                JOptionPane.showMessageDialog(null, "Ton nombre est trop grand");
            } else {
                if (nombrePropose < nombreADeviner) {
                    JOptionPane.showMessageDialog(null, "Ton nombre est trop petit");
                } else {
                    JOptionPane.showMessageDialog(null, "Bravo");
                    trouve = true;
                }
            }
            nbTentatives +=1;
        } while (nbTentatives !=5);
        if (trouve == false){
            JOptionPane.showMessageDialog(null, "Dommage c'était : " + nombreADeviner);
        }
    }

}
