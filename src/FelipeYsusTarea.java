import java.util.ArrayList;
import java.util.List;

class Tarea implements Comparable<Tarea>{
    private int prioridad;
    private int duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }
    @Override
    public String toString() {
        return prioridad + " - " + duracion;
    }
    @Override
    public int compareTo(Tarea other){
        if(this.prioridad == other.prioridad){
            return this.duracion - other.duracion;
        }else
            return other.prioridad - this.prioridad;
    }

    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea(10,20));
        tareas.add(new Tarea(10,30));
        tareas.add(new Tarea(20,25));
        tareas.add(new Tarea(5,10));
        tareas.stream().sorted().forEach(System.out::println);
    }

}