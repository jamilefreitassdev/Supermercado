package mercado;

public class NotaFiscal {
    private Long id;
    private String numeroDaConta;
    private String dataDeEspedicao;
    private float valor;
    private Fornecedor fornecedor;
    
	public NotaFiscal(Long id, String numeroDaConta, String dataDeEspedicao, float valor, Fornecedor fornecedor) {
		this.id = id;
		this.numeroDaConta = numeroDaConta;
		this.dataDeEspedicao = dataDeEspedicao;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getDataDeEspedicao() {
		return dataDeEspedicao;
	}

	public void setDataDeEspedicao(String dataDeEspedicao) {
		this.dataDeEspedicao = dataDeEspedicao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return "NotaFiscal [id=" + id + ", numeroDaConta=" + numeroDaConta + ", dataDeEspedicao=" + dataDeEspedicao
				+ ", valor=" + valor + ", fornecedor=" + fornecedor + "]";
	}
    
   
}
