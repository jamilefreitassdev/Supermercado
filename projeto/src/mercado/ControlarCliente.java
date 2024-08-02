package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarCliente implements Crud<Cliente> {
	private List<Cliente> clientes;
	
	public ControlarCliente() {
		this.clientes = new ArrayList<>();
		
	}
	private static int idCounter = 1;
	 @Override
	    public void adicionar(Cliente cliente) {
	        this.clientes.add(cliente);
	        cliente.setId(String.format("%04d", idCounter++));
	    }

	    @Override
	    public void atualizar(String cpf, Cliente clienteAtualizado) {
	        for (Cliente cliente : clientes) {
	            if (cliente.getCpf().equals(cpf)) {
	                cliente.setNome(clienteAtualizado.getNome());
	                cliente.setEndereco(clienteAtualizado.getEndereco());
	                cliente.setContato(clienteAtualizado.getContato());
	                break;
	            }
	        }
	    }

	    @Override
	    public void deletar(String cpf) {
	        clientes.removeIf(cliente -> cliente.getCpf().equals(cpf));
	    }

	    @Override
	    public void listar() {
	        for (Cliente cliente : clientes) {
	            System.out.println(cliente);
	        }
	    }
	}