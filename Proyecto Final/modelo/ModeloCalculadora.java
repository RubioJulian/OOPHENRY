package modelo;


public class ModeloCalculadora {

    private final OperacionBasica basica = new OperacionBasica();
    private final OperacionCientifica cientifica = new OperacionCientifica();
    private final OperacionPorcentaje porcentaje = new OperacionPorcentaje();
    private final OperacionReglaTres reglaTres = new OperacionReglaTres();
    private final Memoria memoria = new Memoria();

    public OperacionBasica basica() { return basica; }
    public OperacionCientifica cientifica() { return cientifica; }
    public OperacionPorcentaje porcentaje() { return porcentaje; }
    public OperacionReglaTres reglaTres() { return reglaTres; }
    public Memoria memoria() { return memoria; }
}