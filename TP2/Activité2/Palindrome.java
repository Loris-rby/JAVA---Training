package tp2.revisions;

import javax.swing.*;


/**
 * @author Loris
 */
public class TP2Revisions {
    public static void main(String[] args) {
        // Init
        String chaine, reverse ="";
        int i, len;
        
        // Main
        chaine = JOptionPane.showInputDialog("Saisir le mot a verifier");

        
        len = chaine.length();

        for (i = (len - 1); i >= 0; i--){
            reverse+=chaine.charAt(i);
        }
        if (reverse.equals(chaine)){
            JOptionPane.showMessageDialog(null, chaine + " est un palindrome");
        }else{
            JOptionPane.showMessageDialog(null, chaine + " n'est pas un palindrome");
        }
        
    }
    
}
