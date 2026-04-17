package com.alldant.vendas;

import com.alldant.produtos.Produto;

public class Venda {

    private Produto produto;
    private int quantidade;
    private double valorTotal;

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public boolean conferirEstoque() {
        if (!produto.temEstoque(quantidade)) {
            return false;
        }

        produto.reduzirEstoque(quantidade);
        valorTotal = produto.getPreco() * quantidade;

        return true;
    }

    public void resumo(int estoqueAntes) {
        System.out.println("Produto: " + produto.getNome());
        System.out.printf("Preco: R$ %.2f\n", produto.getPreco());
        System.out.println("Estoque antes da venda: " + estoqueAntes + " unidades");

        if (valorTotal == 0) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            System.out.println("Venda realizada: " + quantidade + " unidades");
            System.out.println("Estoque atualizado: " + produto.getQuantidade() + " unidades");
        }
    }
}
