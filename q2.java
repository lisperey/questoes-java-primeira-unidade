package questoes;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        for(int i = 0; i < 10; i++){
            System.out.println("Informe o número: ");
            int n = leitor.nextInt();

            if(n%2 == 0){
                System.out.println("O número " + n + " é par.");

            } else{
                System.out.println("O número " + n + " é impar.");

            }

        }
    }
}
