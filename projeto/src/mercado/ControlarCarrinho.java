package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarCarrinho implements Crud<Carrinho>{
private List<Carrinho> carrinhoDeCompras;
	
	public ControlarCarrinho() {
		this.carrinhoDeCompras = new ArrayList<>();
	
	}

	@Override
	public void adicionar(Carrinho carrinho) {
		 try {
	            carrinhoDeCompras.add(carrinho);
	            System.out.println(" adicionado!");
	        } catch (Exception e) {
	            System.out.println("Erro ao adicionar funcionário: " + e.getMessage());
	        }
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(String identificador, Carrinho item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(String identificador) {
		// TODO Auto-generated method stub
		
	}
}
