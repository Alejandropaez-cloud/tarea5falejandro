package paquetea;

public class main{
    public static void main(String[] args) {
        
        traductor traductor = new traductor();


        // Como bien dice el enunciado tenemos que hacer minimo diez registros.
        traductor.guardarEntrada("cook", "cocinar");
        traductor.guardarEntrada("apple", "manzana");
        traductor.guardarEntrada("one", "uno");
        traductor.guardarEntrada("two","dos");
        traductor.guardarEntrada("three", "tres");
        traductor.guardarEntrada("four", "cuatro");
        traductor.guardarEntrada("five", "cinco");
        traductor.guardarEntrada("six", "seis");
        traductor.guardarEntrada("seven", "siete");
        traductor.guardarEntrada("eight", "ocho");

        // Probar traducción 
        System.out.println("Traduccion de 'dog': " + traductor.traducir("dog"));
    }
}
