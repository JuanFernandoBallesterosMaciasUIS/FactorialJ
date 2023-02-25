package ejecutable;

import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        int n, total;
        total = 1;

        n = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite un número entero positivo para sacarle la facotiral: "));

        if (n > -1) {
            for (int i = 1; i < n; i++) {
                total = total + total * i;

            }
            JOptionPane.showMessageDialog(null, "La Factorial de " + n + " es igual a: " + total,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "Lo que dijitaste no es un número entero positivo",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

        }

    }
}