public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que inicializa todos os atributos e valida a data
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Atribuindo data padrão: 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Método para validar a data
    private boolean validarData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        if (dia < 1 || dia > 31) {
            return false;
        }

        // Verifica os dias máximos para cada mês
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Verifica se é um ano bissexto
        if (verificaAnoBissexto(ano)) {
            diasPorMes[1] = 29; // Fevereiro tem 29 dias em anos bissextos
        }

        return dia <= diasPorMes[mes - 1];
    }

    // Método para verificar se o ano é bissexto
    private boolean verificaAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
  // Método para exibir a data
  public void exibirData() {
    System.out.println(dia + "/" + mes + "/" + ano);
}

    // Getters para acessar os atributos
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data [dia=" + dia + "/ mes=" + mes + "/ ano=" + ano + "]";
    }

    public boolean verificaAnoBissexto() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'verificaAnoBissexto'");
    }
        
    


}

