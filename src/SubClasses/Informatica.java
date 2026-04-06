package SubClasses;

import SuperClasses.Data;
import SuperClasses.Endereco;
import SuperClasses.Loja;

public class Informatica extends Loja {

    private double seguroEletronicos;

    public Informatica(String nome, int quantFuncionarios, double salarioBaseFuncionarios, Endereco endereco,
            Data dataFundacao, int maxProdutos, double seguroEletronicos) {
        super(nome, quantFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao, maxProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() + "Informatica [seguroEletronicos=" + seguroEletronicos + "]";
    }
}
