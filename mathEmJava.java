import java.util.Scanner;
public class mathEmJava {
    public static void main(String args[]){
        double num1, num2;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        num1 = ler.nextDouble();
        System.out.println("Digite o segundo número:");
        num2 = ler.nextDouble();

        double maior = Math.max(num1, num2);
        double menor = Math.min(num1, num2);
        double potencia = Math.pow(num1, num2);
        double raizQuadrada = Math.sqrt(num1);
        double valorAbsoluto = Math.abs(num1 - num2);

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A potência de " + num1 + " elevado a " + num2 + " é: " + potencia);
        System.out.println("A raiz quadrada de " + num1 + " é: " + raizQuadrada);
        System.out.println("O valor absoluto da diferença entre " + num1 + " e " + num2 + " é: " + valorAbsoluto);
        ler.close();
    }
}
