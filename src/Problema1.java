import java.util.ArrayList;
import java.util.List;

public class  Problema1 {
    public static void main(String[] args) {
        Person persona = new Person("Juan", 1980);
        List<Person> personas = new ArrayList<>();
        personas.add(persona);
        persona = new Person("María", 1950);
        personas.add(persona);

        Long cuantos = personas.stream()
                .map(Person::getBirthYear)
                .filter(b -> b > 1970)
                .count();
        System.out.println(cuantos);

        cuantos = personas.stream()
                .map(Person::getName)
                .filter(n -> n.startsWith("M"))
                .count();
        System.out.println(cuantos);

        personas.stream()
                .map(Person::getName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }
}
