package SuperClasses;

public class Loja {

    private String nome;
    private int quantidaDeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProduto;

    public Loja(String nome, int quantidaDeFuncionarios, double salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, int maxProdutos) {
        this.nome = nome;
        this.quantidaDeFuncionarios = quantidaDeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProduto = new Produto[maxProdutos];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidaDeFuncionarios() {
        return quantidaDeFuncionarios;
    }

    public void setQuantidaDeFuncionarios(int quantidaDeFuncionarios) {
        this.quantidaDeFuncionarios = quantidaDeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProduto;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProduto = estoqueProdutos;
    }

    @Override
    public String toString() {
        String estoque = "[";
        for (Produto p : estoqueProduto) {
            if (p != null) {
                estoque += p.getNome() + " ";
            }
        }
        estoque += "]";

        return "Loja Nome: " + nome
                + ", Quantidade de funcionarios: " + quantidaDeFuncionarios
                + ", Salario base: " + salarioBaseFuncionario
                + ", Endereco: " + endereco
                + ", Data de fundacao: " + dataFundacao
                + ", Estoque: " + estoque;
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario > -1) {
            return salarioBaseFuncionario * quantidaDeFuncionarios;
        }
        return -1;
    }

    public char tamanhoDaLoja() {
        if (quantidaDeFuncionarios < 10)
            return 'P';
        else if (quantidaDeFuncionarios <= 30)
            return 'M';
        else
            return 'G';
    }

    public void imprimeProdutos() {
        for (Produto p : estoqueProduto) {
            if (p != null)
                IO.println(p);
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProduto.length; i++) {
            if (estoqueProduto[i] == null) {
                estoqueProduto[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nome) {
        for (int i = 0; i < estoqueProduto.length; i++) {
            if (estoqueProduto[i] != null && estoqueProduto[i].getNome().equals(nome)) {
                estoqueProduto[i] = null;
                return true;
            }
        }
        return false;
    }
}