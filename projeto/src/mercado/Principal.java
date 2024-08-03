package mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ControlarProduto controlarProduto = new ControlarProduto();
        ControlarFuncionario controlarFuncionario = new ControlarFuncionario();
        ControlarCliente controlarCliente = new ControlarCliente();
        ControlarFornecedor controlarFornecedor = new ControlarFornecedor();
        ControlarNotaFiscal controlarNotaFiscal = new ControlarNotaFiscal();
        ControlarCarrinho controlarCarrinho = new ControlarCarrinho();

        while (true) {
            System.out.println("1. Gerenciar Produtos");
            System.out.println("2. Gerenciar Funcionários");
            System.out.println("3. Gerenciar Clientes");
            System.out.println("4. Gerenciar Fornecedores");
            System.out.println("5. Gerenciar Notas Fiscais");
            System.out.println("6. Gerenciar Carrinho de Compra");
            System.out.println("7. Sair");

            int opcao = lerEntradaValidaInt(sc, "Escolha uma opção:");

            if (opcao == 7) {
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
                    gerenciarFornecedores(sc, controlarFornecedor, controlarProduto);
                    break;
                case 5:
                    gerenciarNotasFiscais(sc, controlarNotaFiscal);
                    break;
                case 6:
                    gerenciarCarrinho(sc, controlarCarrinho, controlarProduto);
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

        int opcao = lerEntradaValidaInt(sc, "Escolha uma opção: ");
        switch (opcao) {
            case 1:
                adicionarProduto(sc, controller);
                controller.listar(); 
                break;
            case 2:
                atualizarProduto(sc, controller);
                controller.listar(); 
                break;
            case 3:
                deletarProduto(sc, controller);
                controller.listar(); 
                break;
            case 4:
                controller.listar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
    	
        }
    }
    private static void adicionarProduto(Scanner sc, ControlarProduto controller) {
        String codigoDeBarra = lerEntradaValida(sc, "Digite o Código de Barra:", "\\d+");
        String nome = lerEntradaValida(sc, "Digite o Nome:");
        float preco = lerEntradaValidaFloat(sc, "Digite o Preço:");
        String categoria = lerEntradaValidaCategoria(sc, "Digite a Categoria:");
        int quantidade = lerEntradaValidaInt(sc, "Digite a Quantidade:");
        String marca = lerEntradaValida(sc, "Digite a Marca:");

        Produto produto = new Produto(null, codigoDeBarra, nome, preco, categoria, quantidade, marca);
        controller.adicionar(produto);
    }

    private static void atualizarProduto(Scanner sc, ControlarProduto controller) {
        String nomeParaAtualizar = lerEntradaValida(sc, "Digite o nome do Produto a ser atualizado:");
        float novoPreco = lerEntradaValidaFloat(sc, "Digite o Preço:");
        String novaCategoria = lerEntradaValida(sc, "Digite a Categoria:");
        int novaQuantidade = lerEntradaValidaInt(sc, "Digite a Quantidade:");
        String novaMarca = lerEntradaValida(sc, "Digite a Marca:");

        Produto produtoAtualizado = new Produto(null, null, nomeParaAtualizar, novoPreco, novaCategoria, novaQuantidade, novaMarca);
        controller.atualizar(nomeParaAtualizar, produtoAtualizado);
    }
    private static void deletarProduto(Scanner sc, ControlarProduto controller) {
        String idParaDeletar = lerEntradaValida(sc, "Digite o ID do Produto a ser deletado:");
        controller.deletar(idParaDeletar);
    }

    private static void gerenciarFuncionarios(Scanner sc, ControlarFuncionario controller) {
        System.out.println("1. Adicionar Funcionário");
        System.out.println("2. Atualizar Funcionário");
        System.out.println("3. Deletar Funcionário");
        System.out.println("4. Listar Funcionários");

        int opcao = lerEntradaValidaInt(sc, "Escolha uma opção:");

        switch (opcao) {
            case 1:
                adicionarFuncionario(sc, controller);
                controller.listar(); 
                break;
            case 2:
                atualizarFuncionario(sc, controller);
                controller.listar(); 
                break;
            case 3:
                deletarFuncionario(sc, controller);
                controller.listar(); 
                break;
            case 4:
                controller.listar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void adicionarFuncionario(Scanner sc, ControlarFuncionario controller) {
        String nome = lerEntradaValida(sc, "Digite o Nome:");
        String cargo = lerEntradaValida(sc, "Digite o Cargo:");
        float salario = lerEntradaValidaFloat(sc, "Digite o Salário:");
        String cpf = lerEntradaValidaCpf(sc, "Digite o CPF:");
        int horasTrabalhadas = lerEntradaValidaInt(sc, "Digite as Horas Trabalhadas:");

        Funcionario funcionario = new Funcionario(null, nome, cargo, salario, cpf, horasTrabalhadas);
        controller.adicionar(funcionario);
    }

    private static void atualizarFuncionario(Scanner sc, ControlarFuncionario controller) {
        String idParaAtualizar = lerEntradaValida(sc, "Digite o ID do Funcionário a ser atualizado:");
        String novoNome = lerEntradaValida(sc, "Digite o Nome completo:");
        float novoSalario = lerEntradaValidaFloat(sc, "Digite o Salário:");
        String novoCargo = lerEntradaValida(sc, "Digite o Cargo:");
        int novasHorasTrabalhadas = lerEntradaValidaInt(sc, "Digite as Horas Trabalhadas:");

        Funcionario funcionarioAtualizado = new Funcionario(idParaAtualizar, novoNome, novoCargo, novoSalario, idParaAtualizar, novasHorasTrabalhadas);
        controller.atualizar(idParaAtualizar, funcionarioAtualizado);
    }

    private static void deletarFuncionario(Scanner sc, ControlarFuncionario controller) {
        String idParaDeletar = lerEntradaValida(sc, "Digite o ID do Funcionário a ser deletado:");
        controller.deletar(idParaDeletar);
    }

    private static void gerenciarClientes(Scanner sc, ControlarCliente controller) {
        System.out.println("1. Adicionar Cliente");
        System.out.println("2. Atualizar Cliente");
        System.out.println("3. Deletar Cliente");
        System.out.println("4. Listar Clientes");

        int opcao = lerEntradaValidaInt(sc, "Escolha uma opção:");

        switch (opcao) {
            case 1:
                adicionarCliente(sc, controller);
                controller.listar(); 
                break;
            case 2:
                atualizarCliente(sc, controller);
                controller.listar(); 
                break;
            case 3:
                deletarCliente(sc, controller);
                controller.listar(); 
                break;
            case 4:
                controller.listar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void adicionarCliente(Scanner sc, ControlarCliente controller) {
        String nome = lerEntradaValida(sc, "Digite o Nome:");
        String endereco = lerEntradaValida(sc, "Digite o Endereço:");
        String contato = lerEntradaValida(sc, "Digite o Contato:", "\\d{11}");
        String cpf = lerEntradaValida(sc, "Digite o CPF:", "\\d{11}");

        Cliente cliente = new Cliente(null, nome, endereco, contato, cpf);
        controller.adicionar(cliente);
    }

    private static void atualizarCliente(Scanner sc, ControlarCliente controller) {
        String cpfParaAtualizar = lerEntradaValida(sc, "Digite o CPF do Cliente a ser atualizado:", "\\d{11}");
        String nomeNovo = lerEntradaValidaNome(sc, "Digite o Nome:");
        String novoEndereco = lerEntradaValida(sc, "Digite o Endereço:");
        String novoContato = lerEntradaValida(sc, "Digite o Contato:");

        Cliente clienteAtualizado = new Cliente(null, nomeNovo, novoEndereco, novoContato, cpfParaAtualizar);
        controller.atualizar(cpfParaAtualizar, clienteAtualizado);
    }

    private static void deletarCliente(Scanner sc, ControlarCliente controller) {
        String idParaDeletar = lerEntradaValidaCpf(sc, "Digite o CPF do Cliente a ser deletado: ");
        controller.deletar(idParaDeletar);
    }

    private static void gerenciarFornecedores(Scanner sc, ControlarFornecedor controller, ControlarProduto controllerProduto) {
        System.out.println("1. Adicionar Fornecedor");
        System.out.println("2. Atualizar Fornecedor");
        System.out.println("3. Deletar Fornecedor");
        System.out.println("4. Listar Fornecedores");

        int opcao = lerEntradaValidaInt(sc, "Escolha uma opção:");

        switch (opcao) {
            case 1:
                adicionarFornecedor(sc, controller);
                controller.listar(); 
                break;
            case 2:
                atualizarFornecedor(sc, controller, controllerProduto);
                controller.listar(); 
                break;
            case 3:
                deletarFornecedor(sc, controller);
                controller.listar(); 
                break;
            case 4:
                controller.listar();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void adicionarFornecedor(Scanner sc, ControlarFornecedor controller) {
        String nome = lerEntradaValidaNome(sc, "Digite o Nome:");
        List<Produto> produtosFornecidos = new ArrayList<>(); 
        String contatoNovo = lerEntradaValida(sc, "Digite o Contato:");
        String cnpj = lerEntradaValida(sc, "Digite o CNPJ:", "\\d{14}");

        Fornecedor fornecedor = new Fornecedor(null, nome, produtosFornecidos, contatoNovo, cnpj);
        controller.adicionar(fornecedor);
    }
    
    private static void atualizarFornecedor(Scanner sc, ControlarFornecedor controladorFornecedor, ControlarProduto controllerProduto) {
        
        String id = lerEntradaValida(sc, "Digite o ID do Fornecedor:");
        
        Fornecedor fornecedorExistente = controladorFornecedor.buscarFornecedorPorId(id);
        
        if (fornecedorExistente != null) {
            String novoNome = lerEntradaValidaNome(sc, "Digite o novo Nome:");
            String novoCNPJ = lerEntradaValida(sc, "Digite o novo CNPJ:", "\\d{14}");
            String novoContato = lerEntradaValida(sc, "Digite o novo Contato:");
            
            List<Produto> novosProdutos = new ArrayList<>();
            String adicionarMaisProdutos = "S";
            
            while (adicionarMaisProdutos.equalsIgnoreCase("S")) {
                String idProduto = lerEntradaValida(sc, "Digite o ID do Produto:");
                Produto produto = controllerProduto.buscar(idProduto);
                
                if (produto != null) {
                    novosProdutos.add(produto);
                } else {
                    System.out.println("Produto não encontrado.");
                }
                
                adicionarMaisProdutos = lerEntradaValida(sc, "Deseja adicionar mais produtos? (S/N):");
            }
            
            Fornecedor fornecedorAtualizado = new Fornecedor(id, novoNome, novosProdutos, novoContato, novoCNPJ);
            controladorFornecedor.atualizar(id, fornecedorAtualizado);
            
            System.out.println("Fornecedor atualizado com sucesso.");
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }
    private static void deletarFornecedor(Scanner sc, ControlarFornecedor controller) {
        String cnpjParaDeletar = lerEntradaValida(sc, "Digite o CNPJ do Fornecedor a ser deletado:", "\\d{14}");
        controller.deletar(cnpjParaDeletar);
    }
 
    
    private static void gerenciarNotasFiscais(Scanner sc, ControlarNotaFiscal controller) {
        System.out.println("1. Adicionar Nota Fiscal");
        System.out.println("2. Listar Notas Fiscais");

        int opcao = lerEntradaValidaInt(sc, "Escolha uma opção:");

        switch (opcao) {
            case 1:
                adicionarNotaFiscal(sc, controller);
                controller.listar(); 
                break;
            case 2:
                listarNotaFiscal(controller);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void adicionarNotaFiscal(Scanner sc, ControlarNotaFiscal controller) {
        String numeroDaConta = lerEntradaValida(sc, "Digite o Número da conta:");
        String data = lerEntradaValida(sc, "Digite a Data da Nota (dd/mm/yyyy):");
        float valor = lerEntradaValidaFloat(sc, "Digite o valor:");
        String fornecedorCpf = lerEntradaValida(sc, "Digite o CPF do Fornecedor:", "\\d{11}");
        String detalhes = lerEntradaValida(sc, "Digite os Detalhes da Nota:");

        NotaFiscal notaFiscal = new NotaFiscal(null, numeroDaConta, data, valor, fornecedorCpf, detalhes);
        controller.adicionar(notaFiscal);
    }
    
    private static void listarNotaFiscal(ControlarNotaFiscal controller) {
        controller.listar();
    }

    private static void gerenciarCarrinho(Scanner sc, ControlarCarrinho controlarCarrinho, ControlarProduto controlarProduto) {
        System.out.println("1. Adicionar Produto ao Carrinho");
        System.out.println("2. Remover Produto do Carrinho");
        System.out.println("3. Listar Produtos no Carrinho");
        System.out.println("4. Finalizar Compra");
        System.out.println("5. Definir Forma de Pagamento"); // Adicionando a opção para definir a forma de pagamento

        int opcao = lerEntradaValidaInt(sc, "Escolha uma opção:");

        switch (opcao) {
            case 1:
                adicionarProdutoAoCarrinho(sc, controlarCarrinho, controlarProduto);
                controlarCarrinho.listar();
                break;
            case 2:
                removerProdutoDoCarrinho(sc, controlarCarrinho);
                controlarCarrinho.listar();
                break;
            case 3:
                controlarCarrinho.listar();
                break;
            case 4:
                finalizarCompra(sc, controlarCarrinho);
                break;
            case 5:
                definirFormaDePagamento(sc, controlarCarrinho);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    private static void adicionarProdutoAoCarrinho(Scanner sc, ControlarCarrinho controlarCarrinho, ControlarProduto controlarProduto) {
        String nome = lerEntradaValidaNome(sc, "Digite o Nome do Produto:");
        int quantidade = lerEntradaValidaInt(sc, "Digite a Quantidade:");

        Produto produto = controlarProduto.buscar(nome);
        if (produto != null) {
            controlarCarrinho.adicionar(produto, quantidade);
            System.out.println("Produto adicionado ao carrinho.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void removerProdutoDoCarrinho(Scanner sc, ControlarCarrinho controlarCarrinho) {
        String nome = lerEntradaValidaNome(sc, "Digite o Nome do Produto:");
        int quantidade = lerEntradaValidaInt(sc, "Digite a Quantidade para Remover:");
        controlarCarrinho.remover(nome, quantidade);
        System.out.println("Produto removido do carrinho.");
    }
    private static void definirFormaDePagamento(Scanner sc, ControlarCarrinho controlarCarrinho) {
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Cartão de Crédito");
        System.out.println("2. Pix");

        int opcao = lerEntradaValidaInt(sc, "Escolha uma opção:");
        FormaDePagamento formaDePagamento;
        switch (opcao) {
            case 1:
                String numeroCartao = lerEntradaValida(sc, "Digite o número do cartão:", "\\d{12}");
                String validade = lerEntradaValida(sc, "Digite a validade do cartão:", "\\d{4}");
                String cvv = lerEntradaValida(sc, "Digite o CVV:", "\\d{3}");
                String nomeTitular = lerEntradaValida(sc, "Digite o nome do titular:");
                formaDePagamento = new PagamentoCartao(numeroCartao, validade, cvv, nomeTitular);
                break;
            case 2:
                String chavePix = gerarChavePix();
                System.out.println("Chave Pix gerada: " + chavePix);
                formaDePagamento = new PagamentoPix(chavePix);
                break;
            default:
                System.out.println("Forma de pagamento inválida.");
                return;
        }
    }
   
    private static void finalizarCompra(Scanner sc, ControlarCarrinho controlarCarrinho) {
        FormaDePagamento formaDePagamento = controlarCarrinho.getFormaDePagamento();

        if (formaDePagamento == null) {
            System.out.println("Forma de pagamento não definida. Defina uma forma de pagamento antes de finalizar a compra.");
            return; // Não finaliza a compra se a forma de pagamento não for definida
        }

        if (formaDePagamento instanceof PagamentoPix) {
            System.out.println("Deseja confirmar o pagamento via Pix? (sim/não)");
            String confirmacao = sc.nextLine().trim();
            if (confirmacao.equalsIgnoreCase("sim")) {
                System.out.println("Pagamento via Pix confirmado.");
                controlarCarrinho.listar();
                System.out.println("Total: R$ " + controlarCarrinho.calcularTotal());
                controlarCarrinho.finalizarCompra();
            } else {
                System.out.println("Pagamento via Pix não realizado. Escolha outra forma de pagamento.");
                definirFormaDePagamento(sc, controlarCarrinho);
            }
        } else {
            controlarCarrinho.finalizarCompra();
            System.out.println("Compra finalizada.");
        }
    }
    private static String gerarChavePix() {
        Random random = new Random();
        StringBuilder chavePix = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            chavePix.append(random.nextInt(10));
        }
        return chavePix.toString();
    }

   
    private static String lerEntradaValida(Scanner sc, String mensagem) {
        String entrada;
        do {
            System.out.println(mensagem);
            entrada = sc.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Entrada não pode ser vazia. Tente novamente.");
            }
        } while (entrada.isEmpty());
        return entrada;
    }

    // Método para ler uma entrada float não vazia e válida
    private static float lerEntradaValidaFloat(Scanner sc, String mensagem) {
        float numero;
        while (true) {
            System.out.println(mensagem);
            String entrada = sc.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Entrada não pode ser vazia. Tente novamente.");
                continue;
            }
            try {
                numero = Float.parseFloat(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número decimal.");
            }
        }
        return numero;
    }

    // Método para ler uma entrada int vazia e válida
    private static int lerEntradaValidaInt(Scanner sc, String mensagem) {
        int numero;
        while (true) {
            System.out.println(mensagem);
            String entrada = sc.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Entrada não pode ser vazia. Tente novamente.");
                continue;
            }
            try {
                numero = Integer.parseInt(entrada);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
            }
        }
        return numero;
    }

    // Método para ler uma entrada não vazia e válida com regex
    private static String lerEntradaValida(Scanner sc, String mensagem, String regex) {
        String entrada;
        do {
            System.out.println(mensagem);
            entrada = sc.nextLine().trim();
            if (entrada.isEmpty()) {
                System.out.println("Entrada não pode ser vazia. Tente novamente.");
            } else if (!entrada.matches(regex)) {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        } while (entrada.isEmpty() || !entrada.matches(regex));
        return entrada;
    }

    // Método específico para ler CPF não vazio e válido
    private static String lerEntradaValidaCpf(Scanner sc, String mensagem) {
        return lerEntradaValida(sc, mensagem, "\\d{11}");
    }

    // Método específico para ler categoria com validação
    private static String lerEntradaValidaCategoria(Scanner sc, String mensagem) {
        // Regex para garantir que a categoria contenha letras e números, mas não apenas letras ou apenas números
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z\\d]+$";
        return lerEntradaValida(sc, mensagem, regex);
    }

    // Método específico para ler nome apenas com letras e espaços
    private static String lerEntradaValidaNome(Scanner sc, String mensagem) {
        // Regex para garantir que o nome contenha apenas letras e espaços
        String regex = "^[a-zA-Z ]+$";
        return lerEntradaValida(sc, mensagem, regex);
    }
}