
/*
 * Esta clase define objetos de tipo Círculo con su radio como atributo.
 */
public class CIRCULO {
        int radio;
        CIRCULO(int radio) {
            this.radio = radio;
        }
        double calcularArea() {
            return Math.PI*Math.pow(radio,2);
        }
        double calcularPerímetro() {
            return 2*Math.PI*radio;
        }
    }

