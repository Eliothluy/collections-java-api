package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Item> comprasList;
	
	public CarrinhoDeCompras() {
		this.comprasList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		comprasList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item t : comprasList) {
			if(t.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(t);
			}
		}
		comprasList.removeAll(itensParaRemover);
	}
	
	public double calcularValorTotal() {
		double valorTotal =0;
		for(Item t : comprasList) {
			valorTotal = valorTotal + (t.getPreco()*t.getQuantidade());
		}
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(comprasList);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("Feijão", 5.00, 2);
		carrinhoDeCompras.adicionarItem("Arroz", 3.50, 2);
		carrinhoDeCompras.adicionarItem("Mortadela", 3.50, 1);
		carrinhoDeCompras.removerItem("Mortadela");
		System.out.println(carrinhoDeCompras.calcularValorTotal());
		carrinhoDeCompras.exibirItens();
	}
	
}
