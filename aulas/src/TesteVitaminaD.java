// Desejável: 20 ng/ML
// Grupo de risco: 30 ng/ML a 60 ng/ML

import java.util.Scanner;

public class TesteVitaminaD {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Faz parte do grupo de risco: ");
        boolean grupoDeRisco = entrada.nextBoolean();
        System.out.print("Quantidade de Vitamina D (em ng/ML): ");
        double vitamina = entrada.nextDouble();

        boolean vitaminaDNormal = !grupoDeRisco && vitamina > 20 || grupoDeRisco && vitamina >= 30 && vitamina <= 60;

        //System.out.printf("Vitamina D normal: %b%n", vitaminaDNormal);
        System.out.printf("Olá, %s%n"+"Pareceque o seu nível de vitamina D é de %f%n"+"Portanto ela é: %b%n",nome,vitamina,vitaminaDNormal);

    }
}
