import java.util.Scanner; 
public class Main{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int num, horas;
        double salario,salary;

        num=teclado.nextInt();
        horas=teclado.nextInt();
        salario=teclado.nextDouble();
        salary=horas*salario;

        // saída
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    
    }
}