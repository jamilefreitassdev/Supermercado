package mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	 	ControlarProduto controlarProduto = new ControlarProduto();
        ControlarFuncionario controlarFuncionario = new ControlarFuncionario();
        ControlarCliente controlarCliente = new ControlarCliente();
        ControlarFornecedor controlarFornecedor = new ControlarFornecedor();
        ControlarNotaFiscal controlarNotaFiscal = new ControlarNotaFiscal();

        while (true) {
            System.out.println("1. Gerenciar Produtos");
            System.out.println("2. Gerenciar Funcionários");
            System.out.println("3. Gerenciar Clientes");
            System.out.println("4. Gerenciar Fornecedores");
            System.out.println("5. Gerenciar Notas Fiscais");
            System.out.println("6. Sair");

            int opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 6) {
                break;
            }

            switch (opcao) {
                case 1:
                    gerenciarProdutos(sc, controlarProduto);
                    break;
                case 2:
                    gerenciarFuncionarios(sc, controlarFuncionario);
                    break;
                case 3:
                    gerenciarClientes(sc, controlarCliente);
                    break;
                case 4:
                    gerenciarFornecedores(sc, controlarFornecedor);
                    break;
                case 5:
                    gerenciarNotasFiscais(sc, controlarNotaFiscal);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        sc.close();
    }

    private static void gerenciarProdutos(Scanner sc, ControlarProduto controller) {
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Atualizar Produto");
        System.out.println("3. Deletar Produto");
        System.out.println("4. Listar Produtos");

        int opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Digite o ID:");
                Long id = Long.parseLong(sc.nextLine());
                System.out.println("Digite o Código de Barra:");
                String codigoDeBarra = sc.nextLine();
                System.out.println("Digite o Nome:");
                String nome = sc.nextLine();
                System.out.println("Digite o Preço:");
                float preco = Float.parseFloat(sc.nextLine());
                System.out.println("Digite a Categoria:");
                String categoria = sc.nextLine();
                System.out.println("Digite a Quantidade:");
                int quantidade = Integer.parseInt(sc.nextLine());
                System.out.println("Digite a Marca:");
                String marca = sc.nextLine();

                Produto produto = new Produto(id, codigoDeBarra, nome, preco, categoria, quantidade, marca);
                controller.adicionar(produto);
                break;
            case 2:
                System.out.println("Digite o Nome do Produto a ser atualizado:");
                String nomeParaAtualizar = sc.nextLine();

                System.out.println("Digite o Preço:");
                float novoPreco = Float.parseFloat(sc.nextLine());
                System.out.println("Digite a Categoria:");
                String novaCategoria = sc.nextLine();
                System.out.println("Digite a Quantidade:");
                int novaQuantidade = Integer.parseInt(sc.nextLine());
                System.out.println("Digite a Marca:");
                String novaMarca = sc.nextLine();

                Produto produtoAtualizado = new Produto(null, null, nomeParaAtualizar, novoPreco, novaCategoria, novaQuantidade, novaMarca);
                controller.atualizar(nomeParaAtualizar, produtoAtualizado);
                break;
            case 3:
                System.out.println("Digite o Nome do Produto a ser deletado:");
                String nomeParaDeletar = sc.nextLine();
                controller.deletar(nomeParaDeletar);
                break;
            case 4:
                controller.listar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void gerenciarFuncionarios(Scanner sc, ControlarFuncionario controller) {
        System.out.println("1. Adicionar Funcionário");
        System.out.println("2. Atualizar Funcionário");
        System.out.println("3. Deletar Funcionário");
        System.out.println("4. Listar Funcionários");

        int opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Digite o Nome:");
                String nome = sc.nextLine();
                System.out.println("Digite o Cargo:");
                String cargo = sc.nextLine();
                System.out.println("Digite o Salário:");
                float salario = Float.parseFloat(sc.nextLine());
                System.out.println("Digite o CPF:");
                String cpf = sc.nextLine();
                System.out.println("Digite as Horas Trabalhadas:");
                int horasTrabalhadas = Integer.parseInt(sc.nextLine());

                Funcionario funcionario = new Funcionario(null, nome, cargo, salario, cpf, horasTrabalhadas);
                controller.adicionar(funcionario);
                break;
            case 2:
                System.out.println("Digite o CPF do Funcionário a ser atualizado:");
                String cpfParaAtualizar = sc.nextLine();

                System.out.println("Digite o Salário:");
                float novoSalario = Float.parseFloat(sc.nextLine());
                System.out.println("Digite o Cargo:");
                String novoCargo = sc.nextLine();
                System.out.println("Digite as Horas Trabalhadas:");
                int novasHorasTrabalhadas = Integer.parseInt(sc.nextLine());

                Funcionario funcionarioAtualizado = new Funcionario(null, novoCargo, nome, novoSalario, cpfParaAtualizar, novasHorasTrabalhadas);
                controller.atualizar(cpfParaAtualizar, funcionarioAtualizado);
                break;
            case 3:
                System.out.println("Digite o CPF do Funcionário a ser deletado:");
                String cpfParaDeletar = sc.nextLine();
                controller.deletar(cpfParaDeletar);
                break;
            case 4:
                controller.listar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void gerenciarClientes(Scanner sc, ControlarCliente controller) {
        System.out.println("1. Adicionar Cliente");
        System.out.println("2. Atualizar Cliente");
        System.out.println("3. Deletar Cliente");
        System.out.println("4. Listar Clientes");

        int opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Digite o ID:");
                Long id = Long.parseLong(sc.nextLine());
                System.out.println("Digite o Nome:");
                String nome = sc.nextLine();
                System.out.println("Digite o Endereço:");
                String endereco = sc.nextLine();
                System.out.println("Digite o Contato:");
                String contato = sc.nextLine();
                System.out.println("Digite o CPF:");
                String cpf = sc.nextLine();

                Cliente cliente = new Cliente(id, nome, endereco, contato, cpf);
                controller.adicionar(cliente);
                break;
            case 2:
                System.out.println("Digite o CPF do Cliente a ser atualizado:");
                String cpfParaAtualizar = sc.nextLine();

                System.out.println("Digite o Endereço:");
                String novoEndereco = sc.nextLine();
                System.out.println("Digite o Contato:");
                String novoContato = sc.nextLine();

                Cliente clienteAtualizado = new Cliente(null, null, novoEndereco, novoContato, cpfParaAtualizar);
                controller.atualizar(cpfParaAtualizar, clienteAtualizado);
                break;
            case 3:
                System.out.println("Digite o CPF do Cliente a ser deletado:");
                String cpfParaDeletar = sc.nextLine();
                controller.deletar(cpfParaDeletar);
                break;
            case 4:
                controller.listar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void gerenciarFornecedores(Scanner sc, ControlarFornecedor controller) {
        System.out.println("1. Adicionar Fornecedor");
        System.out.println("2. Atualizar Fornecedor");
        System.out.println("3. Deletar Fornecedor");
        System.out.println("4. Listar Fornecedores");

        int opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Digite o ID:");
                Long id = Long.parseLong(sc.nextLine());
                System.out.println("Digite o Nome:");
                String nome = sc.nextLine();
                System.out.println("Digite o Contato:");
                String contato = sc.nextLine();
                System.out.println("Digite o CNPJ:");
                String cnpj = sc.nextLine();
                System.out.println("Digite a quantidade de produtos fornecidos:");
                int quantidade = Integer.parseInt(sc.nextLine());

                List<Produto> produtosFornecidos = new ArrayList<>();
                for (int i = 0; i < quantidade; i++) {
                    System.out.println("Digite o ID do Produto:");
                    Long produtoId = Long.parseLong(sc.nextLine());
                    System.out.println("Digite o Código de Barra:");
                    String codigoDeBarra = sc.nextLine();
                    System.out.println("Digite o Nome do Produto:");
                    String nomeProduto = sc.nextLine();
                    System.out.println("Digite o Preço do Produto:");
                    float preco = Float.parseFloat(sc.nextLine());
                    System.out.println("Digite a Categoria do Produto:");
                    String categoria = sc.nextLine();
                    System.out.println("Digite a Quantidade do Produto:");
                    int quantidadeProduto = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite a Marca do Produto:");
                    String marca = sc.nextLine();

                    Produto produto = new Produto(produtoId, codigoDeBarra, nomeProduto, preco, categoria, quantidadeProduto, marca);
                    produtosFornecidos.add(produto);
                }

                Fornecedor fornecedor = new Fornecedor(id, nome, produtosFornecidos, cnpj, contato);
                controller.adicionar(fornecedor);
                break;
            case 2:
                System.out.println("Digite o CNPJ do Fornecedor a ser atualizado:");
                String cnpjParaAtualizar = sc.nextLine();

                System.out.println("Digite o Contato:");
                String novoContato = sc.nextLine();

                Fornecedor fornecedorAtualizado = new Fornecedor(null, null, novoContato, cnpjParaAtualizar, null);
                controller.atualizar(cnpjParaAtualizar, fornecedorAtualizado);
                break;
            case 3:
                System.out.println("Digite o CNPJ do Fornecedor a ser deletado:");
                String cnpjParaDeletar = sc.nextLine();
                controller.deletar(cnpjParaDeletar);
                break;
            case 4:
                controller.listar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void gerenciarNotasFiscais(Scanner sc, ControlarNotaFiscal controller) {
        System.out.println("1. Adicionar Nota Fiscal");
        System.out.println("2. Atualizar Nota Fiscal");
        System.out.println("3. Deletar Nota Fiscal");
        System.out.println("4. Listar Notas Fiscais");

        int opcao = Integer.parseInt(sc.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Digite o ID:");
                Long id = Long.parseLong(sc.nextLine());
                System.out.println("Digite a data:");
                String data = sc.nextLine();
                System.out.println("Digite a descrição:");
                String descricao = sc.nextLine();
                System.out.println("Digite o valor total:");
                float valorTotal = Float.parseFloat(sc.nextLine());

                NotaFiscal notaFiscal = new NotaFiscal(id, data, descricao, valorTotal, null);
                controller.adicionar(notaFiscal);
                break;
            case 2:
                System.out.println("Digite o ID da Nota Fiscal a ser atualizada:");
                Long idParaAtualizar = Long.parseLong(sc.nextLine());

                System.out.println("Digite a nova descrição:");
                String novaDescricao = sc.nextLine();
                System.out.println("Digite o novo valor total:");
                float novoValorTotal = Float.parseFloat(sc.nextLine());

                NotaFiscal notaFiscalAtualizada = new NotaFiscal(idParaAtualizar, null, novaDescricao, novoValorTotal, null);
                controller.atualizar(idParaAtualizar, notaFiscalAtualizada);
                break;
            case 3:
                System.out.println("Digite o ID da Nota Fiscal a ser deletada:");
                Long idParaDeletar = Long.parseLong(sc.nextLine());
                controller.deletar(idParaDeletar);
                break;
            case 4:
                controller.listar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
	}
