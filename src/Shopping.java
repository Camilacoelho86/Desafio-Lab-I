import java.util.Arrays;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja [] lojas;

public Shopping (String nome, Endereco endereco, int maxLojas) {
    this.nome = nome;
    this.endereco = endereco;
    this.lojas = new Loja [maxLojas];
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
    if (lojas.length <= this.lojas.length) {
        this.lojas = lojas;
    } else {
        System.out.println("Erro: número de lojas excede a capacidade do shopping.");
    }
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

public boolean removeLoja(String nomeLoja) {
    for (int i = 0; i < lojas.length; i++) {
        if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
            lojas[i] = null;
            return true;
        }
    }
    return false;
}

public int quantidadeLojasPorTipo(String tipoLoja) {
    int contador = 0;
    String[] tiposValidos = {"Cosmético", "Vestuário", "Bijuteria", "Alimentação", "Informática"};
    boolean tipoValido = false;

    for (String tipo : tiposValidos) {
        if (tipo.equals(tipoLoja)) {
            tipoValido = true;
            break;
        }
    }

    if (!tipoValido) {
        return -1;
    }

    for (Loja loja : lojas) {
        if (loja != null && loja.getTipo().equals(tipoLoja)) {
            contador++;
        }
    }
    return contador;
}

public Informatica lojaSeguroMaisCaro() {
    Informatica maisCaro = null;
    for (Loja loja : lojas) {
        if (loja instanceof Informatica) {
            Informatica Informatica = (Informatica) loja;
            if (maisCaro == null || Informatica.getSeguroEletronicos() > maisCaro.getSeguroEletronicos()) {
                maisCaro = Informatica;
            }
        }
    }
    return maisCaro;
}


@Override
public String toString() {
    return "Shopping [nome=" + nome + ", endereco=" + endereco + ", lojas=" + Arrays.toString(lojas) + "]";
}


}
