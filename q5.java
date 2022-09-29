package questoes;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float porcetagem = 0.3f;
        System.out.println("Valor do crédito: ");
        float valorCredito = leitor.nextFloat();
        System.out.println("Quantidade de parcela: ");
        float qParcela = leitor.nextFloat();
        System.out.println("Informe seu sálario: ");
        float salario = leitor.nextFloat();
        float valorP = valorCredito/qParcela;
        float pSalario= salario * porcetagem;
        if(pSalario >= valorP){
            System.out.println("Emprestimo aprovado.");
        }else {
            System.out.println("Emprestimo negado.");
        }
    }

}
