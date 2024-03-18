public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(int numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos getter para obter o número e o titular da conta
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // Método para exibir o saldo atual
    public void exibirSaldo() {
        System.out.println("Número da Conta: " + numero);
        System.out.println("Titular da Conta: " + titular);
        System.out.println("Saldo atual da conta: R$" + saldo);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Exemplo de uso da classe ContaBancaria
        ContaBancaria minhaConta = new ContaBancaria(441034, "Miguel Frederico", 1200.0);

        minhaConta.exibirSaldo(); // Exibir saldo inicial

        minhaConta.depositar(750.0); // Depositar dinheiro
        minhaConta.sacar(325.0);    // Sacar dinheiro
        minhaConta.exibirSaldo();   // Exibir saldo atual
    }

}