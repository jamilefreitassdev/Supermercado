package mercado;

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

}	