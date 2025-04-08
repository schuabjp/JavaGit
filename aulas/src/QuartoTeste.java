import java.util.Scanner;

public class QuartoTeste {
    public static void main(String[] args) {
        Scanner entradaCortisol = new Scanner(System.in);

        System.out.print("Digite a quantidade do seu Cortisol: ");
        double cortisol = entradaCortisol.nextDouble();

        //Cortisol ideal é de 6 a 18.4
        boolean resultadoCortisol = cortisol >= 6.0 && cortisol <= 18.0;
        System.out.printf("Cortisol: %b\n", resultadoCortisol);

        if (resultadoCortisol == true) {
            System.out.printf("Cortisol está normal");
        } else if (resultadoCortisol == false) {
            System.out.printf("Cortisol está anormal");
        }
    }
}
