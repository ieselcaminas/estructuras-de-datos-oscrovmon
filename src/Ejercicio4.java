import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> mapa1 = new HashMap<>();
        String pais;
        mapa1.put("España", "Madrid");
        mapa1.put("Inglaterra", "Londres");
        mapa1.put("Alemania", "Berlin");
        mapa1.put("Francia", "Paris");
        System.out.println("Introduce el nombre de un pais: ");
        pais = sc.nextLine();
        System.out.println(mapa1.getOrDefault(pais, "Tu pais no esta en la lista"));


    }
}
