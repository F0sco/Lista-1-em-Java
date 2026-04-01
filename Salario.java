import java.util.Scanner;
public class Salario {
    public static void main(String args[]){
        float salario =0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu salario");
        salario = ler.nextFloat();
        if(salario<= 645){
            System.out.println("Até 1 salário-mínimo");
        }else if(salario > 645 && salario <= 1935){
            System.out.println("Até 3 salários mínimos");
        }else if(salario > 1935 && salario <= 3225){
            System.out.println("Até 5 salários mínimos");
        }else{
            System.out.println("Acima de 5 salários mínimos");
        }
        ler.close();
    }
}
