package com.alldant.app;

import com.alldant.produtos.Produto;
import com.alldant.vendas.Venda;

public class App {

    public static void main(String[] args) {

        Produto produto = new Produto("Iphone 25 Pro Plus Max Premium", 9500.00, 5);

        int quantidadeVendida = 3;
        int estoqueAntes = produto.getQuantidade();

        Venda venda = new Venda(produto, quantidadeVendida);

        boolean vendaRealizada = venda.conferirEstoque();

        venda.resumo(estoqueAntes);
    }
}
