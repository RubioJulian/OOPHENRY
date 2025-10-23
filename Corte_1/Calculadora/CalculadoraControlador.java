package calculadora;

public class CalculadoraControlador {

    private final CalculadoraModelo modelo;
    private final CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraModelo modelo, CalculadoraVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        boolean continuar = true;

        while (continuar) {
            String operacion = vista.mostrarMenu();

            if (operacion == null || operacion.equals("Salir")) {
                continuar = false;
                vista.despedir();
                break;
            }

            // Submenú de áreas
            if (operacion.equals("Áreas")) {
                String figura = vista.mostrarSubmenuAreas();
                if (figura == null) continue;

                double area = 0;

                switch (figura) {
                    case "Cuadrado" -> {
                        double lado = vista.pedirNumero("Ingrese el lado del cuadrado:");
                        area = modelo.areaCuadrado(lado);
                    }

                    case "Rectángulo" -> {
                        double base = vista.pedirNumero("Ingrese la base del rectángulo:");
                        double altura = vista.pedirNumero("Ingrese la altura del rectángulo:");
                        area = modelo.areaRectangulo(base, altura);
                    }

                    case "Circunferencia" -> {
                        double radio = vista.pedirNumero("Ingrese el radio de la circunferencia:");
                        area = modelo.areaCircunferencia(radio);
                    }

                    case "Triángulo rectángulo" -> {
                        double baseT = vista.pedirNumero("Ingrese la base del triángulo:");
                        double alturaT = vista.pedirNumero("Ingrese la altura del triángulo:");
                        area = modelo.areaTrianguloRectangulo(baseT, alturaT);
                    }

                    default -> {
                        vista.mostrarError("Figura no válida.");
                        continue;
                    }
                }

                vista.mostrarMensaje("El área del " + figura.toLowerCase() + " es: " + area);
                continue;
            }

            // Operaciones normales
            double a = vista.pedirNumero("Ingrese el primer número:");
            if (Double.isNaN(a)) continue;

            double b = 0;
            // Algunas operaciones solo usan un número
            if (!operacion.equals("Raíz cuadrada") && !operacion.equals("Factorial")) {
                b = vista.pedirNumero("Ingrese el segundo número:");
                if (Double.isNaN(b)) continue;
            }

            try {
                double resultado = modelo.operar(a, b, operacion);
                vista.mostrarResultado(resultado, operacion);
            } catch (ArithmeticException e) {
                vista.mostrarError(e.getMessage());
            }
        }
    }
}