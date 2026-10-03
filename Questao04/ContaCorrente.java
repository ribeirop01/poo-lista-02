package Questao04;

public class ContaCorrente {

    private int numero;
    private String titular;
    private float saldo;

    // O saldo inicial é sempre 0, então o construtor não recebe saldo
    public ContaCorrente(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }
    // Retorna true se o saque foi feito, false se foi recusado
    public boolean sacar(float valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (valor > 10000) {
            System.out.println("Não é permitido sacar mais de R$ 10000 por operação.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }
        saldo -= valor;
        return true;
    }

    // Só aceita valor positivo e que não ultrapasse 10000
    public boolean depositar(float valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser positivo.");
            return false;
        }
        if (valor > 10000) {
            System.out.println("Não é permitido depositar mais de R$ 10000 por operação.");
            return false;
        }
        saldo += valor;
        return true;
    }

    public float consultarSaldo() {
        return saldo;
    }

    // Getter útil para o menu cumprimentar o titular
    public String getTitular() {
        return titular;
    }
}