package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarProduto implements Crud<Produto> {
	private List<Produto> produtos;
	
	public ControlarProduto() {
		this.produtos = new ArrayList<>();
	}

	@Override
	public void adicionar(Produto produto) { 
		try {
			produtos.add(produto);
			System.out.println("Produto adicionado!");
		}  catch (Exception e) {
         System.out.println("Erro ao adicionar Produto: " + e.getMessage());
		}	
	}

	@Override
	public void deletar(String nome) {
	    try {
            produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
            System.out.println("Produto removido!");
        } catch (Exception e) {
            System.out.println("Erro ao remover Produto: " + e.getMessage());
        }
	}

	@Override
	public void listar() {
        try {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar Produtos: " + e.getMessage());
        }
		
	}

	@Override
	public void atualizar(String nome, Produto produtoAtualizado) {
        try {
            for (Produto produto : produtos) {
                if (produto.getNome().equalsIgnoreCase(nome)) {
                    produto.setPreco(produtoAtualizado.getPreco());
                    produto.setCategoria(produtoAtualizado.getCategoria());
                    produto.setQuantidade(produtoAtualizado.getQuantidade());
                    produto.setMarca(produtoAtualizado.getMarca());
                    System.out.println("Produto atualizado!");
                    return;
                }
            }
            System.out.println("Produto não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Produto: " + e.getMessage());
        }
    }
}
