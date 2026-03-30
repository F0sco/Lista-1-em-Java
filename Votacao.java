import java.util.Scanner;
public class Votacao{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        int voto;
        System.out.println("Tabela de candidatos:");
        System.out.println("0 - Nulo");
        System.out.println("13 - Lula");
        System.out.println("22 - Bolsonaro");
        voto = ler.nextInt();
        do{
            if (voto != 0 && voto != 13 && voto != 22){
                System.out.println("Nenhum candidato encontrado!!!");
                System.out.println("Tabela de candidatos:");
                System.out.println("0 - Nulo");
                System.out.println("13 - Lula");
                System.out.println("22 - Bolsonaro");
                voto = ler.nextInt();
            } if(voto == 0){
                System.out.println("Você votou nulo.");
            } if(voto == 13){
                System.out.println("Você votou no Lula.");
            } if(voto == 22){
                System.out.println("Você votou no Bolsonaro.");
            } 
        }while (voto != 0 && voto != 13 && voto != 22);
        System.out.println("Voto computado!");
        ler.close();
    }
}
