package com.alldant.produtos;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public boolean temEstoque(int quantidadeDesejada) {
        return quantidade >= quantidadeDesejada;
    }

    public void reduzirEstoque(int quantidadeVendida) {
        quantidade -= quantidadeVendida;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
