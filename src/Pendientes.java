import java.util.HashMap;

public class Pendientes {
    public static void main(String[] args) {

    }
    public static int parejasDePendientes(int[] pendientes){

        HashMap<Integer, Integer> mapa = new HashMap<>();
        int parejas = 0;
        int cuantos;
        for (int numPendiente : pendientes) {
            cuantos = mapa.getOrDefault(numPendiente, 0);
            mapa.put(numPendiente, cuantos + 1);
        }

        for (int valor : mapa.values()) {
            parejas += valor / 2;
        }
        return parejas;
    }
}
