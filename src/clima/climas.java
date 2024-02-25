/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clima;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class climas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Tabla día por temperaturas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Solicitar al usuario la cantidad de días mediante una ventana de diálogo
        String valor = JOptionPane.showInputDialog(frame, "Ingrese la Cantidad de Días");
        int lluvias = Integer.parseInt(valor);
        Clima lluvioso = new Clima(lluvias);
        
        lluvioso.inicializarVentana();
        lluvioso.mostrarVentanaEdicion();
    }
    
}
