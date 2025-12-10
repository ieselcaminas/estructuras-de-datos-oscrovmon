import java.util.*;

public class Ejercicio8 {
    public static void main(String[] args) {
    Map<Integer, ArrayList<Integer>> botin = repartirBotin(2, new ArrayList<>(List.of(10, 20, 50, 200, 500)));
        System.out.println(botin);

    }
    public static Map<Integer, ArrayList<Integer>> repartirBotin(int cuantos, ArrayList<Integer> billetes) {
        Map<Integer, ArrayList<Integer>> botin = new HashMap<>();
        ArrayList<Integer> reparto;
        int indice;
        for (int i = 0; i < billetes.size(); i++) {
            indice = i % cuantos;
            reparto = botin.get(indice);
            if (reparto == null){
                reparto = new ArrayList<>();
            }
            reparto.add(billetes.get(i));
            botin.put(indice, reparto);
        }

        return botin;
    }
}
