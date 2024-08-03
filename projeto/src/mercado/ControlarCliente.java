package mercado;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

        // Método para serializar a lista de clientes
        public void serializarClientes(String nomeArquivo) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
                oos.writeObject(clientes);
                System.out.println("Clientes serializados com sucesso!");
            } catch (IOException e) {
                e.printStackTrace();
            }
}


        // Método para desserializar a lista de clientes
        @SuppressWarnings("unchecked")
		public void desserializarClientes(String nomeArquivo) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
                clientes = (List<Cliente>) ois.readObject();
                System.out.println("Clientes desserializados com sucesso!");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
}