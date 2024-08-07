package mercado;

import java.io.Serializable;

public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
	 	private String id;
	    private String codigoDeBarra;
	    private String nome;
	    private float preco;
	    private String categoria;
	    private int quantidade;
	    private String marca;
	    
		public Produto(String id, String codigoDeBarra, String nome, float preco, String categoria, int quantidade,
				String marca) {
			this.id = id;
			this.codigoDeBarra = codigoDeBarra;
			this.nome = nome;
			this.preco = preco;
			this.categoria = categoria;
			this.quantidade = quantidade;
			this.marca = marca;
			
		}

		public 	String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCodigoDeBarra() {
			return codigoDeBarra;
		}

		public void setCodigoDeBarra(String codigoDeBarra) {
			this.codigoDeBarra = codigoDeBarra;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public float getPreco() {
			return preco;
		}

		public void setPreco(float preco) {
			this.preco = preco;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public int getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		@Override
		public String toString() {
			return String.format("Produto:\n" +
                    "ID: %s\n" +
                    "Código de Barra: %s\n" +
                    "Nome: %s\n" +
                    "Preço: R$ %.2f\n" +
                    "Categoria: %s\n" +
                    "Quantidade: %d\n" +
                    "Marca: %s",
                    id,
                    codigoDeBarra,
                    nome,
                    preco,
                    categoria,
                    quantidade,
                    marca);}
	    
	    
}
