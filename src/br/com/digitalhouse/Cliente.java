package br.com.digitalhouse;

public class Cliente {

    //Attributes
    private Integer numeroCliente;
    private String sobrenome;
    private String rg;
    private String cpf;

    //Contructors
    public Cliente(Integer numeroCliente, String sobrenome, String rg, String cpf) {
        this.numeroCliente = numeroCliente;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
    }

}
