
import javax.swing.JOptionPane;

/**
 * @author Loris
 */
public class Activite1 {

    public static void main(String[] args) {
        String addition;
        int res;
        res = 0;

        addition = JOptionPane.showInputDialog("Saisir une addition sous forme entier1 + entier2+..");
        do{
            int P = addition.indexOf('+');
            String nb = addition.substring(0,P);
            res += Integer.parseInt(nb);
            addition = addition.substring(P+1);            
        }while(addition.contains("+"));
        
        res += Integer.parseInt(addition);
        JOptionPane.showMessageDialog(null, "résultat =" + res);
    }
}


/*
String addition;
        int res;
        res = 0;

        addition = JOptionPane.showInputDialog("Saisir une addition sous forme entier1 + entier2");
        int P = addition.indexOf('+');
        
        
        String nb1 = addition.substring(0,P);
        String nb2 = addition.substring(P+1,addition.length());
        
        res = Integer.parseInt(nb1) + Integer.parseInt(nb2);
        
        
        
        JOptionPane.showMessageDialog(null, addition + "=" + res);
*/
