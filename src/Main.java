import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, resultado;
        char operador;

        System.out.println("Calculadora Java");
        numero1 = obtenerNumero(scanner);
        operador = obtenerOperador(scanner);
        numero2 = obtenerNumero(scanner);

        resultado = calcular(numero1, operador, numero2);

        if (Double.isNaN(resultado)) {
            System.out.println("Error: No se puede dividir por cero.");
        } else {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }

    public static double obtenerNumero(Scanner scanner) { //metodo para optener el primer numero
        System.out.print("Ingrese el primer número: ");
        return scanner.nextDouble();
    }

    public static char obtenerOperador(Scanner scanner) {//metodo para optener el operador
        System.out.print("Ingrese un operador (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static double calcular(double numero1, char operador, double numero2) {//metodo para optener el segundo numero
        switch (operador) {
            case '+':
                return numero1 + numero2;
            case '-':
                return numero1 - numero2;
            case '*':
                return numero1 * numero2;
            case '/':
                if (numero2 != 0) {
                    return numero1 / numero2;
                } else {
                    return Double.NaN; // Indica un error (NaN representa "Not-a-Number").
                }
            default:
                System.out.println("Operador no válido.");
                return Double.NaN;
        }
    }
}
