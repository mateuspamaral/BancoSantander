package br.com.digitalhouse;

public abstract class Conta {

    //Attribute
    protected Float saldo;
    protected Cliente cliente;

    //Constructor
    public Conta(Float saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //Class methods
    public void depositarDinheiro(Float quantidade) {
        this.saldo = quantidade;
    }

    public abstract void sacarDinheiro(Float quantidade);

    public Float consultar() {
        return this.saldo;
    }

}
