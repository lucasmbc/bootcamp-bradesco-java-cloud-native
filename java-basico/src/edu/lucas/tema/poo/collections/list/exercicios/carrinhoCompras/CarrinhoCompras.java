package edu.lucas.tema.poo.collections.list.exercicios.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Item> itemList;

	public CarrinhoCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.itemList.add(item);
	}
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		if(!itemList.isEmpty()) {
			for (Item i : itemList) {
				if(i.getNome().equalsIgnoreCase(nome)) {
					itemParaRemover.add(i);
				}
			}
			itemList.removeAll(itemParaRemover);			
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public double calcularValorTotal() {
		double total = 0;
		if(!itemList.isEmpty()) {
			for (Item i : itemList) {
				total += i.getPreco() * i.getQuantidade();
			}
			
			return total;			
		} else {
			throw new RuntimeException("A lista está vazia!");
		}
	}
	
	public void exibirItens() {
		if(!itemList.isEmpty()) {
			System.out.println(this.itemList);			
		} else {
			System.out.println("A lista está vazia!");
		}
	}

	@Override
	public String toString() {
		return "CarrinhoDeCompras{" + 
			"itens=" + itemList + 
			"}";
	}
	
	
}
