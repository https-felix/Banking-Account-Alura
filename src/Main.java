public class Main {
    public static void main(String[] args) {
        String nameUser = "Fiona Sherek";
        String conta = "Bancária";
        String tipoConta = "Salário";
        double saldoInicial = 1.500;
        String country = "Brasil";
        String idConta = "09887";




        System.out.println("""
                 Banco ArKar                        V1.00
                 
                 ||||||||||||||||||||||||||||||||||||||||
                 
                               Tela Incial
                 
                 Nome:   Kauan Araújo       ID:     09887
                 Conta:  Bancária           Tipo: Salário
                 SI:     1.500 BRL          País:  Brasil
                 
                 SI é a nova nomeclatura do banco ArKar 
                 para Saldo Inicial, saiba mais sobre
                 essa iniciativa no nosso site!
                 
                 MENU |||||||||||||||||||||||||||||||||||
                 
                 1. Consultar Saldo atual
                 2. Receber Pix
                 3. Enviar Pix
                 4. Indicar para um amigo
                 5. Deslogar
                 
                \s""");
    }
}