//parte 5
public class Main {
    public static void main(String[] args) {
        FuncionarioHorista a = new FuncionarioHorista();
        a.setNome("Pedro");
        a.setCpf("098");
        a.setSalarioBase(1600.50);
        a.valorHora = 20;
        a.horasTrabalhadas = 40;
        FuncionarioComissionado b = new FuncionarioComissionado();
        b.setNome("João");
        b.setCpf("099");
        b.setSalarioBase(1500.50);
        b.vendas = 20;
        b.percentualComessao = 0.2;

        System.out.println(a.toString()+"\n"+a.calcularPagamento());
        System.out.println(b.toString()+"\n"+b.calcularPagamento());
    }
}
//parte 1
interface Pagavel{
    double calcularPagamento();
}
//parte 2
abstract class Funcionario implements Pagavel{
    private String nome;
    private String cpf;
    private double salarioBase;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }

    public Funcionario(){}
    public Funcionario(String nome, String cpf, double salarioBase){
        System.out.println(nome +"\n"+cpf+"\n"+salarioBase);
    }

    @Override
    public String toString(){
        return "Informações do funcionario:\nNome:"+nome+"\nCPF:"+cpf+"\nSalário Base:"+salarioBase;
    }

    //parte 3
    public double calcularPagamento(){
        return salarioBase;
    }
}
//parte 4
class FuncionarioHorista extends Funcionario{
    double horasTrabalhadas;
    double valorHora;

    @Override
    public double calcularPagamento(){
        return horasTrabalhadas*valorHora;
    }
}
class FuncionarioComissionado extends Funcionario{
    double vendas;
    double percentualComessao;

    @Override
    public double calcularPagamento(){
        //double salario = getSalarioBase();
        return (getSalarioBase()+(vendas*percentualComessao));
    }
}
