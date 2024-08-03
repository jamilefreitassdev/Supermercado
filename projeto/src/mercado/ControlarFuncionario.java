package mercado;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ControlarFuncionario implements Crud<Funcionario> {
	private List<Funcionario> funcionarios;
	
	public ControlarFuncionario() {
		this.funcionarios = new ArrayList<>();
	}
	private static int idCounter = 1;
	@Override
	public void adicionar(Funcionario funcionario) {
		funcionario.setId(String.format("%04d", idCounter++));
		this.funcionarios.add(funcionario);
		
	}

	@Override
	public void deletar(String id) {
		 funcionarios.removeIf(funcionario -> funcionario.getId().equals(id));
		
	}

	@Override
	public void listar() {
		for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
		
	}

	@Override
	public void atualizar(String id, Funcionario funcionarioAtualizado) {
		for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                funcionario.setNome(funcionarioAtualizado.getNome());
                funcionario.setCargo(funcionarioAtualizado.getCargo());
                funcionario.setSalario(funcionarioAtualizado.getSalario());
                funcionario.setCpf(funcionarioAtualizado.getCpf());
                funcionario.setHorasTrabalhadas(funcionarioAtualizado.getHorasTrabalhadas());
                break;
            }
		}
	}	
	   // Método para serializar a lista de funcionários
    public void serializarFuncionarios(String nomeArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(funcionarios);
            System.out.println("Funcionários serializados com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para desserializar a lista de funcionários
    @SuppressWarnings("unchecked")
	public void desserializarFuncionarios(String nomeArquivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            funcionarios = (List<Funcionario>) ois.readObject();
            System.out.println("Funcionários desserializados com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}	

