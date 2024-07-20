package mercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private List<Produto> produtos;
    private List<Funcionario> funcionarios;
    private List<Cliente> clientes;
    private List<Fornecedor> fornecedores;

    public Supermercado() {
        this.produtos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.fornecedores = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        produtos.removeIf(produto -> produto.getNome().equalsIgnoreCase(nome));
    }

    public void listarProduto() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void atualizarProduto(String nome, float novoPreco, String novaCategoria,
                                 int novaQuantidade, String novaMarca) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                produto.setPreco(novoPreco);
                produto.setCategoria(novaCategoria);
                produto.setQuantidade(novaQuantidade);
                produto.setMarca(novaMarca);
                System.out.println("Produto atualizado!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String cpf) {
        funcionarios.removeIf(funcionario -> funcionario.getCpf().equalsIgnoreCase(cpf));
    }

    public void listarFuncionario() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public void atualizarFuncionario(String cpf, float novoSalario, String novoCargo, int novaQntDeHorasTrabalhadas) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equalsIgnoreCase(cpf)) {
                funcionario.setSalario(novoSalario);
                funcionario.setCargo(novoCargo);
                funcionario.setHorasTrabalhadas(novaQntDeHorasTrabalhadas);
                System.out.println("Funcionário atualizado!");
                return;
            }
        }
        System.out.println("Funcionário não encontrado,");
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(String cpf) {
        clientes.removeIf(cliente -> cliente.getCpf().equalsIgnoreCase(cpf));
    }

    public void listarCliente() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void atualizarCliente(String cpf, String endereco, String contato) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                cliente.setEndereco(endereco);
                cliente.setContato(contato);
                System.out.println("Cliente atualizado!");
                return;
            }
        }
        System.out.println("Cliente não encontrado!");
    }

    public void adicionarFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void removerFornecedor(String cnpj) {
        fornecedores.removeIf(fornecedor -> fornecedor.getCnpj().equalsIgnoreCase(cnpj));
    }

    public void listarFornecedor() {
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println(fornecedor);
        }
    }

    public void atualizarFornecedor(String cnpj, String nome, String contato,List<Produto> produtoFornecido) {
    
    for (Fornecedor fornecedor : fornecedores) {
        if (fornecedor.getCnpj().equalsIgnoreCase(cnpj)) {
            fornecedor.setContato(contato);
            fornecedor.setProdutosFornecidos(produtoFornecido);
            System.out.println("Fornecedor atualizado!");
            return;
        }
    }
    System.out.println("Fornecedor não encontrado!");
}
}
