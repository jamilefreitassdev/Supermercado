package mercado;

import java.io.Serializable;

public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;
		private String id;
	    private String nome;
	    private String cargo;
	    private float salario;
	    private String cpf;
	    private int horasTrabalhadas;
	    
		public Funcionario(String id, String nome, String cargo, float salario, String cpf, int horasTrabalhadas) {
			this.id = id;
			this.nome = nome;
			this.cargo = cargo;
			this.salario = salario;
			this.cpf = cpf;
			this.horasTrabalhadas = horasTrabalhadas;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCargo() {
			return cargo;
		}

		public void setCargo(String cargo) {
			this.cargo = cargo;
		}

		public float getSalario() {
			return salario;
		}

		public void setSalario(float salario) {
			this.salario = salario;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public int getHorasTrabalhadas() {
			return horasTrabalhadas;
		}

		public void setHorasTrabalhadas(int horasTrabalhadas) {
			this.horasTrabalhadas = horasTrabalhadas;
		}

		@Override
		public String toString() {
			return String.format("Funcionário:\n" +
                    "ID: %s\n" +
                    "Nome: %s\n" +
                    "Cargo: %s\n" +
                    "Salário: R$ %.2f\n" +
                    "CPF: %s\n" +
                    "Horas Trabalhadas: %d",
                    id,
                    nome,
                    cargo,
                    salario,
                    cpf,
                    horasTrabalhadas);
		}
}
		
