package mercado;

public interface Crud<A> {
    void adicionar(A item);
    void deletar(String identificador);
    void listar();
    void atualizar(String identificador, A item);

}
