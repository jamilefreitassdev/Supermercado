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

	@Override
	public void processarPagamento(float valor) {
        System.out.println("Processando pagamento de R$" + valor + " com cartão de crédito.");
	}
		
	}

	