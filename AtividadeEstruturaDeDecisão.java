import java.util.Scanner;
public class AtividadeEstruturaDeDecisão {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
      /*  Questão 1: Faça um programa que receba dois números e imprima o maior deles.
       double numb1,numb2;
       System.out.println("Informe um número");
       numb1 = scr.nextDouble();

       System.out.println("Informe outro número");
       numb2 = scr.nextDouble();

       if (numb1 > numb2){
           System.out.println("O número " + numb1 + " é maior que o número " + numb2);
       }
       else if (numb1 < numb2){
           System.out.println("O número " + numb2 + " é maior que o número  " +numb1);
       }
       else {
           System.out.println("Os números são iguais");
       }

       *//* Questão 2:Faça um programa que receba o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato
        double prod1, prod2, prod3;

        System.out.println("Informe o preço do primeiro produto");
        prod1 = scr.nextDouble();
        System.out.println("Informe o preço do segundo produto");
        prod2 = scr.nextDouble();
        System.out.println("Informe o preço do terceiro produto");
        prod3 = scr.nextDouble();;

        if ((prod1 <= prod2) && (prod1 <= prod3)){
            System.out.println("O produto de valor " + prod1 + " é o mais barato");
        } else if ((prod1 >= prod2) && (prod2 <= prod3)) {
            System.out.println("O produto de valor " +prod2 + " é o mais barato");
        } else if ((prod3 <= prod1) && (prod3 <= prod2)){
            System.out.println("O produto de valor " + prod3 + " é o mais barato");
        }
        else{
            System.out.println("sem resposta");
        }

        *//* Questão 3:Faça um programa que receba duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar: (A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; A mensagem "Reprovado", se a média for menor do que sete; A mensagem "Aprovado com Distinção", se a média for igual a dez.)
        double not1, not2, media;
        
        System.out.println("Insira sua primeira nota");
        not1 = scr.nextDouble();
        System.out.println("Insira sua segunda nota");
        not2 = scr.nextDouble();

        media =(not1 + not2)/2.0;

        if (media>=10){
            System.out.println("Aprovado com Distinção");
        } else if (media>=7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    */}
}
