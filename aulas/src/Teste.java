import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //System.out.println("Digite o seu nome: ");
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.printf("Então o seu nome é: %s\n", nome);
        System.out.println("Obrigado pela informação");

    }

}