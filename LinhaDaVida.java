import java.util.Scanner;
public class LinhaDaVida {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int anoNasc, idade;
        int anoAtual = 2026;
        System.out.println("Digite o seu ano de nascimento:");
        anoNasc = ler.nextInt();
        int ano = anoNasc;
        while (ano <= anoAtual) {
            idade = ano - anoNasc;
            System.out.println("Ano: " + ano);
            System.out.println("Idade: " + idade);
            ano++;
        }
        ler.close();
    }
}
