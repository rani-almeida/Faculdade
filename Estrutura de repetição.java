import java.util.Arrays;
import java.util.Scanner;
public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //Questão 1: Faça um programa que mostra na tela os números de 1 a 100.
        int i=1;
        while (i<=100){
            System.out.println(i);
            i++;
        }
     
      //Questão 2:Faça um programa que mostra na tela os números de 100 a 1.
        int i=100;
        while (i>=1){
            System.out.println(i);
            i--;
        }
      
      //Questão 3: Faça um programa para ler 5 números e mostrar o resultado da soma desses números

        int numero, s=0, i=0;
        while (i<5){
            System.out.println("Digite um número");
            numero = scr.nextInt();
            s += numero; // s=s+numero
            i++;
        }
        System.out.println("A soma dos valores é: " + s);
      
      //Questão 4: Escreva, usando while, um programa para calcular a média de N números. O valor de N é dado pelo usuário.

        double  numero, media, soma =0;
        int quantidadeDeNumeros, i=0;

        System.out.println("Quantos números deseja informar?");
        quantidadeDeNumeros = scr.nextInt();

        while (i<quantidadeDeNumeros){
            System.out.println("Informe o número: ");
            numero = scr.nextDouble();
            soma += numero;
            i++;
        }
        media = soma /quantidadeDeNumeros;
        System.out.println("A média dos números é: " +media);

       //Questão 5:Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar a quantidade de números pares desses números.
        int quantidadeDeNumeros, nPar =0, i=0, numero;

        System.out.println("Quantos números deseja informar?");
        quantidadeDeNumeros = scr.nextInt();

        while (i<quantidadeDeNumeros){
            System.out.println("Informe o número: ");
            numero = scr.nextInt();

            if(numero %2 == 0){
                nPar ++;
            }
            i++;
        }
        System.out.println("A quantidade de números pares é: " + nPar);

      //Questão 6: Faça um programa para ler uma quantidade de números (N) digitada pelo usuário e mostrar a quantidade de números ímpares desses números
        int quantidadeDeNumeros, nImpar =0, i=0, numero;

        System.out.println("Quantos números deseja informar?");
        quantidadeDeNumeros = scr.nextInt();

        while (i<quantidadeDeNumeros){
            System.out.println("Informe o número: ");
            numero = scr.nextInt();

            if(numero %2 != 0){
                nImpar ++;
            }
            i++;
        }
        System.out.println("A quantidade de números impares é: " + nImpar);

      //Questão 7  Faça um programa que receba um conjunto de N números (Digitado pelo usuário) e mostre: O menor valor, o maior valor e a soma dos valores.
        int numero, nMenor, nMaior, soma = 0, qn;

        System.out.println("Quantos números deseja informar?");
        qn = scr.nextInt();
        int c [] = new int[qn];

        for (int i = 0; i < qn; i++) {
            System.out.println("Digite o numero:");
            numero = scr.nextInt();
            c[i] =numero;
            soma += numero;
        }
        Arrays.sort(c); //isso ordena do menor para o maior
        nMaior=c[qn-1]; //o maior valor fica na última posição
        nMenor=c[0]; // e o menor na primeira
        System.out.println("O maior número é: " + nMaior + " e o menor número é: " + nMenor);
        System.out.println("A soma dos valores informado é: " +soma);

        //Questão 8:Foi realizada uma pesquisa de algumas características físicas da populaçãodeumcertaregião. Foram entrevistadas 500 pessoas e coletados os seguintes dados:
        //a- sexo: M (masculino) e F (feminino);b- cor dos olhos: A (azuis), V (verdes) e C (castanhos);c- cor dos cabelos: L (louros), C (castanhos) e P (pretos);d- idade
        //Deseja-se saber:
        //A. a maior idade do grupo; B. a quantidade de indivíduos do sexo feminino, cuja idade está entre 18e35anoseque tenham olhos verdes e cabelos louros.
        int maiorIdade, individuos=0,resp4;
        char resp1,resp2,resp3;
        char sexo [] = new char[500];
        char olho [] = new char[500];
        char cabelo [] = new char[500];
        int idade [] = new int[500];

        for (int i = 0; i < 500 ; i++) {
            System.out.println("Qual o sexo: M (masculino) ou F (feminino)");
            resp1 = scr.next().charAt(0);
            sexo[i]=resp1;

            System.out.println("Qual a cor dos olhos: A (azuis), V (verdes) e C (castanhos)");
            resp2 = scr.next().charAt(0);
            olho[i]=resp2;

            System.out.println("Qual a cor dos cabelos: L (louros), C (castanhos)");
            resp3= scr.next().charAt(0);
            cabelo[i]=resp3;

            System.out.println("Qual a idade:");
            resp4= scr.nextInt();
            idade[i]=resp4;

            if ((resp1 =='f'||resp1 =='F') && (resp4 >=18 && resp4 <=35) && (resp2 == 'v'||resp2 =='V') && (resp3 == 'l'|| resp3 == 'L')){
                individuos++;
            }
        }
        Arrays.sort(idade);
        maiorIdade=idade[500-1];
        System.out.println("A maior idade do grupo é: " +maiorIdade);
        System.out.println("A quantidade de indivíduos do sexo feminino, cuja idade está entre 18 e 35 anos e que tenham olhos verdes e cabelos louros é de: " +individuos);
    }
}
