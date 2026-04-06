package SubClasses;

import SuperClasses.Data;
import SuperClasses.Endereco;
import SuperClasses.Loja;

public class Bijuteria extends Loja {

    private double metaVendas;

    public Bijuteria(String nome, int quantFuncionarios, double salarioBaseFuncionarios, Endereco endereco,
            Data dataFundacao, int maxProdutos, double metaVendas) {
        super(nome, quantFuncionarios, salarioBaseFuncionarios, endereco, dataFundacao, maxProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() + "Bijuteria [metaVendas=" + metaVendas + "]";
    }

}
