package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarFuncionario implements Crud<Funcionario> {
	private List<Funcionario> funcionarios;
	
	public ControlarFuncionario() {
		this.funcionarios = new ArrayList<>();
	}

	@Override
	public void adicionar(Funcionario funcionario) {
		 try {
	            funcionarios.add(funcionario);
	            System.out.println("Funcionário adicionado!");
	        } catch (Exception e) {
	            System.out.println("Erro ao adicionar funcionário: " + e.getMessage());
	        }
	}

	@Override
	public void deletar(String cpf) {
		try {
            funcionarios.removeIf(funcionario -> funcionario.getCpf().equalsIgnoreCase(cpf));
            System.out.println("Funcionário removido!");
        } catch (Exception e) {
            System.out.println("Erro ao remover funcionário: " + e.getMessage());
        }
	}
	@Override
	public void listar() {
		try {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar funcionários: " + e.getMessage());
        }
	}
	@Override
	public void atualizar(String cpf, Funcionario funcionarioAtualizado) {
		try {
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getCpf().equalsIgnoreCase(cpf)) {
                    funcionario.setSalario(funcionarioAtualizado.getSalario());
                    funcionario.setCargo(funcionarioAtualizado.getCargo());
                    funcionario.setHorasTrabalhadas(funcionarioAtualizado.getHorasTrabalhadas());
                    System.out.println("Funcionário atualizado!");
                    return;
                }
            }
            System.out.println("Funcionário não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar funcionário: " + e.getMessage());
        }
	}
} 
