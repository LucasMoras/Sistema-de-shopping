package SuperClasses;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    // Construtor com validação
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            IO.println("Data inválida. Usando data padrão 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Validação de data
    private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12)
            return false;

        int limiteDias;
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> limiteDias = 31;
            case 4, 6, 9, 11 -> limiteDias = 30;
            case 2 -> limiteDias = ehBissexto(ano) ? 29 : 28;
            default -> limiteDias = 0;
        }

        return dia >= 1 && dia <= limiteDias;
    }

    // Método auxiliar para verificar ano bissexto
    private boolean ehBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }

    public boolean verificaAnoBissexto() {
        return ehBissexto(this.ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validaData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            IO.println("Dia inválido para o mês/ano atual.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validaData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            IO.println("Mês inválido ou incompatível com o dia atual.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validaData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            IO.println("Ano inválido para o dia/mês atual.");
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
