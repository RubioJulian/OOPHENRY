package modelo;

public class OperacionPorcentaje extends Operacion {

    @Override
    public double ejecutar(double... v) {
        return (v[0] * v[1]) / 100.0;
    }
}