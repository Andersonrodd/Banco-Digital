public class Main {
    public static void main(String[] args) {
        // Instancia classe Banco
        Banco banco = new Banco("Banco Exemplo", 1);
        // Cria uma Conta Corrente
        banco.adicionarContaCorrente("Anderson - Corrente", 123);
        // Cria uma Conta Poupança
        banco.adicionarContaPoupanca("Rodrigo - Poupança", 321);
        // Exibe as Contas criadas
        banco.exibirClientes();
        // Realiza depósito na Conta Corrente e em seguida mostra o extrato atualizado
        banco.realizarDeposito(123, 1, 1500);
        banco.mostrarExtrato(123, 1);
        // Realiza transferência da Conta Corrente para Conta Poupança
        // e em seguida mostra o extrato atualizado de ambas as contas
        banco.realizarTransferencia(123, 1, 321, 2, 350);
        banco.mostrarExtrato(123, 1);
        banco.mostrarExtrato(321, 2);
        //Realiza saque da Conta Poupança e em seguida mostra o extrato atualizado
        banco.realizarSaque(321, 2, 250);
        banco.mostrarExtrato(321, 2);

    }
}
