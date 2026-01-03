/**
 * @author Loris
 */


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProjYams {

    public static void main(String[] args) {

        JFrame écran = new JFrame();
        JPanel leTapis = (JPanel) écran.getContentPane();
        JLabel message = new JLabel();

        écran.setSize(1000, 700);
        écran.setTitle("Jeu de dés");
        leTapis.setBackground(Color.green);
        leTapis.setLayout(null);
        
        Font laPolice = new Font("SansSerif", Font.BOLD, 30);
        message.setFont(laPolice);
        message.setBounds(200, 500, 800, 200);
        leTapis.add(message);

        // Ajout perso d'une partie bouton pour pouvoir rejouer au jeu sans relancer
        JButton bouton = new JButton("Relancer");
        bouton.setBounds(400, 50, 200, 50);
        leTapis.add(bouton);

        bouton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                // supression des anciens dés
                leTapis.removeAll();
                
                // Ajout bouton et message 
                leTapis.add(bouton);
                leTapis.add(message);
                leTapis.repaint(); 

                // Lancement du jeu
                ArrayList leJeu = new ArrayList();
                jeu jeu = new jeu(leJeu);
                de leDé;
                int i;

                for (i = 1; i <= 5; i++) {
                    leDé = new de();
                    leDé.lancer();
                    jeu.add(leDé);
                }

                for (i = 0; i <= jeu.size() - 1; i++) {
                    leDé = (de) jeu.get(i);
                    leDé.afficher(leTapis, 150 * i + 50, 250);
                }
                
                // Tes tests de combinaisons
                if (jeu.estBrelan()) {
                    if (jeu.estYams()){
                        message.setText("Bravo, c'est un YAMS");
                    }
                    else if (jeu.estCarre()){
                        message.setText("Bravo, c'est un Carré");
                    }
                    else if (jeu.estFull()){
                        message.setText("Bravo, c'est un FULL");
                    }
                    else{
                        message.setText("Bravo, c'est un Brelan");
                    }
                } else if (jeu.estUneSuite() != ""){
                    message.setText(jeu.estUneSuite());
                }
                else {
                    message.setText("Dommage aucune combinaisons Il faut re essayer !");
                }
            }
        });

        écran.setVisible(true);
    }
}