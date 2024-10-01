package model;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Marco");
        f1.calcularSalario();
        f1.status();

        Funcionario f2 = new Gerente("Rafael");
        f2.calcularSalario();
        f2.status();

    }
}