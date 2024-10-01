package model;

public class Gerente extends Funcionario{

    public Gerente(String nome) {
        super(nome);
        this.setTipo("Gerente");
    }

    @Override
    public void calcularSalario() {
        float bonus = 1000;
        this.setSalario(SALARIO + bonus);
    }


}
