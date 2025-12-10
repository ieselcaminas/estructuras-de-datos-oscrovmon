import java.io.*;
import java.util.*;

public class CountCountries {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> mapa = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/Colfuturo-Seleccionados.csv"));
        String line;
        String [] palabras;
        String pais;
        int cuantos = 0;
        while ((line = reader.readLine())!=null) {
            palabras = line.split(",");
            pais = palabras[6];
            cuantos = mapa.getOrDefault(pais, 0) + 1;
            mapa.put(pais, cuantos);
            System.out.println(mapa.get("España"));
        }
        reader.close();
    }
}

