package br.com.digitalhouse;

public class ContaPoupanca extends Conta {

    //Attributes
    public Float taxaJuros;

    //Constructor
    public ContaPoupanca(Float saldo, Cliente cliente, Float taxaJuros) {
        super(saldo, cliente);
        this.taxaJuros = taxaJuros;
    }

    //Class methods
    @Override
    public void sacarDinheiro(Float quantidade) {
        if (super.saldo > quantidade) {
            super.saldo -= quantidade;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void recolherJuros() {
        super.saldo += super.saldo * 100 / taxaJuros;
    }

}
