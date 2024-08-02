package mercado;

import java.util.HashMap;
import java.util.Map;

public class ControlarCarrinho {
	 private Map<Produto, Integer> carrinho;
	
	 public ControlarCarrinho() {
	        this.carrinho = new HashMap<>();
	    }
	 public void adicionar(Produto produto, int quantidade) {
	        carrinho.put(produto, carrinho.getOrDefault(produto, 0) + quantidade);
	    }

	    public void remover(String nomeProduto, int quantidade) {
			Produto produtoParaRemover = null;
	        for (Produto produto : carrinho.keySet()) {
	            if (produto.getNome().equalsIgnoreCase(nomeProduto)) {
	                int quantidadeAtual = carrinho.get(produto);
	                if (quantidade >= quantidadeAtual) {
	                    carrinho.remove(produto);
	                } else {
	                    carrinho.put(produto, quantidadeAtual - quantidade);
	                }
	                return;
	            }
	            if (produtoParaRemover != null) {
	                carrinho.remove(produtoParaRemover);
	            }
	        }
	    }

	    public void listar() {
	        for (Map.Entry<Produto, Integer> entry : carrinho.entrySet()) {
	            System.out.println(entry.getKey() + " - Quantidade: " + entry.getValue());
	        }
	    }

	    public void finalizarCompra() {
	        float valorTotal = 0;
	        for (Map.Entry<Produto, Integer> entry : carrinho.entrySet()) {
	            valorTotal += entry.getKey().getPreco() * entry.getValue();
	        }
	        System.out.println("Valor Total da Compra: " + valorTotal);
	        carrinho.clear();
	    }
	}
