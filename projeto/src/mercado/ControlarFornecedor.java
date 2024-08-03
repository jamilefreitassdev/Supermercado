package mercado;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
    // Método para serializar a lista de fornecedores
    public void serializarFornecedores(String nomeArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(fornecedores);
            System.out.println("Fornecedores serializados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para desserializar a lista de fornecedores
    @SuppressWarnings("unchecked")
	public void desserializarFornecedores(String nomeArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            fornecedores = (List<Fornecedor>) ois.readObject();
            System.out.println("Fornecedores desserializados com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}