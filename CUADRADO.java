public class CUADRADO {
    int lado;
    public CUADRADO(int lado) {
        this.lado = lado;
    }
    double calcularArea() {
        return lado*lado;
    }
    double calcularPerímetro() {
        return (4*lado);
    }
}
