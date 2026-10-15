import java.util.Scanner;

public class Calculadora {
    public static double sumar(double a, double b) {
        return a + b;
    }   
    public static double restar(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = entrada.nextDouble();

        System.out.print("Suma: " + sumar(a, b));
        System.out.print("Resta: " + restar(a, b));

        entrada.close();
    }


}
