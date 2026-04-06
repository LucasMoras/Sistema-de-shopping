package SubClasses;

import SuperClasses.Data;
import SuperClasses.Endereco;
import SuperClasses.Loja;

public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario(String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int maxProdutos, boolean produtosImportados) {
        super(nome, quantidaDeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, maxProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean isProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + "Vestuario [produtosImportados=" + produtosImportados + "]";
    }

}
