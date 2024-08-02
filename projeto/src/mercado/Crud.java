package mercado;

public interface Crud<A> {
    void adicionar(A item);
    void deletar(String id);
    void listar();
    void atualizar(String id, A item);

}
