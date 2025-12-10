import java.util.ArrayList;
import java.util.List;

public class PositivosNegativos {
    public static void main(String[] args) {
        List<Integer> Lista = new ArrayList<>(List.of(1, 2, 3, -4, -5, 6, 7, -9, 10));

        long sumaPosit = Lista.stream()
                .filter(n -> n >= 0)
                .count();

        long sumaNegativos =  Lista.stream()
                .filter(n -> n < 0)
                .count();

        long suma = Lista.stream()
                .mapToInt(Integer:: valueOf)
                .sum();
        System.out.println(sumaPosit);
        System.out.println(sumaNegativos);
    }
}
