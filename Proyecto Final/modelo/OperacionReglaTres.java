package modelo;

public class OperacionReglaTres extends Operacion {

    @Override
    public double ejecutar(double... v) {
        return (v[1] * v[2]) / v[0];
    }
}