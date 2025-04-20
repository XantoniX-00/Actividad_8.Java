public class Pentagono implements Figura {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado;
    }

    public double calcularPerimetro() {
        return 5 * lado;
    }

    public double elevarAPotencia(int exponente) {
        return Math.pow(lado, exponente);
    }
}