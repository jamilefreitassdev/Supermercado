package mercado;

public class NotaFiscal {
    private Long id;
    private String numeroDaConta;
    private String dataDeExpedicao;
    private float valor;
    private Fornecedor fornecedor;
    
	public NotaFiscal(Long id, String numeroDaConta, String dataDeExpedicao, float valor, Fornecedor fornecedor) {
		this.id = id;
		this.numeroDaConta = numeroDaConta;
		this.dataDeExpedicao = dataDeExpedicao;
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

	public String getDataDeExpedicao() {
		return dataDeExpedicao;
	}

	public void setDataDeExpedicao(String dataDeExpedicao) {
		this.dataDeExpedicao = dataDeExpedicao;
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
		return "NotaFiscal [id=" + id + ", numeroDaConta=" + numeroDaConta + ", dataDeExpedicao=" + dataDeExpedicao
				+ ", valor=" + valor + ", fornecedor=" + fornecedor + "]";
	}
	
}