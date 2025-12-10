import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<>();
        String coche;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la marca del coche: ");
        do {
            coche = sc.nextLine();
            if (!coche.isEmpty()) coches.add(coche);
        } while (!coche.isEmpty());

        Collections.sort(coches);

        for (String c: coches) {
            System.out.println(c);
        }
    }
}
