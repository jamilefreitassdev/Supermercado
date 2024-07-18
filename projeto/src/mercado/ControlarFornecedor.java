package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarFornecedor implements Crud<Fornecedor> {
	private List<Fornecedor> fornecedores;
	
	public ControlarFornecedor() {
		this.fornecedores = new ArrayList<>();
	}
	@Override
	public void adicionar(Fornecedor fornecedor) {
        try {
            fornecedores.add(fornecedor);
            System.out.println("Fornecedor adicionado!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar Fornecedor: " + e.getMessage());
        }
	}
	@Override
	public void deletar(String cnpj) {
        try {
            fornecedores.removeIf(fornecedor -> fornecedor.getCnpj().equalsIgnoreCase(cnpj));
            System.out.println("Fornecedor removido!");
        } catch (Exception e) {
            System.out.println("Erro ao remover Fornecedor: " + e.getMessage());
        }
	}
	@Override
	public void listar() {
        try {
            for (Fornecedor fornecedor : fornecedores) {
                System.out.println(fornecedor);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar Fornecedores: " + e.getMessage());
        }
	}
	@Override
	public void atualizar(String cnpj, Fornecedor fornecedorAtualizado) {
        try {
            for (Fornecedor fornecedor : fornecedores) {
                if (fornecedor.getCnpj().equalsIgnoreCase(cnpj)) {
                    fornecedor.setNome(fornecedorAtualizado.getNome());
                    fornecedor.setContato(fornecedorAtualizado.getContato());
                    fornecedor.setProdutosFornecidos(fornecedorAtualizado.getProdutosFornecidos());
                    System.out.println("Fornecedor atualizado!");
                    return;
                }
            }
            System.out.println("Fornecedor não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar Fornecedor: " + e.getMessage());
        }
	}
}
