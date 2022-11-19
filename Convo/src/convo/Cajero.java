
package convo;

import javax.swing.JOptionPane;

public class Cajero {
    private double saldo;

    public Cajero() {
    }

    public Cajero(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
     public static String menu = "¿Que deseas realizar?\n\n" +
                                "    1.- Realizar un deposito.\n" +
                                "    2.- Realizar un retiro.\n" +
                                "    3.- Revisar tu saldo.\n" +
                                "    4.- Salir.";


    public int Cajero() {
        saldo = getSaldo();
        
        return (int) saldo;
    }
    static double saldoInicial() {
        double saldo = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "¿Con que cantidad desea abrir su cuenta?"
            )
        );
        return saldo;
    }


    public void realizarDeposito() {
        double abono = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "¿Cuanto deaseas abonar?"
            )
        );
        saldo += abono;
    }


    public void realizarRetiro() {
        double retiro = Double.parseDouble(
            JOptionPane.showInputDialog(
                null,
                "¿Cuanto deseas retirar?"
            )
        );
        if ((saldo - retiro) >= 0) {
            saldo -= retiro;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
        }
    }


    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, "El saldo actual es: $" + saldo);
    }
}