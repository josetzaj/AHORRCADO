package Backend;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author josue
 */
public class NFacil extends Nivel {

    public String[] palabrasFaciles = {"AVION", "BOTAS", "ARBOL", "ELOTE", "ARROZ"};
    char[] palabras;
    String palabraElegida;
    int intentos = 4;

    public NFacil() {
    }

    public String getPalabraElegida() {
        return palabraElegida;
    }

    public void setPalabraElegida(String palabraElegida) {
        this.palabraElegida = palabraElegida;
    }

    public void compararLetra(char letra, JLabel lblChar0, JLabel lblChar1, JLabel lblChar2, JLabel lblChar3, JLabel lblChar4, JLabel lblPersonaje, JFrame niveles) {
        //this.setPalabraElegida(super.obtenerPalabra(palabrasFaciles));
        //JOptionPane.showMessageDialog(null, this.getPalabraElegida());
        boolean decision = false;
        palabras = super.caracterPalabra(this.getPalabraElegida());//this.getPalabraElegida()
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] == letra) {
                decision = true;
                switch (i) {
                    case 0:
                        lblChar0.setText(String.valueOf(letra));
                        break;
                    case 1:
                        lblChar1.setText(String.valueOf(letra));
                        break;
                    case 2:
                        lblChar2.setText(String.valueOf(letra));
                        break;
                    case 3:
                        lblChar3.setText(String.valueOf(letra));
                        break;
                    case 4:
                        lblChar4.setText(String.valueOf(letra));
                        break;
                    default:
                    //JOptionPane.showMessageDialog(null, "La letra " + letra + " no se encuentra en la palabra");
                }
            } else {
                if (i == 4 && decision == false) {
                    intentos--;
                    Nivel nivel = new Nivel();
                    nivel.intentos(intentos, lblPersonaje);
                    JOptionPane.showMessageDialog(null, "La letra " + letra + " no se encuentra en la palabra. Te quedan " + intentos + " intentos.");
                    if(intentos == 0){
                        JOptionPane.showMessageDialog(null, "Ohh ya no tienes mas intentos, has perdido... :(");
                        niveles.setVisible(false);
                    }
                }
            }
        }
    }

    public void mostrarImagen(JLabel lblFigura) {
        //String ubiImagen;
        switch (this.getPalabraElegida()) {//this.getPalabraElegida()
            case "AVION":
                lblFigura.setIcon(new ImageIcon("src/Imagen/Avion.png"));
                break;
            case "BOTAS":
                lblFigura.setIcon(new ImageIcon("src/Imagen/Botas.png"));
                break;
            case "ARBOL":
                lblFigura.setIcon(new ImageIcon("src/Imagen/Arbol.png"));
                break;
            case "ELOTE":
                lblFigura.setIcon(new ImageIcon("src/Imagen/Elote.png"));
                break;
            case "ARROZ":
                lblFigura.setIcon(new ImageIcon("src/Imagen/Arroz.png"));
                break;
//            default:
//                throw new AssertionError();
        }
    }

    //Verifica si el label contiene un caracter o se encuentra vacio
    public void camposCaracter(JButton btnNuevaPalabra ,JLabel lblChar0, JLabel lblChar1, JLabel lblChar2, JLabel lblChar3, JLabel lblChar4) {
        int camposLlenos = 0;
        //for (int i = 0; i < this.getPalabraElegida().length(); i++) {
        if (!lblChar0.getText().isEmpty()) {
            camposLlenos++;
        }
        if (!lblChar1.getText().isEmpty()) {
            camposLlenos++;
        }
        if (!lblChar2.getText().isEmpty()) {
            camposLlenos++;
        }
        if (!lblChar3.getText().isEmpty()) {
            camposLlenos++;
        }
        if (!lblChar4.getText().isEmpty()) {
            camposLlenos++;
        }
        if(camposLlenos == 5){
            JOptionPane.showMessageDialog(null, "Enhorabuena!!! Has completado la palabra");
            btnNuevaPalabra.setVisible(true);
        }
    }
}
