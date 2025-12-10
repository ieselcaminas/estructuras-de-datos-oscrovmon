import java.util.ArrayList;

public class LosTesorosDeTutankamon {
    class Objetos implements Comparable<Objetos> {
        private String nombre;
        private int valor;
        private int peso;
        private int id;

        public Objetos(String nombre, int valor, int peso, int id) {
            this.nombre = nombre;
            this.valor = valor;
            this.peso = peso;
            this.id = id;
        }
        @Override
        public String toString() {
            return nombre + " - " + valor + " - " + peso;
        }
        @Override
        public int compareTo(Objetos other) {
            if(this.peso == other.peso) {
                return this.valor - other.valor;
            }
        }
    }

    public static void main(String[] args) {

    }

}
