package mercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private List<Produto> produtos;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    private List<Fornecedor> fornecedores;
    private List<NotaFiscal> notasFiscais;
    private List<Carrinho> carrinhoDeCompras;

    public Supermercado() {
        this.produtos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.fornecedores = new ArrayList<>();
        this.notasFiscais = new ArrayList<>();
        this.carrinhoDeCompras = new ArrayList<>();
    }

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public List<NotaFiscal> getNotasFiscais() {
		return notasFiscais;
	}

	public void setNotasFiscais(List<NotaFiscal> notasFiscais) {
		this.notasFiscais = notasFiscais;
	}

	public List<Carrinho> getCarrinhoDeCompras() {
		return carrinhoDeCompras;
	}

	public void setCarrinhoDeCompras(List<Carrinho> carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}
    
    
}
