/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaccion;

import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class Transaccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int saldo;
        String user="";
        double cuenta= 0;
        String fin;
        fin = "";
        saldo = 70;

        do {
            String opcion = JOptionPane.showInputDialog(null, " Elige la transaccion que quieres hacer: " + " \n " + " 1= usuario " + " \n " + " 2= Cuenta" + " \n " + "3= Revisar tu Saldo");
            int no;
            no = Integer.parseInt(opcion);
            switch (no) {
                case 1:
                    String nuser = JOptionPane.showInputDialog(null, "Ingresa el Usuario");
                 
                    JOptionPane.showMessageDialog(null, "Tu usuario es:" + (user));
                    break;
                case 2:
                    String Ncuenta = JOptionPane.showInputDialog(null, "Ingresa el numero de cuenta");
                   
                    JOptionPane.showMessageDialog(null, "tu numero de cuenta es:= " + (cuenta));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Tu saldo actual es= $" + saldo);
                    break;
            }
            JOptionPane.showInputDialog("¿Deseas hacer otra operación?" + " \n " + " 1= si" + " \n " + " 2= no");

        } while (fin == "");
        JOptionPane.showMessageDialog(null, "Gr... por hacer uso del cajero");
        System.exit(0);
    }

}


