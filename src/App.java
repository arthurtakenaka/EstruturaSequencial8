import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        double salario, horas, total;
        System.out.println("Quanto voce ganha por hora: ");
        salario =  entrada.nextDouble();

        System.out.println("Quantas horas voce trabalha por mes: ");
        horas = entrada.nextDouble();

        total = salario*horas;

        System.out.println("Salario igual a: " + total + " por mes");
    }
}
