import java.util.Scanner;
public class Atividade1
{
	public static void main(String[] args) {
	    Scanner scr = new Scanner(System.in);
	    
/*	    Questão 1: Ler a cotação do dólar e a quantidade de dólares. Converter para real e mostrar o resultado
	    double cota, quant, result;
	    
	    System.out.println("Qual a cotação atual do dolar?");
	    cota = scr.nextDouble();
	    
	    System.out.println("Quantos dolares deseja converter?");
	    quant = scr.nextDouble();
	    
	    result = quant*cota;
	    
	    System.out.println("Você possui " + result + " reais");
	    
*//*	    Questão 2: Ler 4 números, calcular o quadrado para cada um, somar todos os quadrados e mostrar o resultado
	    int x = 1, y = 2, z = 3, h = 4;
	    double result;
	    
	    System.out.println("Vamos calcular o a soma dos quadrados dos números 1,2,3 e 4");
	    
	    result = (x*x)+(y*y)+(z*z)+(h*h);
	    
	    System.out.println("O resultado é: " + result);
	    
*//*	    Questão 3:Calcular o pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão será de 5% do total da venda e que você tem os seguintes dados: preço unitário da peça e quantidade vendida
	    double comi, val, quant;
	    
	    System.out.println("Informe o preço unitário da peça:");
	    val = scr.nextDouble();
	    
	    System.out.println("Agora informe a quantidade de peças vendidas:");
	    quant = scr.nextDouble();
	    
	    comi = (quant*val)*5/100;
	    
	    System.out.println("A sua comissão será de " + comi + " reais");
	    
*//*	    Questão 4:Ler um valor inteiro e exibir seu antecessor
	    int n, result;
	    
	    System.out.println("Informe um valor inteiro:");
	    n = scr.nextInt();
	    
	    result = n-1;
	    
	    System.out.println("O valor antecessor do número informado é: " + result);
	    
*//*	    Questão 5:Ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
	    double b, h, area;
	    
	    System.out.println("Informe qual a base do retângulo");
	    b = scr.nextDouble();
	    
	    System.out.println("Informe a altura do retângulo");
	    h = scr.nextDouble();
	    
	    area = b* h;
	    
	    System.out.println("A área do retângulo é: " + area);
	    
*//*	    Questão 6:Ler a idade de uma pessoa expressa em anos e exibir expressa em dias (considere que um ano tem 365 dias.)
	    int idade, dias;
	    
	    System.out.println("Qual a sua idade?");
	    idade = scr.nextInt();
	    
	    dias = idade*365;
	    
	    System.out.println("Você possui " + dias + " dias de vida");
	    
*//*	    Questão 7:Ler a idade de uma pessoa expressa em anos, meses e dias e exibir a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.
	    int idade, meses, dias, total;
	    
	    System.out.println("Insira quantos anos, meses e dias você tem (lembre-se de pressionar o enter a cada resposta)");
	    idade = scr.nextInt();
	    meses = scr.nextInt();
	    dias = scr.nextInt();
	    
	    total = (idade*365)+(meses*30)+dias;
	    
	    System.out.println("você possui " + total + " dias de vida.");
	    
*//*	    Questão 8: Ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
	    double total, b, n, v, percentb, percentn, percentv;
	    
	    System.out.println("Quantos eleitores possui no seu município?");
	    total = scr.nextDouble();
	    
	    System.out.println("Informe quantos votos brancos, nulos e válidos teve no município (lembre-se de pressionar o enter a cada resposta)");
	    b = scr.nextDouble();
	    n = scr.nextDouble();
	    v = scr.nextDouble();
	    
	    percentb = (b/total)*100;
	    percentn = (n/total)*100;
	    percentv = (v/total)*100;
	    
	    System.out.println("O município recebeu " + percentb + "% de votos brancos, " + percentn + "% de votos nulos e " + percentv + "% de votos válidos.");
	    
*//*	    Questão 9: Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e exibir o valor do novo salário.
	    double atual, reajuste, novo, porcent;
	    
	    System.out.println("Informe o atual salário do funcionário:");
	    atual = scr.nextDouble();
	    
	    System.out.println("Agora informe qual o percentual de reajuste (sem o símbolo %)");
	    reajuste = scr.nextDouble();
	    
	    porcent = (atual*reajuste)/100;
	    novo = atual+porcent;
	    
	    System.out.println("O valor do novo salário será de " + novo + " reais.");
	    
*//*	    Questão 10: O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
	    double custof, percentd, impost, valorf;
	    
	    System.out.println("Informe qual o custo de fábrica do carro:");
	    custof = scr.nextDouble();
	    
	    percentd = (custof*28)/100;
	    impost = (custof*45)/100;
	    valorf = custof+percentd+impost;
	    
	    System.out.println("O carro custará " + valorf + " reais");
	    
*//*	    Questão 11: Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Ler o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcular e exibir o salário final do vendedor.
	    double salf, comissf, quant, valv, vale, valt;
	    
	    System.out.println("Quantos carros você vendeu?");
	    quant = scr.nextDouble();
	    
	    System.out.println("Qual o valor total das vendas?");
	    valv = scr.nextDouble();
	    
	    System.out.println("Qual o seu salário?");
	    salf = scr.nextDouble();
	    
	    System.out.println("Quanto você recebe por carro vendido?");
	    comissf = scr.nextDouble();
	    
	    valt = salf+(comissf*quant)+(valv*5/100);
	    
	    System.out.println("Você receberá " + valt + " reais.");
*/	    
	    
	    scr.close();
	   
	}
}
