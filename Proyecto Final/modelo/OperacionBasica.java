package modelo;

public class OperacionBasica extends Operacion {

    @Override
    public double ejecutar(double... v) {
        return v[0] + v[1]; // por defecto suma (el controlador decide la operación)
    }

    public double sumar(double a, double b) { return a + b; }
    public double restar(double a, double b) { return a - b; }
    public double multiplicar(double a, double b) { return a * b; }

    public double dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        return a / b;
    }
}