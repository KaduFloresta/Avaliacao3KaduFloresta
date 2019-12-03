package app;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Financeiro {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, Pessoas> pessoas = new HashMap<>();
        Map<Integer, Proventos> proventos = new HashMap<>();
        Map<Integer, Dividas> dividas = new HashMap<>();

        Connection connection = new ConnectionX().getConnection();

        System.out.println("...:::[FINANCEIRO]:::...");
        System.out.println("Escolha a Opção: ");
        int opcao = 0;
        do {
            imprimirOpcoes();
            opcao = scanner.nextInt();
            switch (opcao) {
            case 1:
                cadastrarPessoas(scanner, pessoas);
                break;
            case 2:
                cadastrarProventos(scanner, proventos);
                break;
            case 3:
                cadastrarDividas(scanner, dividas);
                break;
            case 4:
                // consultarConta(scanner, contas);
                break;
            case 5:
                System.out.println("OBRIGADO!");
                break;
            default:
                System.out.println("OÇÃO INVÁLIDA!");
                break;
            }

        } while (opcao != 3);

        scanner.close();
    }

    private static void imprimirOpcoes() {
        System.out.println("Escolha a Opção: ");
        System.out.println("1 >>> Cadastrar Cliente");
        System.out.println("2 >>> Cadastrar Proventos");
        System.out.println("3 >>> Cadastrar Dividas");
        System.out.println("4 >>> Consultar Conta");
        System.out.println("5 >>> Sair");
    }

    private static void cadastrarPessoas(Scanner scanner, Map<Integer, Pessoas> pessoas) {

        System.out.println("Digite o Nome: ");
        String nome = scanner.next();
        System.out.println("Digite o Email: ");
        String email = scanner.next();
        Pessoas pessoa = new Pessoas(nome, email);
    }

    private static void cadastrarProventos(Scanner scanner, Map<Integer, Proventos> proventos) {

        System.out.println("Digite o Mes: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o Ano: ");
        int ano = scanner.nextInt();
        System.out.println("Digite o Valor: ");
        double valor = scanner.nextDouble();
        System.out.println("Digite o Imposto: ");
        double imposto = scanner.nextDouble();
        Proventos provento = new Proventos(mes, ano, valor, imposto);
    }

    private static void cadastrarDividas(Scanner scanner, Map<Integer, Dividas> dividas) {

        System.out.println("Digite o Mes: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o Ano: ");
        int ano = scanner.nextInt();
        System.out.println("Digite o Valor: ");
        double valor = scanner.nextDouble();
        System.out.println("Digite o % do Imposto: ");
        double percDesconto = scanner.nextDouble();
		Dividas divida = new Dividas(mes, ano, ano, valor, percDesconto);
    }
    // private static void consultarConta(Map<Integer,Pessoas> pessoas, Scanner scanner){
    //     Pessoas pessoa = (Pessoas) retornaObjeto(pessoas, "Digite o código do cliente: ", scanner);
    //     pessoa.consultarConta();
    // }

}