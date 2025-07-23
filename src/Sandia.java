import java.util.Scanner;

public class Sandia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite el peso de la sandía");
        int peso = entrada.nextInt();

        if (esDivisibleEnPares(peso)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        entrada.close();
    }

    public static boolean esDivisibleEnPares(int peso) {
        return peso > 2 && peso % 2 == 0;
    }
}
