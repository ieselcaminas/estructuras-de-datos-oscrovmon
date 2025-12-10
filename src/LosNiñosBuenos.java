import java.util.ArrayList;
import java.util.List;

class Ninos implements Comparable<Ninos>{
    private int comportamiento;
    private int peso;


    public Ninos(int comportamientos, int regalos) {
        this.comportamiento = comportamientos;
        this.peso = peso;
    }
    @Override
    public String toString() {
        return comportamiento + " - " + peso;
    }
    @Override
    public int compareTo(Ninos other){
        if(this.comportamiento == other.comportamiento){
            return this.peso - other.peso;
        }else
            return other.comportamiento - this.comportamiento;
    }
    public static void main(String[] args) {
        List<Ninos> ninos = new ArrayList<>();
        ninos.add(new Ninos(99, 6));
        ninos.add(new Ninos(44, 2));
        ninos.add(new Ninos(75, 1));
        ninos.add(new Ninos(12, 6));
        ninos.add(new Ninos(74, 4));
        ninos.add(new Ninos(86, 5));
        ninos.stream().sorted().forEach(System.out::println);
    }
}

