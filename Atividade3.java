import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();

        switch(input){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("vogal");
                break;
            default:
                System.out.println("consonate");
                
        }
	}
}
