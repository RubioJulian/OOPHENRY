package calculadora;

public class CalculadoraModelo {



    public double operar(double a, double b, String operacion) throws ArithmeticException {
        switch (operacion) {
            case "Suma" -> {
                return a + b;
            }
            case "Resta" -> {
                return a - b;
            }
            case "Multiplicación" -> {
                return a * b;
            }
            case "División" -> {
                if (b == 0) {
                    throw new ArithmeticException("No se puede dividir entre 0");
                }
                return a / b;
            }
            case "Potenciación" -> {
                return potencia(a, (int) b);
            }
            case "Raíz cuadrada" -> {
                return raizCuadrada(a);
            }
            case "Factorial" -> {
                return factorial((int) a);
            }
            default -> throw new IllegalArgumentException("Operación no válida: " + operacion);
        }
    }



    private double potencia(double base, int exponente) {
        double resultado = 1;
        if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                resultado *= base;
            }
            return 1 / resultado;
        } else {
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            return resultado;
        }
    }

    private double raizCuadrada(double numero) {
        if (numero < 0) throw new ArithmeticException("No se puede calcular la raíz de un número negativo");
        double aprox = numero / 2.0;
        double mejor = 0;
        for (int i = 0; i < 20; i++) { // método de Newton-Raphson
            mejor = 0.5 * (aprox + numero / aprox);
            if (Math.abs(mejor - aprox) < 0.000001) break;
            aprox = mejor;
        }
        return mejor;
    }

    private double factorial(int n) {
        if (n < 0) throw new ArithmeticException("No existe el factorial de un número negativo");
        double resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }



    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    public double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public double areaCircunferencia(double radio) {
        double pi = 3.141592653589793;
        return pi * radio * radio;
    }

    public double areaTrianguloRectangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}