import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nameUser = "Fiona Sherek";
        String conta = "Bancária";
        String tipoConta = "Salário";
        double saldo = 1599.00;
        String country = "Brasil";
        String idConta = "09887";

        System.out.println("\n            ArKar System            ");
        System.out.println("||||||||||||||||||||||||||||||||||||");
        System.out.println("\nNome: " + nameUser + "        ID: " + idConta);
        System.out.println("Tipo: " + conta + "          Tipo: " + tipoConta);
        System.out.println("SI: " + saldo + "               País: " + country);
        System.out.println("""
                \nSI é a nova nomeclatura do banco ArKar 
                para Saldo Inicial, saiba mais sobre
                essa iniciativa no nosso site!
                """);

        String menu = """
                 \n 1. Consultar Saldo atual
                 2. Receber Pix
                 3. Enviar Pix
                 4. Indicar para um amigo
                 5. Deslogar
                """;

        Scanner leituraDados = new Scanner(System.in);
        double pixRecebido = 0;
        double pixEnviado = 0;

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("Menu |||||||||||||||||||||||||||||||");
            System.out.println(menu);
            opcao = leituraDados.nextInt();

            if (opcao == 2) {
                System.out.println("Insira o valor recebido:");
                pixRecebido = leituraDados.nextDouble();
                saldo += pixRecebido;
                System.out.println("O saldo atual é: R$ " + saldo);
            } else if (opcao == 1) {
                System.out.println("O seu saldo atual é de: R$ " + saldo);
            } else if (opcao == 3) {
                System.out.println("O quanto você quer enviar?");
                pixEnviado = leituraDados.nextDouble();
                if (pixEnviado > saldo) {
                    System.out.println("Não é possível transferir! Saldo insuficiente.");
                } else {
                    saldo -= pixEnviado;
                    System.out.println("Pix enviado!");
                    System.out.println("\nSeu saldo atual é de R$ " + saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Use o código 4ZXK_" + idConta + " para indicar o banco para os amigos e ganhar beneficios!");
            } else if (opcao != 5) {
                System.out.println("Opção invalida");
            }

        }
    }
}