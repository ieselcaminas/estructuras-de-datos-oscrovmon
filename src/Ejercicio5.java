import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, String> mapa1 = new HashMap<>();
        String contacto;
        mapa1.put("Jose", "634 54 23 43");
        mapa1.put("Antonio", "657 86 34 21");
        mapa1.put("Paco", "985 23 65 12");
        mapa1.put("Manuel", "093 12 67 34");
        mapa1.put("Juan", "659 48 92 22");
        mapa1.put("Pepe", "910 58 23 12");
        System.out.println("Introduce el nombre de un contacto: ");
        contacto = teclado.nextLine();
        System.out.println(mapa1.getOrDefault(contacto, "Tu contacto no esta en la lista"));
    }
}
