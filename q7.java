package questoes;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float diaria = 40.0f;
        float menorDez = 15.0f;
        float maiorDez = 8.0f;
        float total = 0f;
        int continuar = 1;


        while (continuar != 0){
            System.out.println("Informe seu nome: ");
            String nome = leitor.nextLine();
            String x = leitor.nextLine();
            System.out.println("Quantidade de dias: ");
            int dias = leitor.nextInt();
            float totalD = dias*diaria;

            if(dias>=10){
                totalD= totalD+maiorDez;
                System.out.println("Valor total: " + totalD);
                total += totalD;
            }else {
                totalD = totalD+menorDez;
                System.out.println("Valor total: " + totalD);
                total += totalD;
            }

            System.out.println("Deseja continuar? 1-Sim/0-Não");
            continuar = leitor.nextInt();


        }

        System.out.println("Total arrecadado:" + total);


    }
}
