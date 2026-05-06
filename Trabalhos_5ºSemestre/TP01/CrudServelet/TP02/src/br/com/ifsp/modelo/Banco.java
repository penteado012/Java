// Matheus Penteado de Barros Pantojo CB3031501

package br.com.ifsp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Produto> listaProdutos = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	public void adiciona(Produto produto) {
		produto.setId(Banco.chaveSequencial++);
		Banco.listaProdutos.add(produto);
	}
	
	public List<Produto> getProdutos(){
		return Banco.listaProdutos;
	}
	
	public Produto buscaProdutoPeloId(Integer id) {
		for (Produto produto : listaProdutos) {
			if(produto.getId().equals(id)) {
				return produto;
			}
		}
		return null;
	}
	
	public void removeProduto(Integer id) {
		listaProdutos.removeIf(p -> p.getId().equals(id));
	}
}
