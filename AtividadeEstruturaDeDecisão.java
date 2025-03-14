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

        if (media==10){
            System.out.println("Aprovado com Distinção");
        } else if (media>=7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
              */  /* Questão 4:
        double sal, reaj, salf;

        System.out.println("Informe seu salário");
        sal = scr.nextDouble();

        if (sal <= 280){
            reaj = (sal*20)/100;
            salf = sal+reaj;
            System.out.println("O salário antes do reajuste é: " +sal);
            System.out.println("O percentual aplicado foi: 20%");
            System.out.println("O valor do aumento foi de: " +reaj);
            System.out.println("O novo salário é: " + salf);
        } else if ((sal >280) && (sal<=700)) {
            reaj = (sal*15)/100;
            salf = sal+reaj;
            System.out.println("O salário antes do reajuste é: " +sal);
            System.out.println("O percentual aplicado foi: 15%");
            System.out.println("O valor do aumento foi de: " +reaj);
            System.out.println("O novo salário é: " + salf);
        } else if ((sal>700) && (sal<= 1500)) {
            reaj = (sal*10)/100;
            salf = sal+reaj;
            System.out.println("O salário antes do reajuste é: " +sal);
            System.out.println("O percentual aplicado foi: 10%");
            System.out.println("O valor do aumento foi de: " +reaj);
            System.out.println("O novo salário é: " + salf);
        }else {
            reaj = (sal*5)/100;
            salf = sal+reaj;
            System.out.println("O salário antes do reajuste é: " +sal);
            System.out.println("O percentual aplicado foi: 5%");
            System.out.println("O valor do aumento foi de: " +reaj);
            System.out.println("O novo salário é: " + salf);
        }

        *//* Questão 5:
        int dia;

        System.out.println("Informe um número");
        dia = scr.nextInt();

        switch (dia){
            case 1:
                System.out.println("Hoje é domingo!");
            break;
            case 2:
                System.out.println("Hoje é segunda!");
                break;
            case 3:
                System.out.println("Hoje é terça!");
                break;
            case 4:
                System.out.println("Hoje é quarta!");
                break;
            case 5:
                System.out.println("Hoje é quinta!");
                break;
            case 6:
                System.out.println("Hoje é sexta!");
                break;
            case 7:
                System.out.println("Hoje é sabado!");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }

        *//* Questão 6:
        // Variavel
        double imp, salb, salliq, vH, qH, inss;
        //Pedir resultado
        System.out.print("Informe quantas horas trabalhou no mês: ");
        qH = scr.nextDouble();
        System.out.print("Informe valor da hora: ");
        vH = scr.nextDouble();

        salb = vH*qH;
        if (salb <= 900) {
            inss = (10*salb)/100;
            salliq = salb - inss;
            System.out.println("Seu salário bruto é de "+ salb);
            System.out.println("Seu salário liquido é de "+ salliq);
            System.out.println("Desconto de INSS: "+ inss);
            System.out.println("Você está isento do IR");
        } else if ((salb>900) && (salb <=1500)) {
            inss = (10*salb)/100;
            imp = (5*salb)/100;
            salliq = (salb - inss) - imp;
            System.out.println("Seu salário bruto é de "+ salb);
            System.out.println("Seu salário liquido é de "+ salliq);
            System.out.println("Desconto de INSS: "+ inss);
            System.out.println("Desconto do Imposto de Renda: " +imp);
        } else if ((salb>1500) && (salb <=2500)) {
            inss = (10*salb)/100;
            imp = (10*salb)/100;
            salliq = (salb - inss) - imp;
            System.out.println("Seu salário bruto é de "+ salb);
            System.out.println("Seu salário liquido é de "+ salliq);
            System.out.println("Desconto de INSS: "+ inss);
            System.out.println("Desconto do Imposto de Renda: " +imp);
        } else {
            inss = (10*salb)/100;
            imp = (20*salb)/100;
            salliq = (salb - inss) - imp;
            System.out.println("Seu salário bruto é de "+ salb);
            System.out.println("Seu salário liquido é de "+ salliq);
            System.out.println("Desconto de INSS: "+ inss);
            System.out.println("Desconto do Imposto de Renda: " +imp);
        }
        
    */}
}
