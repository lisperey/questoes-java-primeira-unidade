package questoes;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a quantidade de crédito: ");
        float credito = leitor.nextFloat();

        System.out.println("Informe a porcetagem: ");
        float p = leitor.nextFloat();

        float x = (p/100);

        float a = x * credito;

        float novo = a + credito;

        System.out.println("Os créditos galácticos com o aumento é: " + novo);




    }
}
