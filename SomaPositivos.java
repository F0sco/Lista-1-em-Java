import java.util.Scanner;
public class SomaPositivos {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int soma = 0, valor = 0;
        do{
            System.out.println("Digite um valor");
            valor = ler.nextInt();
            soma = soma + valor;
        }while(valor>= 0);
        System.out.println("A soma é:"+soma);
        ler.close();
    }
}
