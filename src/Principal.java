
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Loja loja = null;
        Produto produto = null;
    
    int opcao;
    do {
    System.out.println("\nMenu:");
    System.out.println("1. Criar loja");
    System.out.println("2. Criar produto");
    System.out.println("3. Sair");
    System.out.print("Digite a opção desejada: ");

    opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
            criarLoja(scanner);
            break;
        case 2:
            criarProduto(scanner);
            break;
        case 3:
            System.out.println("Saindo do programa...");
            break;
        default:
            System.out.println("Opção inválida!");
    }
} while (opcao != 3);
}

private static void criarLoja(Scanner scanner) {
System.out.print("Digite o nome da loja: ");
String nome = scanner.next();

System.out.print("Digite a quantidade de funcionários: ");
int quantidadeFuncionarios = scanner.nextInt();

System.out.print("Digite o salário base dos funcionários: ");
double salarioBaseFuncionario = scanner.nextDouble();

System.out.print("Digite o nome da rua: ");
String nomeRua = scanner.next();

System.out.print("Digite a cidade: ");
String cidade = scanner.next();

System.out.print("Digite o estado: ");
String estado = scanner.next();

System.out.print("Digite o país: ");
String pais = scanner.next();

System.out.print("Digite o CEP: ");
String cep = scanner.next();

System.out.print("Digite o número: ");
String numero = scanner.next();

System.out.print("Digite o complemento: ");
String complemento = scanner.next();

System.out.print("Digite o dia da fundação: ");
int diaFundacao = scanner.nextInt();

System.out.print("Digite o mês da fundação: ");
int mesFundacao = scanner.nextInt();

System.out.print("Digite o ano da fundação: ");
int anoFundacao = scanner.nextInt();

Endereco endereco = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, anoFundacao);

System.out.println("\nLoja criada com sucesso!");
System.out.println(loja);

}

private static void criarProduto(Scanner scanner) {
System.out.print("Digite o nome do produto: ");
String nome = scanner.next();

System.out.print("Digite o preço do produto: ");
double preco = scanner.nextDouble();

System.out.print("Digite o dia da validade: ");
int diaValidade = scanner.nextInt();

System.out.print("Digite o mês da validade: ");
int mesValidade = scanner.nextInt();

System.out.print("Digite o ano da validade: ");
int anoValidade = scanner.nextInt();

Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

Produto produto = new Produto(nome, preco, dataValidade);


System.out.println("\nProduto criado com sucesso!");
System.out.println(produto);

if (Produto.estaVencido(dataValidade)) { 
        System.out.println("PRODUTO VENCIDO");
    } else {
        System.out.println("PRODUTO NÃO VENCIDO");
    }
}
} 


    


 