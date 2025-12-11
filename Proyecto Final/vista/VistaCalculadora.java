package vista;

import javax.swing.*;

public class VistaCalculadora extends JFrame {

    public JButton btnSuma, btnResta, btnMultiplicacion, btnDivision;
    public JButton btnSen, btnCos, btnTan;
    public JButton btnLog, btnExp;
    public JButton btnPorcentaje, btnReglaTres;
    public JButton btnMemGuardar, btnMemRecuperar, btnMemLimpiar;
    public JButton btnLimpiar;
    public JTextField campoA, campoB, campoC;
    public JLabel lblResultado;

    public VistaCalculadora() {

        setTitle("Calculadora MVC");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Colores
        java.awt.Color fondo = new java.awt.Color(245, 245, 245);
        java.awt.Color azul = new java.awt.Color(65, 125, 200);
        java.awt.Color azulOscuro = new java.awt.Color(40, 80, 150);
        java.awt.Color textoBlanco = java.awt.Color.WHITE;

        getContentPane().setBackground(fondo);

        // Campos
        campoA = new JTextField(); campoA.setBounds(20,20,150,30);
        campoB = new JTextField(); campoB.setBounds(20,60,150,30);
        campoC = new JTextField(); campoC.setBounds(20,100,150,30);

        // Botones
        btnSuma = boton("+", azul); btnSuma.setBounds(200,20,60,30);
        btnResta = boton("-", azul); btnResta.setBounds(270,20,60,30);
        btnMultiplicacion = boton("*", azul); btnMultiplicacion.setBounds(200,60,60,30);
        btnDivision = boton("/", azul); btnDivision.setBounds(270,60,60,30);

        //%/Regla de 3
        btnPorcentaje = boton("%", azulOscuro); btnPorcentaje.setBounds(200,100,130,30);
        btnReglaTres = boton("Regla 3", azulOscuro); btnReglaTres.setBounds(200,140,130,30);

        // Trigonometría
        btnSen = boton("sen", azul); btnSen.setBounds(20,180,70,30);
        btnCos = boton("cos", azul); btnCos.setBounds(100,180,70,30);
        btnTan = boton("tan", azul); btnTan.setBounds(180,180,70,30);

        // Log/Expo
        btnLog = boton("log", azul); btnLog.setBounds(20,215,70,30);
        btnExp = boton("exp", azul); btnExp.setBounds(100,215,70,30);

        // MEM
        btnMemGuardar = boton("M+", azulOscuro); btnMemGuardar.setBounds(20,250,70,30);
        btnMemRecuperar = boton("MR", azulOscuro); btnMemRecuperar.setBounds(100,250,70,30);
        btnMemLimpiar = boton("MC", azulOscuro); btnMemLimpiar.setBounds(180,250,70,30);

        // CLEAN
        btnLimpiar = boton("Limpiar", azulOscuro);
        btnLimpiar.setBounds(260,250,90,30);

        // resultado
        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(20,300,300,30);

        // Agregar elementos
        add(campoA); add(campoB); add(campoC);

        add(btnSuma); add(btnResta); add(btnMultiplicacion); add(btnDivision);

        add(btnPorcentaje); add(btnReglaTres);

        add(btnSen); add(btnCos); add(btnTan);

        add(btnLog); add(btnExp);

        add(btnMemGuardar); add(btnMemRecuperar); add(btnMemLimpiar);
        add(btnLimpiar);

        add(lblResultado);
    }

    // Boton estiloso
    private JButton boton(String texto, java.awt.Color colorFondo) {
        JButton b = new JButton(texto);
        b.setBackground(colorFondo);
        b.setForeground(java.awt.Color.WHITE);
        b.setBorderPainted(false);
        b.setFocusPainted(false);
        return b;
    }
}