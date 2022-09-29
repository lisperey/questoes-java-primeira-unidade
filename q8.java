package questoes;

import java.util.ArrayList;
import java.util.Scanner;
import  java.util.List;

public class q8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String fim = "fim";
        Boolean enter = true;
        List<Double> listaH = new ArrayList<Double>();
        Double idadeMaisV = 0.0;
        String nomeMaisV = " ";
        Double alturaMulherMB = 10.0;
        String nomeMulherMB = " ";
        int quantidadeP = 0;
        int quantidadeM = 0;
        int quantidadeA = 0;



        while(true){
            if(enter){
                System.out.println("Aperte enter para continuar");
                enter = false;

            }

            leitor.nextLine();
            System.out.println("Informe seu nome: ");
            String nome = leitor.nextLine();

            if(nome.toLowerCase().equals(fim)){
                break;
            }
            System.out.println("Informe o sexo(m-Masculino/ f-Feminino): ");
            String sexo = leitor.next();
            System.out.println("Informe seu peso: ");
            float peso = leitor.nextFloat();
            System.out.println("Informe sua idade: ");
            double idade = leitor.nextInt();
            if(sexo.toLowerCase().equals("m")){
                listaH.add(idade);
                System.out.println(listaH);
            }
            System.out.println("Informe sua altura: ");
            double altura = leitor.nextFloat();
            if(idade>=18 && idade<=25){
                quantidadeA++;
            }
            if(sexo.toLowerCase().equals("f") && (altura>=1.60 || altura<=1.70) && peso > 70){
                quantidadeM++;
            }
            quantidadeP++;

            if(idadeMaisV<idade){
                idadeMaisV = idade;
                nomeMaisV = nome;
                }
            if(sexo.toLowerCase().equals("f")){
                if(alturaMulherMB>altura){
                    alturaMulherMB = altura;
                    nomeMulherMB = nome;

                }

            }


        }
        int somar = 0;
        for(int i = 0; i < listaH.size(); i++){
            somar += listaH.get(i);
        }
        Double mediaIdadeH = somar/Double.valueOf(listaH.size());




        System.out.println("Quantidade total de pacientes: " + quantidadeP);
        if(somar == 0){
            System.out.println("Média da idade dos homens: 0 ");

        }
        else {
            System.out.println("Média da idade dos homens: " + mediaIdadeH);}

        System.out.println("Quantidade de pessoa entre 18 e 25: " + quantidadeA);
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima\n" +
                "de 70kg: " + quantidadeM);
        System.out.println("Paciente mais velhor: " + nomeMaisV);
        System.out.println("Mulher mais baixa: " + nomeMulherMB);
    }
}
