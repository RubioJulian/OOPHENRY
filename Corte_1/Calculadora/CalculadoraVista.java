package calculadora;

import javax.swing.JOptionPane;

public class CalculadoraVista {

    public String mostrarMenu() {
        String[] opciones = {
            "Suma",
            "Resta",
            "Multiplicación",
            "División",
            "Potenciación",
            "Raíz cuadrada",
            "Factorial",
            "Áreas", // <-- NUEVA OPCIÓN
            "Salir"
        };
        return (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una operación:",
                "Calculadora",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);
    }

    // Submenú de áreas
    public String mostrarSubmenuAreas() {
        String[] figuras = {
            "Cuadrado",
            "Rectángulo",
            "Circunferencia",
            "Triángulo rectángulo"
        };
        return (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una figura:",
                "Cálculo de áreas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                figuras,
                figuras[0]);
    }

    public double pedirNumero(String mensaje) {
        try {
            String input = JOptionPane.showInputDialog(mensaje);
            if (input == null) return Double.NaN;
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            mostrarError("Entrada no válida.");
            return Double.NaN;
        }
    }

    public void mostrarResultado(double resultado, String operacion) {
        JOptionPane.showMessageDialog(null, "El resultado de la " + operacion + " es: " + resultado);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, "Error: " + mensaje);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void despedir() {
        JOptionPane.showMessageDialog(null, "Gracias por usar la calculadora.");
    }
}