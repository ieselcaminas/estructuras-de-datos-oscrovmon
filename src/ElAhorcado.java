import java.util.ArrayList;
import java.util.List;

public class ElAhorcado {
    public static void main(String[] args) {
    }
    public static int ahorcado (int maxFallos, String palabraOculta, String letrasPropuestas){
        int fallosDelJugador = 0;
        List<Character> letrasJugadas = new ArrayList<>();
        List<Character> ListaDeLetrasOcultas = new ArrayList<>();
        for (Character c: palabraOculta.toCharArray()) {
            if(!ListaDeLetrasOcultas.contains(c)) ListaDeLetrasOcultas.add(c);
            }

        for (Character letra: letrasPropuestas.toCharArray()) { 
            if(!letrasJugadas.contains(letra)) {
                if(ListaDeLetrasOcultas.contains(letra)) {
                    fallosDelJugador++;
                }else  {
                    ListaDeLetrasOcultas.remove(letra);
                }
            }
            letrasJugadas.add(letra);
        }
        if(fallosDelJugador >= maxFallos) return 2;
        else if(ListaDeLetrasOcultas.isEmpty()) return 1;
        else return 3;

    }

}
