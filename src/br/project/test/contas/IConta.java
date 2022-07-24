package br.project.test.contas;

import br.project.test.transferencias.TranferenciaType;

//ngm pode dar um new, ou instanciar uma interface
public interface IConta {

    void sacar(double valor);
    void depositar(double valor);

    void transferir(IConta contadestino, double valor, TranferenciaType tranferenciaType);

    void imprimirExtrato(String message);
}
