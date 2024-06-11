
public class Produto {
    public static final String getDataValidade = null;
    private String nome;
    private double preco;
    private static Data dataValidade;
    


public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getPreco() {
    return preco;
}

public void setPreco(double preco) {
    this.preco = preco;
}

public Data getDataValidade() {
    return dataValidade;
}

public void setDataValidade(Data dataValidade) {
    this.dataValidade = dataValidade;
}
@Override
public String toString() {
    return "Produto{" +
    "nome='" + nome + '\'' +
    ", preco=" + preco +
    ", dataValidade=" + dataValidade +
    '}';
}


public static boolean estaVencido(Data dataAtual) {
    int diaValidade = dataValidade.getDia ();
    int mesValidade = dataValidade.getMes();
    int anoValidade = dataValidade.getAno();

    int diaAtual = dataAtual.getDia();
    int mesAtual = dataAtual.getMes();
    int anoAtual = dataAtual.getAno();

    if (anoValidade < anoAtual || (anoValidade == anoAtual && mesValidade < mesAtual)
            || (anoValidade == anoAtual && mesValidade == mesAtual && diaValidade < diaAtual)) {
        return true;

    }
    else {return false;}
}
}

