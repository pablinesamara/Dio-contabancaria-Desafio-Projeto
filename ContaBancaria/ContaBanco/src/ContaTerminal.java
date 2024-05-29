import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) {
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        float saldo = 0.0f;

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Saldo");
            System.out.println("3 - Saque");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar conta");
                    System.out.println("Digite o nome do cliente: ");
                    nomeCliente = sc.nextLine();
                    System.out.println("Digite a agencia: ");
                    agencia = sc.nextLine();
                    System.out.println("Digite o numero da conta: ");
                    numero = sc.nextInt();
                    System.out.println("Digite o valor a depositar:");
                    saldo = sc.nextFloat();
                    sc.nextLine(); // Limpa o buffer do teclado após ler um float
                    break;
                case 2:
                    System.out.println("Saldo: " + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor do Saque:");
                    float valorSaque = sc.nextFloat();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    System.out.println(nomeCliente+"Saldo atual: " + saldo);
                    sc.nextLine(); // Limpa o buffer do teclado após ler um float
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
