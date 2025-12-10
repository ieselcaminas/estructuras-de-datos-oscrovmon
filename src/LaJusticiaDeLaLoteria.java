import java.util.ArrayList;
import java.util.List;

public class LaJusticiaDeLaLoteria {
    static class Localidad implements Comparable<Localidad> {
        int dinero;
        int premios;

        public Localidad(int dinero, int premios) {
            this.dinero = dinero;
            this.premios = premios;
        }

        @Override
        public String toString() {
            return dinero + " - " + premios;
        }
        @Override
        public int compareTo(Localidad other) {
            if (this.dinero == other.dinero) {
                return this.premios - other.premios;
            } else {
                return this.dinero - other.dinero;
            }
        }
        public static void main(String[] args) {
            List<Localidad> localidades = new ArrayList<>();
            localidades.add(new Localidad(50, 10));
            localidades.add(new Localidad(200, 100));
            localidades.add(new Localidad(200, 300));
            localidades.add(new Localidad(400, 100));
            localidades.add(new Localidad(300, 1000));
            localidades.stream().sorted().forEach(System.out::println);
        }


    }
}
