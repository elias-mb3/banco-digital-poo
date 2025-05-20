package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String id;
    private String nome;
    private List<Conta> contas;

    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }
}
