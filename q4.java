package questoes;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float gasolina= 2.5f;
        float lata= 3.0f;
        System.out.println("Informe a quantidade de litros de gasolina que você deseja: ");
        float qtdLitrosG = leitor.nextFloat();
        System.out.println("Informe a quantidade de latas de refrigerenta que você deseja: ");
        float qtdLata = leitor.nextFloat();
        float valorGasolina = qtdLitrosG*gasolina;
        float valorLata = qtdLata*lata;
        float valorTotal = valorGasolina + valorLata;

        System.out.println("O valor total de gasolina: R$" + valorGasolina + ". \nO valor total de refrigerante: R$" + valorLata +
                ". \nValor total: R$" + valorTotal + "." );

    }
}
