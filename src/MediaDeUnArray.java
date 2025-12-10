import java.util.ArrayList;
import java.util.List;

public class MediaDeUnArray {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>(List.of(2, 2, 2, 2, 2, 6, 6, 6 ,6 ,6));
        float total = 0;
        float totalnumeros = 0;
        for (int n: numeros) {
            totalnumeros ++;
            total += n;
        }
        float media = total/totalnumeros;
        System.out.println("La media de los numeros es: " + media  );

    }
}
