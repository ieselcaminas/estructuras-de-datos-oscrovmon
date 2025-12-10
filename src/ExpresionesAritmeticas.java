import java.util.Stack;

public class ExpresionesAritmeticas {
    public static void main(String[] args) {

    }
    public static int pila (String cadena){
        String [] numeros = cadena.split(" ");
        Stack<Integer> pila = new Stack<>();
        int n1;
        int n2;
        for(int i = 0; i < numeros.length; i++){
            String numArit = numeros[i];
            switch (numArit){
                case "+":
                    n1 = pila.pop();
                    n2 = pila.pop();
                    pila.push(n1 + n2);
                    break;
                case  "-":
                    n1 = pila.pop();
                    n2 = pila.pop();
                    pila.push(n1 - n2);                    break;
                case "*":
                    n1 = pila.pop();
                    n2 = pila.pop();
                    pila.push(n1 * n2);                    break;
                case "/":
                    n1 = pila.pop();
                    n2 = pila.pop();
                    pila.push(n1 / n2);
                    break;
                    default:
                        pila.push(Integer.parseInt(numArit));
            }


        }
        return pila.pop();
    }
}
