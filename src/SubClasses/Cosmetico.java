package SubClasses;

import SuperClasses.Data;
import SuperClasses.Endereco;
import SuperClasses.Loja;

public class Cosmetico extends Loja {

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantFuncionarios, double salarioBaseFuncionarios, Endereco endereco,
            Data dataFundacao, int maxProdutos, double taxaComercializacao) {
        super(nome, quantFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao, maxProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taxa de Comercialização: " + taxaComercializacao;
    }
}
