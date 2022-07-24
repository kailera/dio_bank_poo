package br.project.test.contas;

import br.project.test.transferencias.TranferenciaType;

public class Conta implements IConta  {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo +=valor;
    }

    @Override
    public void transferir(IConta contadestino, double valor, TranferenciaType tranferenciaType) {
        if (this.saldo < (valor + tranferenciaType.getTaxa())){
            this.sacar(valor);
            this.saldo -= tranferenciaType.getTaxa();
            contadestino.depositar(valor);
        }else{
            imprimirExtrato("Sem saldo para realizar essa operação");
        }

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void imprimirExtrato(String message) {
        System.out.println("Agência:"  + this.agencia);
        System.out.println("Conta:"  + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Mensagem: " + message);

    }
}
