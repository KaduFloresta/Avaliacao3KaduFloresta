package app;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Financeiro {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Connection connection = new ConnectionX().getConnection();

        System.out.println("...:::[FINANCEIRO]:::...");
        System.out.println("Escolha a Opção: ");
        int opcao = 0;
        do {
            imprimirOpcoes();
            opcao = scanner.nextInt();
            switch (opcao) {
            case 1:
                cadastrarPessoas(scanner);
                break;
            case 2:
                cadastrarProventos(scanner);
                break;
            case 3:
                cadastrarDividas(scanner);
                break;
            case 4:
                consultarPessoas(scanner);
                break;
            case 5:
                consultarDividas(scanner);
                break;
            case 6:
                // consultarProventos(scanner);
                break;
            case 7:
                System.out.println("OBRIGADO!");
                break;
            default:
                System.out.println("OÇÃO INVÁLIDA!");
                break;
            }

        } while (opcao != 7);

        scanner.close();
    }

    private static void imprimirOpcoes() {
        System.out.println("Escolha a Opção: ");
        System.out.println("1 >>> Cadastrar Pessoa");
        System.out.println("2 >>> Cadastrar Proventos");
        System.out.println("3 >>> Cadastrar Dividas");
        System.out.println("4 >>> Consultar Pessoas");
        System.out.println("4 >>> Consultar Proventos");
        System.out.println("4 >>> Consultar Dividas");
        System.out.println("5 >>> Sair");
    }

    private static void cadastrarPessoas(Scanner scanner) {

        System.out.println("Digite o Nome: ");
        String nome = scanner.next();
        System.out.println("Digite o Email: ");
        String email = scanner.next();
        Pessoas pessoa = new Pessoas(nome, email);
    }

    private static void cadastrarProventos(Scanner scanner) {
        System.out.println("Digite o Id da Pessoa: ");
        int idPessoa = scanner.nextInt();
        Pessoas pessoa = Pessoas.getPessoa(idPessoa);
        System.out.println("Digite o Mes: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o Ano: ");
        int ano = scanner.nextInt();
        System.out.println("Digite o Valor: ");
        double valor = scanner.nextDouble();
        System.out.println("Digite o Imposto: ");
        double imposto = scanner.nextDouble();
        new Proventos(mes, ano, valor, pessoa, imposto);
    }

    private static void cadastrarDividas(Scanner scanner) {

        System.out.println("Digite o Mes: ");
        int mes = scanner.nextInt();
        System.out.println("Digite o Ano: ");
        int ano = scanner.nextInt();
        System.out.println("Digite o Valor: ");
        double valor = scanner.nextDouble();
        System.out.println("Digite o % do Imposto: ");
        double percDesconto = scanner.nextDouble();
        //Dividas divida = new Dividas(mes, ano, ano, valor, percDesconto);
    }

    private static void consultarPessoas(Scanner scanner) {
        Pessoas.getPessoas();
    }

    private static void consultarDividas(Scanner scanner) {
        System.out.println("Digite o Id da Pessoa: ");
        int idPessoa = scanner.nextInt();
        Dividas.getDividas(idPessoa);
    }

}