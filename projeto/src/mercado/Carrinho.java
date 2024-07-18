package mercado;

import java.util.List;

public class Carrinho {
	private Long id;
	private String formaDePagamento;
	private List<Produto> quantidade;
	
	public Carrinho(Long id, String formaDePagamento, List<Produto> quantidade) {
		this.id = id;
		this.formaDePagamento = formaDePagamento;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public List<Produto> getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(List<Produto> quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Carrinho [id=" + id + ", formaDePagamento=" + formaDePagamento + ", quantidade=" + quantidade + "]";
	}
}
