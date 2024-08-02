package mercado;

public class Cliente {
	private String id;
    private String nome;
    private String endereco;
    private String contato;
    private String cpf;
    
	public Cliente(String id, String nome, String endereco, String contato, String cpf) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
		this.cpf = cpf;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", contato=" + contato + ", cpf="
				+ cpf + "]";
	}
}
