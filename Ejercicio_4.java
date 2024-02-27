

public class Ejercicio_4 {

    public static void main(String[] args) {
        double edad_juan , edad_alberto , edad_ana , edad_mama ;
        edad_juan = 9;
        edad_alberto = 2 * (edad_juan/3);
        edad_ana = 4 * (edad_juan/3);
        edad_mama = edad_juan + edad_alberto +edad_ana ;
        System.out.println("Las edades son: ") ;
        System.out.println("Alberto:" + edad_alberto) ;
        System.out.println("Ana:" + edad_ana) ;
        System.out.println("Juan:" + edad_juan) ;
        System.out.println("Mamá:" + edad_mama) ;
    }
}
