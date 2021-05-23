package entities;

import java.util.Comparator;
import java.util.Date;

public class FuncionarioPj extends Funcionario{
    private final double salario = 500.00;

    public FuncionarioPj(String cpfCnpj, String nome, Date dataNascimento, String endereco) {
        super(cpfCnpj, nome, dataNascimento, endereco);
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public double salarioSemanal() {
        return salario;
    }
}
