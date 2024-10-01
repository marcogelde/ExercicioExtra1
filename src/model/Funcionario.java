package model;

public class Funcionario {

    public static final int SALARIO = 220 * 15;
    protected String nome;
    protected float salario;
    protected String tipo;

    public Funcionario(String nome) {
        this.setNome(nome);
        this.setTipo("Funcionario");
    }

    public void calcularSalario() {
        this.setSalario(SALARIO);
    }

    public void status() {
        System.out.println("-----------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Tipo: " + this.getTipo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

