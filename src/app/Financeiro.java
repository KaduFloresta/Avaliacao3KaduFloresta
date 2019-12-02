package app;

import java.sql.Connection;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JTextField;

public class Financeiro {
    private static Map<Integer, Pessoas> pessoas2;

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        Connection connection = new ConnectionX().getConnection();

        System.out.println("...:::[FINANCEIRO]:::...");
        System.out.println("Escolha a Opção: ");
        int opcao = 0;
        do {
            imprimirOpcoes();
            opcao = entrada.nextInt();
            switch (opcao) {
            case 1:
                // cadastrarPessoas(entrada, pessoas);
                break;
            case 2:
                // consultarPessoas(entrada, funcionarios);
                break;
            case 3:
                System.out.println("Até a Pŕoxima!");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
            }

        } while (opcao != 3);

        entrada.close();
    }

    private static void imprimirOpcoes() {
        System.out.println("Escolha a Opção: ");
        System.out.println("1 >>> Cadastrar Cliente");
        System.out.println("2 >>> Consultar Conta");
        System.out.println("3 >>> Sair");
    }

    private static void cadastrarPessoas(Scanner entrada, Map<Integer, Pessoas> pessoas) {
        Pessoas pessoa = new Pessoas();

        System.out.println("Digite o ID: ");       
        System.out.println("Digite o Nome: ");        
        System.out.println("Digite o Email: ");        
        System.out.println("Digite o Mês: ");        
        System.out.println("Digite o Ano: ");
        System.out.println("Digite o Valor: ");
        System.out.println("Digite o Desconto: ");
        

        pessoas.put(pessoas.size(), pessoa);
    }
}