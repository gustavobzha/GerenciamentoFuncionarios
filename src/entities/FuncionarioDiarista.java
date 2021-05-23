package entities;

import java.util.Comparator;
import java.util.Date;

public class FuncionarioDiarista extends Funcionario{
    private int diasTrabalhados = 0;
    private final double salario = 65.00;

    public FuncionarioDiarista(String cpfCnpj, String nome, Date dataNascimento, String endereco) {
        super(cpfCnpj, nome, dataNascimento, endereco);
    }

    public int getDiasTrabalhados() {
        return diasTrabalhados;
    }

    public void setDiasTrabalhados(int diasTrabalhados) {
        this.diasTrabalhados = diasTrabalhados;
    }

    public double getSalario() {
        return salario;
    }

    public void diaria(){
        diasTrabalhados += 1;
    }

    @Override
    public double salarioSemanal() {
        return diasTrabalhados * salario;
    }

}
