package mercado;

public class PagamentoDinheiro extends FormaDePagamento{
	public PagamentoDinheiro() {
		super("Dinheiro");
	}

	@Override
	public void processarPagamento(float valor) {
		System.out.println("Processando pagamento de" +valor+"em dinheiro");
	}
	
}
