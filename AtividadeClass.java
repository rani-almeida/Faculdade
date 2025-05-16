//Classe Pessoa
package AtividadeClass;

public class Pessoa3 {
    private int id;
    private String nome;
    private int idade;

    public Pessoa3(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Idade: " + idade;
    }
}

//Classe APP (principal)
package AtividadeClass;

import java.util.ArrayList;
import java.util.Scanner;

public class App3 {
    private static ArrayList<Pessoa3> pessoas = new ArrayList<>();
    private static int proximoId = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Gravar pessoa");
            System.out.println("2. Alterar pessoa");
            System.out.println("3. Excluir pessoa");
            System.out.println("4. Listar pessoas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    gravar(sc);
                    break;
                case 2:
                    alterar(sc);
                    break;
                case 3:
                    excluir(sc);
                    break;
                case 4:
                    listar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void gravar(Scanner sc) {
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Limpa buffer

        Pessoa3 p = new Pessoa3(proximoId++, nome, idade);
        pessoas.add(p);
        System.out.println("Pessoa adicionada com sucesso!");
    }

    private static void alterar(Scanner sc) {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.print("Digite o ID da pessoa que deseja alterar: ");
            int id = sc.nextInt();
            sc.nextLine(); // Limpa buffer

            Pessoa3 pessoa = buscarPorId(id);
            if (pessoa != null) {
                System.out.print("Novo nome: ");
                String novoNome = sc.nextLine();
                System.out.print("Nova idade: ");
                int novaIdade = sc.nextInt();
                sc.nextLine(); // Limpa buffer

                pessoa.setNome(novoNome);
                pessoa.setIdade(novaIdade);
                System.out.println("Pessoa alterada com sucesso!");
            } else {
                System.out.println("Pessoa não encontrada.");
            }
        }
    }

    private static void excluir(Scanner sc) {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.print("Digite o ID da pessoa que deseja excluir: ");
            int id = sc.nextInt();
            sc.nextLine(); // Limpa buffer

            Pessoa3 pessoa = buscarPorId(id);
            if (pessoa != null) {
                pessoas.remove(pessoa);
                System.out.println("Pessoa excluída com sucesso!");
            } else {
                System.out.println("Pessoa não encontrada.");
            }
        }
    }

    private static void listar() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (Pessoa3 p : pessoas) {
                System.out.println(p);
            }
        }
    }

    private static Pessoa3 buscarPorId(int id) {
        for (Pessoa3 p : pessoas) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
