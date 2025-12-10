import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    static class Human implements Comparable<Human> {
        String name;
        int salary;
        public Human(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
        @Override
        public String toString() {
            return name + " - " + salary;
        }
        public int compareTo(Human other) {
            return other.salary - this.salary;
        }
    }
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<>();
        Human humano = new Human("Pepe", 1000);
        humanList.add(humano);

    }
}
