package mercado;

public class PagamentoCartao extends FormaDePagamento{
	private String numeroCartao;
	private String validade;
	private String cvv;
	private String nomeTitular;
	
	public PagamentoCartao(String numeroCartao, String validade, String cvv, String nomeTitular) {
		super("Cartão");
		this.numeroCartao = numeroCartao;
		this.validade = validade;
		this.cvv = cvv;
		this.nomeTitular = nomeTitular; 
		
		
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	@Override
	public void processarPagamento(float valor) {
        System.out.println("Processando pagamento de R$" + valor + " com cartão de crédito.");
	}
		
	}

	