package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarNotaFiscal implements Crud<NotaFiscal> {
	 private List<NotaFiscal> notasFiscais;
	 
	 public ControlarNotaFiscal() {
		 this.notasFiscais = new ArrayList<>();
	 }
	 private static int idCounter = 1;
	    @Override
	    public void adicionar(NotaFiscal notaFiscal) {
	        this.notasFiscais.add(notaFiscal);
	        notaFiscal.setId(String.format("%04d", idCounter++));
	        }

	    @Override
	    public void listar() {
	        for (NotaFiscal notaFiscal : notasFiscais) {
	            System.out.println(notaFiscal);
	        }
	    }

	    public NotaFiscal buscarNotaFiscalPorId(String id) {
	        for (NotaFiscal notaFiscal : notasFiscais) {
	            if (notaFiscal.getId().equals(id)) {
	                return notaFiscal;
	            }
	        }
	        return null;
			
		}
		@Override
		public void deletar(String id) {	
		}
		@Override
		public void atualizar(String id, NotaFiscal item) {
			
		}
	}
