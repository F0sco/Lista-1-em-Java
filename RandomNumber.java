import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int num;

        do {
            System.out.println("Digite um valor:");
            num = ler.nextInt();

            if (num < numeroSecreto) {
                System.out.println(num + " é menor que o numero secreto");
            } else if (num > numeroSecreto) {
                System.out.println(num + " é maior que o numero secreto");
            }

        } while (num != numeroSecreto);

        System.out.println("Parabéns! Você acertou!");

        ler.close();
    }
}
