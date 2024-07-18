package mercado;

import java.util.ArrayList;
import java.util.List;

public class ControlarNotaFiscal implements Crud<NotaFiscal> {
	 private List<NotaFiscal> notasFiscais;
	 
	 public ControlarNotaFiscal() {
		 this.notasFiscais = new ArrayList<>();
	 }
	@Override
	public void adicionar(NotaFiscal notaFiscal) {
		try {
            notasFiscais.add(notaFiscal);
            System.out.println("Nota Fiscal adicionada!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar Nota Fiscal: " + e.getMessage());
        }
	}
	@Override
	public void deletar(String id) {
		try {
            notasFiscais.removeIf(notaFiscal -> notaFiscal.getId().toString().equalsIgnoreCase(id));
            System.out.println("Nota Fiscal removida!");
        } catch (Exception e) {
            System.out.println("Erro ao remover Nota Fiscal: " + e.getMessage());
        }
	}
	@Override
	public void listar() {
		try {
            for (NotaFiscal notaFiscal : notasFiscais) {
                System.out.println(notaFiscal);
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar Notas Fiscais: " + e.getMessage());
        }
		
	}
	@Override
	public void atualizar(String id, NotaFiscal notaFiscalAtualizada) {
		  try {
	            for (NotaFiscal notaFiscal : notasFiscais) {
	                if (notaFiscal.getId().toString().equalsIgnoreCase(id)) {
	                    notaFiscal.setNumeroDaConta(notaFiscalAtualizada.getNumeroDaConta());
	                    notaFiscal.setDataDeEspedicao(notaFiscalAtualizada.getDataDeEspedicao());
	                    notaFiscal.setValor(notaFiscalAtualizada.getValor());
	                    notaFiscal.setFornecedor(notaFiscalAtualizada.getFornecedor());
	                    System.out.println("Nota Fiscal atualizada!");
	                    return;
	                }
	            }
	            System.out.println("Nota Fiscal não encontrada.");
	        } catch (Exception e) {
	            System.out.println("Erro ao atualizar Nota Fiscal: " + e.getMessage());
	    }
	}
}
