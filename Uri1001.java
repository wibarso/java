import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int A,B,X;

        //entrada
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento
        X = A + B;

        // saída 
        System.out.println("X = " + X);
    }
}