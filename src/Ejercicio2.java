import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    static List<Double> alturas = new ArrayList<>();

    public static void main(String[] args) {
        int numAlumnos = numeroAlmunos();
        double media;
        int alumnoSuperior;
        leerAlturas(numAlumnos);
        media = media();
        alumnoSuperior = calcularAlumnosAlturaSuperior(media);
        System.out.printf("La media es %f%n", media());
        System.out.printf("Hay %d alumnos con una altura superior a %f: %n", alumnoSuperior, media);
        System.out.printf("Hay %d alumnos con una altura inferior a %f: %n", calcularAlumnosAlturaInferior(media), media);
    }
    public static int numeroAlmunos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de almunos");
        return sc.nextInt();
    }
    public static void leerAlturas(int cuantas) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce %d alturas:%n", cuantas);
        for (int i = 0; i < cuantas; i++) {
            alturas.add(sc.nextDouble());
        }
    }
    public static double media (){
        double total = 0;
        for (Double altura: alturas) {
            total += altura;
        }
        return total / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(double media) {
        int cuantos = 0;
        for (Double altura: alturas) {
            if (altura > media) cuantos++;
        }
        return cuantos;
    }
    public static int calcularAlumnosAlturaInferior(double media) {
        int cuantos = 0;
        for (Double altura: alturas) {
            if (altura < media) cuantos++;
        }
        return cuantos;
    }
}
