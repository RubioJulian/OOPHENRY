package modelo;

public class OperacionCientifica extends Operacion {

    @Override
    public double ejecutar(double... v) {
        return Math.log(v[0]); // ejemplo por defecto
    }

    public double log(double a) { return Math.log(a); }
    public double exp(double a) { return Math.exp(a); }
    public double sen(double a) { return Math.sin(a); }
    public double cos(double a) { return Math.cos(a); }
    public double tan(double a) { return Math.tan(a); }
}