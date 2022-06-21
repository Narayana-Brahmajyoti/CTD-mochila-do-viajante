import java.util.Scanner;

public class Main {
    //Exercicio 1
    static boolean numeroPrimo(Integer numero) {
        boolean primo = false;
        if (numero.equals(2)) {
            primo = true;
        }
        for (Integer i = 2; i < numero; i++) {
            if (numero.equals(i)) {
                int resto = numero % i;
                if (resto != 0) {
                    primo = true;
                } else {
                    primo = false;
                    break;
                }
            }
        }
        return primo;
    }

    //Exercicio 1
    static void respostaNumeroPrimo(boolean result) {
        if (result) {
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroPrimo;

        System.out.println("Digite um valor para saber se ele é número primo ou não");
        numeroPrimo = scanner.nextInt();
        respostaNumeroPrimo(numeroPrimo(numeroPrimo));
    }
}