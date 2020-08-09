/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota, suma = 0, promedio;
        
        
        for(int i = 1; i <= 3; i++){
            nota = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota #"+i));
            //suma = suma + nota;
            suma += nota;
        }
        
        promedio = suma / 3;
        
        
        if(promedio >= 6){
            JOptionPane.showMessageDialog(null, "Aprobaste");
        }else if(promedio > 5 && promedio < 6){
            JOptionPane.showMessageDialog(null, "Complementario");
        }else if(promedio < 5){
            JOptionPane.showMessageDialog(null, "Reprobaste :(");
        }
        
    }
    
}
