package mercado;

public class PagamentoPix extends FormaDePagamento {
	private String chavePix;
	
	public PagamentoPix(String chavePix) {
		super("Pix");
		this.chavePix = chavePix;
	}

	@Override
	public void processarPagamento(float valor) {
		System.out.println("Processando pagamento de " +valor+ "em dinheiro");

	}
}
