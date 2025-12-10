import java.io.*;
import java.util.*;

public class Anagramas {
    public static void main(String[] args) throws IOException {
        Map<String, ArrayList<String>> mapa = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/spanish-dict.txt"));
        String palabra;
        String palabraOrdenada;
        ArrayList<String> listaActual;
        StringBuilder sb = new StringBuilder();
        int minGroupSize = 3;
        while ((palabra = reader.readLine()) != null) {
            //Trabajar con palabra
            palabraOrdenada = alphabetize(palabra);
            //Buscamos la lista de palabras con esa clave ordenadas
            listaActual = mapa.getOrDefault(palabra, new ArrayList<>());
            //Añadimos la palabra actual a la lista de palabras
            mapa.put(palabra, listaActual);
        }
        reader.close();
        for (ArrayList<String> l : mapa.values()) {
            if (l.size() < minGroupSize) {
                //sb.append(l.size()).append(": ").append(l).append("/n");
                System.out.printf("%d: %s%n", l.size(), l);
            }
        }
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}
