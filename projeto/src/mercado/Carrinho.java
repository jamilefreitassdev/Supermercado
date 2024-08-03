package mercado;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Carrinho implements Serializable {
    private static final long serialVersionUID = 1L;
	private String id;
	private FormaDePagamento formaDePagamento;
	private List<Produto> produtos;
	
	 public Carrinho(String id) {
		super();
		this.id = id;
		this.produtos = new ArrayList<>();
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public FormaDePagamento getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public List<Produto> getProdutos() {
		return produtos;
	
	}

	@Override
	public String toString() {
		return String.format("Carrinho:\n" +
                "ID: %s\n" +
                "Forma de Pagamento: %s\n" +
                "Produtos: %s",
                id,
                formaDePagamento,
                produtos.isEmpty() ? "Nenhum produto" : produtos);
}
}
