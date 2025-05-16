//Classe menu
package AtividadeClass;

public class Menu {

    public void menu(){
        System.out.println("\tCadastro de clientes");
        System.out.println("0. Fechar");
        System.out.println("1. Gravar");
        System.out.println("2. Alterar");
        System.out.println("3. Excluir");
        System.out.println("4. Consulta");
        System.out.println("Opcao:");
    }
}

//Classe Pessoa
package AtividadeClass;

public class Pessoa2 {
    //atributos
    private String nome;
    private int idade;

    //metodos get
    public String getNome(){
       return nome;
    }
     public int getIdade(){
       return idade;
    }


    //metodos
    public void cadastrar (String nome, int idade){
       this.nome=nome;
       this.idade= idade;
    }
    public void alterar (String nome, int idade){
        this.nome=nome;
        this.idade= idade;
    }
    public void excluir (int sim){
       if (sim==1){
           this.nome= null;
           this.idade= 0;
       }
    }

    public String exibir (){
        return "Nome: "+getNome()+"\nIdade: "+getIdade();
    }
    public boolean erro(){
        if (nome==null && idade==0) {
            return true;
        }
        return false;
    }
}

//Classe App (Principal)
package AtividadeClass;

public class Pessoa2 {
    //atributos
    private String nome;
    private int idade;

    //metodos get
    public String getNome(){
       return nome;
    }
     public int getIdade(){
       return idade;
    }


    //metodos
    public void cadastrar (String nome, int idade){
       this.nome=nome;
       this.idade= idade;
    }
    public void alterar (String nome, int idade){
        this.nome=nome;
        this.idade= idade;
    }
    public void excluir (int sim){
       if (sim==1){
           this.nome= null;
           this.idade= 0;
       }
    }

    public String exibir (){
        return "Nome: "+getNome()+"\nIdade: "+getIdade();
    }
    public boolean erro(){
        if (nome==null && idade==0) {
            return true;
        }
        return false;
    }
}
