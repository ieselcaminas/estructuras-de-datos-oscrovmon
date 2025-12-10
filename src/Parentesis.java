import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        String cadena = "[{[(hola)]}]";
        System.out.println(esBalanceado(cadena));
    }
    public static boolean esBalanceado(String cadena){
        Stack<Character> stack = new Stack<>();
        char ultimo;
        for(int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);

            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else if( c == ')') {
                if (stack.isEmpty()) return false;
                ultimo = stack.pop();
                if (ultimo != '{') return false;
            }else if (c == '}') {
                if (stack.isEmpty()) return false;
                ultimo = stack.pop();
                if (ultimo != '{') return false;
            }else if (c == ']') {
                if (stack.isEmpty()) return false;
                ultimo = stack.pop();
                if (ultimo != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
