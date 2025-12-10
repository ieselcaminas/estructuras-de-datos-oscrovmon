import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> agenda = new HashMap<>();

        Scanner teclado = new Scanner(System.in);
        String nombre;

        ArrayList<String> telefonos = new ArrayList<>();
        telefonos.add("900 900 900");
        telefonos.add("900 900 984");
        agenda.put("Pepe", telefonos);

        telefonos =  new ArrayList<>();
        telefonos.add("900 923 900");
        telefonos.add("900 929 984");
        agenda.put("Antonio", telefonos);

        telefonos =  new ArrayList<>();
        telefonos.add("542 675 145");
        telefonos.add("902 645 231");
        telefonos.add("900 888 888");
        agenda.put("Francisco", telefonos);

        System.out.println("Introduce el nombre de un contacto: ");

        nombre = teclado.nextLine();

        System.out.println(agenda.getOrDefault(nombre, new ArrayList<>()));
    }
}
