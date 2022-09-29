package questoes;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float p = (20/100);

        while(true){
            System.out.println("Informe o nome do funcionario: ");
            String nome = leitor.nextLine();
            if(nome == "fim"){
                break;
            }

            System.out.println("Informe o salario: ");
            float salario = leitor.nextFloat();
            if(salario < 500){
                float sM = (p*salario);
                System.out.println("O novo salario é: " + sM +".");
            }
            else {
                System.out.println("O salario continua o mesmo.");
            }


        }
    }
}
