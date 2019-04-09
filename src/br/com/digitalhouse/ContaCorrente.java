package br.com.digitalhouse;

public class ContaCorrente extends Conta {

    //Attributes
    private Float limiteChequeEspecial;

    //Constructor
    public ContaCorrente(Float saldo, Cliente cliente, Float limiteChequeEspecial) {
        super(saldo, cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    //Class methods
    @Override
    public void sacarDinheiro(Float quantidade) {
        if (super.saldo > quantidade) {
            super.saldo -= quantidade;
        } else if (super.saldo + this.limiteChequeEspecial > quantidade) {
            super.saldo -= quantidade;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositarCheques(Float valor, String bancoEmissor, String dataPagamento){
        super.saldo += valor;
    }

}
