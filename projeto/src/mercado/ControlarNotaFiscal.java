package mercado;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		 // Método para serializar a lista de notas fiscais
	    public void serializarNotasFiscais(String nomeArquivo) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
	            oos.writeObject(notasFiscais);
	            System.out.println("Notas fiscais serializadas com sucesso!");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    // Método para desserializar a lista de notas fiscais
	    @SuppressWarnings("unchecked")
		public void desserializarNotasFiscais(String nomeArquivo) {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
	            notasFiscais = (List<NotaFiscal>) ois.readObject();
	            System.out.println("Notas fiscais desserializadas com sucesso!");
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	}
}
