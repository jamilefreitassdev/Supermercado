package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarCliente implements Crud<Cliente> {
	private List<Cliente> clientes;
	
	public ControlarCliente() {
		this.clientes = new ArrayList<>();
		
	}
	@Override
	public void adicionar(Cliente cliente) {
		 try {
	            clientes.add(cliente);
	            System.out.println("Cliente adicionado!");
	        } catch (Exception e) {
	            System.out.println("Erro ao adicionar cliente: " + e.getMessage());
	        }
	}
	@Override
	public void deletar(String cpf) {
		try {
            clientes.removeIf(cliente -> cliente.getCpf().equalsIgnoreCase(cpf));
            System.out.println("Cliente removido!");
        } catch (Exception e) {
            System.out.println("Erro ao remover cliente: " + e.getMessage());
        }
	}
	@Override
	public void listar() {
		  try {
	            for (Cliente cliente : clientes) {
	                System.out.println(cliente);
	            }
	        } catch (Exception e) {
	            System.out.println("Erro ao listar clientes: " + e.getMessage());
	        }
	}
	@Override
	public void atualizar(String cpf, Cliente clienteAtualizado) {
		try {
            for (Cliente cliente : clientes) {
                if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                    cliente.setEndereco(clienteAtualizado.getEndereco());
                    cliente.setContato(clienteAtualizado.getContato());
                    System.out.println("Cliente atualizado!");
                    return;
                }
            }
            System.out.println("Cliente não encontrado.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar cliente: " + e.getMessage());
        }
    }
}
