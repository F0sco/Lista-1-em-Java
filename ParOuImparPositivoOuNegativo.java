import java.util.Scanner;

public class ParOuImparPositivoOuNegativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;
        System.out.println("Digite um número inteiro:");
        valor = ler.nextInt();

        if (valor == 0) {
            System.out.println("Zero não pode ser verificado.");
            ler.close();
        } else {
            // Par ou ímpar
            if (valor % 2 == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é ímpar.");
            }

            // Positivo ou negativo
            if (valor > 0) {
                System.out.println("O número é positivo.");
            } else {
                System.out.println("O número é negativo.");
            }
        }

        ler.close();
    }
}