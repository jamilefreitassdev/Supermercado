package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarProduto implements Crud<Produto> {
	private List<Produto> produtos;
	
	public ControlarProduto() {
		this.produtos = new ArrayList<>();
	}
	 private static int idCounter = 1;
	@Override
	public void adicionar(Produto produto) { 
		 produto.setId(String.format("%04d", idCounter++));
	        produtos.add(produto);
		}
	@Override
	public void deletar(String id) {
            produtos.removeIf(produto -> produto.getId().equals(id));
        }

	@Override
	public void listar() {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
		}
            

	@Override
	public void atualizar(String nome, Produto produtoAtualizado) {
		 for (Produto produto : produtos) {
	            if (produto.getNome().equals(nome)) {
	                produto.setPreco(produtoAtualizado.getPreco());
	                produto.setCategoria(produtoAtualizado.getCategoria());
	                produto.setQuantidade(produtoAtualizado.getQuantidade());
	                produto.setMarca(produtoAtualizado.getMarca());
	                return;
	            }
		 }
	        System.out.println("Produto não encontrado.");
	    }
	


	public Produto buscar(String id) {
	    for (Produto produto : produtos) {
	      
			if (produto.getId().equalsIgnoreCase(id)) {
	            return produto;
	        }
	    }
		return null;
	}
}

	   
