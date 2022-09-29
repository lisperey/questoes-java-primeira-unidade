package questoes;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int aprovado = 0;
        int reprovado = 0;
        int exame = 0;
        float mediaClass = 0;


        for(int i= 0; i < 3; i++){
            System.out.println("Informe a primeira nota: ");
            float n1 = leitor.nextFloat();
            System.out.println("Informe a segunda nota: ");
            float n2 = leitor.nextFloat();
            float mediaN = (n1+n2)/2;
            mediaClass += mediaN;

            System.out.println("A sua média foi: " + mediaN);

            if(mediaN > 7){
                System.out.println("Aprovado!");
                aprovado++;
            } else if (mediaN < 3) {
                System.out.println("Reprovado!");
                reprovado++;

            } else {
                System.out.println("Exame!");
                exame++;
            }

        }

        float calcMedia = mediaClass/6;

        System.out.println("Total de aprovado: " + aprovado + ". \nTotal de exame: " + exame +
                ". \nTotal de reprovado: " + reprovado + ". \nMedia da sala: " + calcMedia + ".");
    }
}
