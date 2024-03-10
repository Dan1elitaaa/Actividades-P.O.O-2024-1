

public class PRUEBA_CLASES {

    public static void main(String args[]) {
        CIRCULO figura1 = new CIRCULO(2);
        RECTANGULO figura2 = new RECTANGULO(1,2);
        CUADRADO figura3 = new CUADRADO(3);
        TRIANGULO figura4 = new TRIANGULO(3,5);
        System.out.println("El área del círculo es =" + figura1.
                calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.
                calcularPerímetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.
                calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.
                calcularPerímetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.
                calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.
                calcularPerímetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.
                calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.
                calcularPerímetro());
        figura4.determinarTipoTriángulo();
    }
}
