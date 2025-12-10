import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<String> boletos = new ArrayList<>();
        Map<Integer, Integer> terminaciones = new HashMap<>();
        boletos.add("15346341");
        boletos.add("21314251");
        boletos.add("34251241");
        boletos.add("47456223");
        boletos.add("58574247");
        boletos.add("85835677");
        boletos.add("83526546");
        boletos.add("93623452");


        int terminacion;
        for (String boleto : boletos) {
            terminacion = Integer.parseInt("" + boleto.charAt(boleto.length() - 1));

            if(terminaciones.containsKey(terminacion)){
                terminaciones.put(terminacion, terminaciones.get(terminacion) + 1);
            } else{
                terminaciones.put(terminacion, 1);
            }
        }
        System.out.println(terminaciones);
    }
}
