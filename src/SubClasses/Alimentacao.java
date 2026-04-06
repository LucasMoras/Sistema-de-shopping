package SubClasses;

import SuperClasses.Data;
import SuperClasses.Endereco;
import SuperClasses.Loja;

public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao(String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int maxProdutos, Data dataAlvara) {
        super(nome, quantidaDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return super.toString() + "Alimentacao [dataAlvara=" + dataAlvara + "]";
    }
}
