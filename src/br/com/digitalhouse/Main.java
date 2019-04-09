package br.com.digitalhouse;

public class Main {
    public static void main(String[] args) {

        //Instanciando
        Cliente mateus = new Cliente(321,"Amaral","MG11.769.803","088.468.166-17");
        ContaCorrente mateusCC = new ContaCorrente(0.00f ,mateus,3000.00f);
        ContaPoupanca mateusCP = new ContaPoupanca(0.00f,mateus,6.00f);

        mateusCC.depositarDinheiro(500.45f);
        System.out.println(mateusCC.consultar());

    }
}
