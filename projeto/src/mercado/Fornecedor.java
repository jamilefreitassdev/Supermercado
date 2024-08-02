package mercado;

import java.util.List;

public class Fornecedor {
	    private String id;
	    private String nome;
	    private List<Produto> produtosFornecidos;
	    private String contato;
	    private String cnpj;
	    
		public Fornecedor(String id, String nome, List<Produto> produtosFornecidos, String contato, String cnpj) {
			this.id = id;
			this.nome = nome;
			this.produtosFornecidos = produtosFornecidos;
			this.contato = contato;
			this.cnpj = cnpj;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public List<Produto> getProdutosFornecidos() {
			return produtosFornecidos;
		}

		public void setProdutosFornecidos(List<Produto> produtosFornecidos) {
			this.produtosFornecidos = produtosFornecidos;
		}

		public String getContato() {
			return contato;
		}

		public void setContato(String contato) {
			this.contato = contato;
		}

		public String getCnpj() {
			return cnpj;
		}

		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}

		@Override
		public String toString() {
			return "Fornecedor [id=" + id + ", nome=" + nome + ", produtosFornecidos=" + produtosFornecidos
					+ ", contato=" + contato + ", cnpj=" + cnpj + "]";
		}
}
