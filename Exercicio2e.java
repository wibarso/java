import java.util.Scanner;
public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double baseMaior, baseMenor, altura, area;

        System.out.println("Digite a base maior");
        baseMaior = teclado.nextDouble();
        System.out.println("Digite a base menor");
        baseMenor = teclado.nextDouble();
        System.out.println("Digite a altura");
        altura = teclado.nextDouble();

        area = (baseMaior + baseMenor) * altura / 2.0;

        System.out.printf("A area do trapezio = %.3f\n", area);

    }   
}