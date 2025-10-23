package calculadora;

public class CalculadoraAreas {

    // Área del cuadrado: lado²
    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    // Área del rectángulo: base * altura
    public double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Área de la circunferencia: π * radio² (sin usar Math)
    public double areaCircunferencia(double radio) {
        double pi = 3.1416;
        return pi * radio * radio;
    }

    // Área del triángulo rectángulo: (base * altura) / 2
    public double areaTrianguloRectangulo(double base, double altura) {
        return (base * altura) / 2;
    }
}