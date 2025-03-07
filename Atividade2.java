import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scr = new Scanner(System.in);
		System.out.print("Qual sua idade: ");

		int idade = scr.nextInt();
        String msg = idade >= 18
        ? "Você é maior" 
        : "Você é menor";
         
        System.out.println(msg);

		/*if(idade >= 18) ? :
		    System.out.println("Você é maior de idade");
		}else{
		    System.out.println("Você é menor de idade");
		}
		*/
		
		System.out.printf("Você tem %s horas de vida", idade*365*24);
	}
}
