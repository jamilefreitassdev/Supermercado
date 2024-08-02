package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarFornecedor implements Crud<Fornecedor> {
	private List<Fornecedor> fornecedores;
	
	public ControlarFornecedor() {
		this.fornecedores = new ArrayList<>();
	}
	private static int idCounter = 1;
    @Override
    public void adicionar(Fornecedor fornecedor) {
        this.fornecedores.add(fornecedor);
        fornecedor.setId(String.format("%04d", idCounter++));
    }

    @Override
    public void atualizar(String id, Fornecedor fornecedorAtualizado) {
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getId().equals(id)) {
                fornecedor.setNome(fornecedorAtualizado.getNome());
                fornecedor.setProdutosFornecidos(fornecedorAtualizado.getProdutosFornecidos());
                fornecedor.setContato(fornecedorAtualizado.getContato());
                fornecedor.setCnpj(fornecedorAtualizado.getCnpj());
                break;
            }
        }
    }

    @Override
    public void deletar(String id) {
        fornecedores.removeIf(fornecedor -> fornecedor.getId().equals(id));
    }

    @Override
    public void listar() {
        for (Fornecedor fornecedor : fornecedores) {
            System.out.println(fornecedor);
        }
    }

    public Fornecedor buscarFornecedorPorId(String id) {
        for (Fornecedor fornecedor : fornecedores) {
            if (fornecedor.getId().equals(id)) {
                return fornecedor;
            }
        }
        return null;
    }
}