package modelo;


public class Memoria {

    private Double valor;

    public void guardar(Double v) { this.valor = v; }
    public Double recuperar() { return valor; }
    public void limpiar() { valor = null; }
}