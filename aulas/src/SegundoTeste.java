import java.util.Scanner;

public class SegundoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite o seu peso: ");
        int peso = entrada.nextInt();
        System.out.print("Digite o seu altura: ");

        double altura = entrada.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("IMC de %s: %.2f%n", nome, imc);

        if (imc < 18.5) {
            System.out.println("MAGREZA");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("NORMAL");
        } else {
            System.out.println("SOBREPESO / OBESO");
        }
    }
}
