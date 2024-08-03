package mercado;

import java.io.Serializable;

public class NotaFiscal implements Serializable {
    private static final long serialVersionUID = 1L;
	 private String id;
	    private String numeroDaConta;
	    private String data;
	    private float valor;
	    private String fornecedorCpf;
	    private String detalhes;
    
	
   
	public NotaFiscal(String id, String numeroDaConta, String data, float valor, String fornecedorCpf,
				String detalhes) {
			super();
			this.id = id;
			this.numeroDaConta = numeroDaConta;
			this.data = data;
			this.valor = valor;
			this.fornecedorCpf = fornecedorCpf;
			this.detalhes = detalhes;
		}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getFornecedorCpf() {
		return fornecedorCpf;
	}
	public void setFornecedorCpf(String fornecedorCpf) {
		this.fornecedorCpf = fornecedorCpf;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	@Override
	public String toString() {
		return String.format("Nota Fiscal:\n" +
                "ID: %s\n" +
                "Número da Conta: %s\n" +
                "Data: %s\n" +
                "Valor: R$ %.2f\n" +
                "Fornecedor CPF: %s\n" +
                "Detalhes: %s",
                id, 
                numeroDaConta.isEmpty() ? "Não especificado" : numeroDaConta,
                data == null ? "Não especificado" : data,
                valor,
                fornecedorCpf,
                detalhes);
}
	
}