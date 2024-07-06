import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Amanda";
        String tipoConta = "Corrente";
        double saldo = 10000.00;
        int opcao = 0;

        System.out.println("*************************************");
        System.out.println("\nNome do cliente:" + nome);
        System.out.println("tipo  de conta" + tipoConta);
        System.out.println("Saldo " + saldo);
        System.out.println("\n*************************************");


        String menu = """

                *** Digite sua Opcao ***
                1 - Consultar de saldo
                2 - Transacao
                3 - Receber
                4 - Sair

                       """;

        Scanner leitura = new Scanner(System.in);
        //usado para interação (perguntas e resposta)

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            //while é um  tipo  de loop, nesta aplicação vai  fazer as perguntas
            //If / Else são  condicionais (caso isso  ou caso aquilo)

            if (opcao == 1) {
                System.out.println("O saldo atualizado é R$" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor voce quer transferir");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= valor;
                    //Irá fazer a subtração  do  valor(a inha acima)
                    System.out.println("Saldo atualizado  R$ " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Valor  recebido");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida");
            }
        }
    }
}
