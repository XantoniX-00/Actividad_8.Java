public class Triangulo implements Figura {
    private double base, altura;
    private double lado1, lado2, lado3;
    private boolean usarBaseAltura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.usarBaseAltura = true;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.usarBaseAltura = false;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double elevarAPotencia(int exponente) {
        return usarBaseAltura ? Math.pow(base, exponente) : Math.pow(lado1, exponente);
    }
}