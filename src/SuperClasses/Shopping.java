package SuperClasses;

import SubClasses.Alimentacao;
import SubClasses.Bijuteria;
import SubClasses.Cosmetico;
import SubClasses.Informatica;
import SubClasses.Vestuario;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        String result = "Shopping: " + nome + ", Endereco: " + endereco + ", Lojas: [";
        for (Loja l : lojas) {
            if (l != null) {
                result += l.getNome() + " ";
            }
        }
        return result + "]";
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;
        for (Loja l : lojas) {
            if (l == null)
                continue;
            switch (tipo) {
                case "Cosmetico" -> {
                    if (l instanceof Cosmetico)
                        count++;
                }
                case "Vestuario" -> {
                    if (l instanceof Vestuario)
                        count++;
                }
                case "Bijuteria" -> {
                    if (l instanceof Bijuteria)
                        count++;
                }
                case "Alimentacao" -> {
                    if (l instanceof Alimentacao)
                        count++;
                }
                case "Informatica", "Informática" -> {
                    if (l instanceof Informatica)
                        count++;
                }
                default -> {
                    return -1;
                }
            }
        }
        return count;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCara = null;
        for (Loja l : lojas) {
            if (l instanceof Informatica info) {
                if (maisCara == null || info.getSeguroEletronicos() > maisCara.getSeguroEletronicos()) {
                    maisCara = info;
                }
            }
        }
        return maisCara;
    }
}
