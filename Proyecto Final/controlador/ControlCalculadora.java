package controlador;

import modelo.ModeloCalculadora;
import vista.VistaCalculadora;

public class ControlCalculadora {

    private final ModeloCalculadora modelo;
    private final VistaCalculadora vista;
    private double ultimoResultado = 0;

    public ControlCalculadora(ModeloCalculadora m, VistaCalculadora v) {
        this.modelo = m;
        this.vista = v;

        iniciarEventos();
    }

    private void iniciarEventos() {

        // ---- OPERACIONES BÁSICAS ----
        vista.btnSuma.addActionListener(e -> {
            double a = tomar(vista.campoA);
            double b = tomar(vista.campoB);
            mostrar(modelo.basica().sumar(a, b));
        });

        vista.btnResta.addActionListener(e -> {
            double a = tomar(vista.campoA);
            double b = tomar(vista.campoB);
            mostrar(modelo.basica().restar(a, b));
        });

        vista.btnMultiplicacion.addActionListener(e -> {
            double a = tomar(vista.campoA);
            double b = tomar(vista.campoB);
            mostrar(modelo.basica().multiplicar(a, b));
        });

        vista.btnDivision.addActionListener(e -> {
            double a = tomar(vista.campoA);
            double b = tomar(vista.campoB);
            mostrar(modelo.basica().dividir(a, b));
        });

        // ---- PORCENTAJE ----
        vista.btnPorcentaje.addActionListener(e -> {
            double base = tomar(vista.campoA);
            double porc = tomar(vista.campoB);
            mostrar(modelo.porcentaje().ejecutar(base, porc));
        });

        // ---- REGLA DE TRES ----
        vista.btnReglaTres.addActionListener(e -> {
            double a = tomar(vista.campoA);
            double b = tomar(vista.campoB);
            double c = tomar(vista.campoC);
            mostrar(modelo.reglaTres().ejecutar(a, b, c));
        });

        // ---- CIENTÍFICA ----
        vista.btnSen.addActionListener(e -> mostrar(modelo.cientifica().sen(tomar(vista.campoA))));
        vista.btnCos.addActionListener(e -> mostrar(modelo.cientifica().cos(tomar(vista.campoA))));
        vista.btnTan.addActionListener(e -> mostrar(modelo.cientifica().tan(tomar(vista.campoA))));

        vista.btnLog.addActionListener(e -> mostrar(modelo.cientifica().log(tomar(vista.campoA))));
        vista.btnExp.addActionListener(e -> mostrar(modelo.cientifica().exp(tomar(vista.campoA))));

        // ---- MEMORIA ----
        vista.btnMemGuardar.addActionListener(e -> modelo.memoria().guardar(ultimoResultado));
        vista.btnMemRecuperar.addActionListener(e -> mostrar(modelo.memoria().recuperar()));
        vista.btnMemLimpiar.addActionListener(e -> modelo.memoria().limpiar());

        // ---- LIMPIAR TODO ----
        vista.btnLimpiar.addActionListener(e -> limpiarTodo());
    }

    // -------------------------------
    //         MÉTODOS AUXILIARES
    // -------------------------------

    private void limpiarTodo() {
        vista.campoA.setText("");
        vista.campoB.setText("");
        vista.campoC.setText("");

        vista.lblResultado.setText("Resultado: ");
        ultimoResultado = 0;
    }

    private void mostrar(Double r) {
        if (r != null) {
            ultimoResultado = r;
            vista.lblResultado.setText("Resultado: " + r);
        }
    }

    private double tomar(javax.swing.JTextField campo) {
        String t = campo.getText().trim();
        if (t.isEmpty()) return 0; // evita error si queda un campo vacío
        return Double.parseDouble(t);
    }
}