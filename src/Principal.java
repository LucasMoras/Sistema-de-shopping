import java.util.Scanner;
import SuperClasses.Data;
import SuperClasses.Endereco;
import SuperClasses.Loja;
import SuperClasses.Produto;

void main() {
    Scanner sc = new Scanner(System.in);

    Loja loja = null;
    Produto produto = null;

    while (loja == null || produto == null) {
        IO.println("(1) criar uma loja");
        IO.println("(2) criar um produto");
        IO.println("(3) sair");
        int opcao = sc.nextInt();
        sc.nextLine();

        if (opcao == 1) {
            IO.println("Nome da loja:");
            String nome = sc.nextLine();
            IO.println("Quantidade de funcionarios:");
            int quant = sc.nextInt();
            sc.nextLine();
            IO.println("Salario base:");
            double salario = sc.nextDouble();
            sc.nextLine();
            IO.println("Maximo de produtos:");
            int maxProdutos = sc.nextInt();
            sc.nextLine();

            IO.println("Rua:");
            String rua = sc.nextLine();
            IO.println("Cidade:");
            String cidade = sc.nextLine();
            IO.println("Estado:");
            String estado = sc.nextLine();
            IO.println("Pais:");
            String pais = sc.nextLine();
            IO.println("CEP:");
            String cep = sc.nextLine();
            IO.println("Numero:");
            String numero = sc.nextLine();
            IO.println("Complemento:");
            String complemento = sc.nextLine();

            Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

            IO.println("Data de fundacao - dia:");
            int dia = sc.nextInt();
            IO.println("Mes:");
            int mes = sc.nextInt();
            IO.println("Ano:");
            int ano = sc.nextInt();
            sc.nextLine();

            Data dataFundacao = new Data(dia, mes, ano);
            loja = new Loja(nome, quant, salario, endereco, dataFundacao, maxProdutos);

        } else if (opcao == 2) {
            IO.println("Nome do produto:");
            String nome = sc.nextLine();
            IO.println("Preco:");
            double preco = sc.nextDouble();
            sc.nextLine();

            IO.println("Data de validade - dia:");
            int dia = sc.nextInt();
            IO.println("Mes:");
            int mes = sc.nextInt();
            IO.println("Ano:");
            int ano = sc.nextInt();
            sc.nextLine();

            Data dataValidade = new Data(dia, mes, ano);
            produto = new Produto(nome, preco, dataValidade);

        } else if (opcao == 3) {
            IO.println("Saindo...");
            break;

        } else {
            IO.println("Opcao invalida");
        }
    }

    if (loja != null && produto != null) {
        Data dataVerificacao = new Data(20, 10, 2023);
        if (produto.estaVencido(dataVerificacao)) {
            IO.println("PRODUTO VENCIDO");
        } else {
            IO.println("PRODUTO NAO VENCIDO");
        }
        IO.println(loja);
    }

    sc.close();
}