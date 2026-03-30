import java.util.Scanner;
public class loginJava {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        String usuario;
        String senha;
        do{
            System.out.println("Digite seu login:");
            usuario = ler.nextLine();
            if (!usuario.equalsIgnoreCase("coordenador")) {
                System.out.println("Login inválido, tente novamente.");
            }
        } while (!usuario.equalsIgnoreCase("coordenador"));

        do {
            System.out.println("Digite sua senha:");
            senha = ler.nextLine();
            if (!senha.equals("java2026")) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        } while (!senha.equals("java2026"));

        System.out.println("Login realizado com sucesso!");

        ler.close();
    }
}
