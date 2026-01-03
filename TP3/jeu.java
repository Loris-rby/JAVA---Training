
/**
 * @author Loris
 */


import java.util.*;

public class jeu {

    ArrayList jeu;
    int indexDuBrelan;

    public jeu(ArrayList lejeu) {
        this.jeu = lejeu;
        this.indexDuBrelan = -1;    // Je l'utilise uniquement si il y a un brelan pour stocker le chiffre du dé associé 
    }

    public void add(de leDe) {
        this.jeu.add(leDe);
    }

    public int size() {
        return this.jeu.size();
    }

    public de get(int i) {
        return (de) this.jeu.get(i);
    }

    // Methode qui trie les dés
    public void trierLesDes() {
        int taille = this.jeu.size();
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille - 1; j++) {

                de de1 = (de) this.jeu.get(j);
                de de2 = (de) this.jeu.get(j + 1);

                if (de1.getLaFaceVisible() > de2.getLaFaceVisible()) {
                    this.jeu.set(j, de2);    
                    this.jeu.set(j + 1, de1); 
                }
            }
        }
    }

    // -- LES FONCTIONS DE TEST DE COMBINAISIONS --
    public boolean estBrelan() {
        for (int i = 0; i <= this.jeu.size() - 1; i++) {
            de leDeTest = (de) this.jeu.get(i);
            int laFaceTest = leDeTest.getLaFaceVisible();
            int cpt = 0;
            for (int j = 0; j <= this.jeu.size() - 1; j++) {
                de leDe = (de) this.jeu.get(j);
                int laFace = leDe.getLaFaceVisible();
                if (laFace == laFaceTest) {
                    cpt += 1;
                }
            }
            if (cpt >= 3) {
                this.indexDuBrelan = i;
                return true;
            }
        }
        return false;

    }

    public boolean estCarre() {
        for (int i = 0; i <= this.jeu.size() - 1; i++) {
            de leDeTest = (de) this.jeu.get(i);
            int laFaceTest = leDeTest.getLaFaceVisible();
            int cpt = 0;
            for (int j = 0; j <= this.jeu.size() - 1; j++) {
                de leDe = (de) this.jeu.get(j);
                int laFace = leDe.getLaFaceVisible();
                if (laFace == laFaceTest) {
                    cpt += 1;
                }
            }
            if (cpt == 4) {
                this.indexDuBrelan = i;
                return true;
            }
        }
        return false;

    }

    public boolean estYams() {
        for (int i = 0; i <= this.jeu.size() - 1; i++) {
            de leDeTest = (de) this.jeu.get(i);
            int laFaceTest = leDeTest.getLaFaceVisible();
            int cpt = 0;
            for (int j = 0; j <= this.jeu.size() - 1; j++) {
                de leDe = (de) this.jeu.get(j);
                int laFace = leDe.getLaFaceVisible();
                if (laFace == laFaceTest) {
                    cpt += 1;
                }
            }
            if (cpt == 5) {
                this.indexDuBrelan = i;
                return true;
            }
        }
        return false;

    }

    public boolean estFull() {   // Je l'appelle uniquement si je sais que c'est un brelan pour voir si il y a aussi une pair
        ArrayList PaireIndex = new ArrayList();
        de leBrelan = (de) this.jeu.get(indexDuBrelan);
        int valeurBrelan = leBrelan.getLaFaceVisible();

        for (int i = 0; i <= this.jeu.size() - 1; i++) {
            de leDeTest = (de) this.jeu.get(i);
            int laFaceTest = leDeTest.getLaFaceVisible();
            if (laFaceTest != valeurBrelan) {
                PaireIndex.add(i);
            }
        }
        de test1 = (de) this.jeu.get((int) PaireIndex.get(0));
        de test2 = (de) this.jeu.get((int) PaireIndex.get(1));
        if (test1.getLaFaceVisible() == test2.getLaFaceVisible()) {
            return true;
        }
        return false;

    }

    public String estUneSuite() {
        // variable pour savoir si c'est une grande ou petite suite ou rien
        int cpt = 0;
        String message = "";
        // trié les de 
        this.trierLesDes();

        for (int i = 0; i <= this.jeu.size() - 2; i++) {
            de leDe = (de) this.jeu.get(i);
            int laFace = leDe.getLaFaceVisible();
            de leDeSuivant = (de) this.jeu.get(i + 1);
            int laFaceSuivante = leDeSuivant.getLaFaceVisible();

            if (laFace + 1 == laFaceSuivante) {
                cpt += 1;
            }
            else{
                cpt =0;
            }

        }
        if (cpt == 4) {
            message = "C'est une grande Suite !";
        }
        if (cpt == 3) {
            message = "C'est une petite Suite !";
        }
        return message;

    }

}
