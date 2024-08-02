package mercado;

abstract class FormaDePagamento {
	private String tipo;
	
	public FormaDePagamento(String tipo) {
		this.tipo = tipo;
	}
		public String getTipo() {
			return tipo;
	}
	public abstract void processarPagamento(float valor);
}
