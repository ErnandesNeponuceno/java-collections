package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item t : itemList) {
                if (t.getNome().equalsIgnoreCase(nome)) {
                    itemsParaRemover.add(t);
                }
            }
            itemList.removeAll(itemsParaRemover);
        } else {
            System.out.println("A lista de items está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
        } else {
            System.out.println("A lista de items está vazia!");
        }
        return valorTotal;
    }

    public static void main(String[] args){
        CarrinhoDeCompras listaItem = new CarrinhoDeCompras();

        listaItem.adicionarItem("Morango", 5.00, 1);
        listaItem.adicionarItem("Maça", 6.00, 5);
        listaItem.adicionarItem("Pera", 4.00, 5);

        listaItem.exibirItens();
        System.out.println("O valor total da compra é: " + listaItem.calcularValorTotal());
    }
}
