class Funcionario {
  String nome = "";
  String cargo = "";
  double salario = 0.0;

  Funcionario(String nome, String cargo, double salario) {
    this.nome = nome;
    this.cargo = cargo;
    this.salario = salario;
  }
  void exibirFuncionario(String nome, String cargo, double salario) {
    print("Nome: ${nome} // Cargo: ${cargo} // Salário: ${salario}");
  }
}

class Empresa {
  String nome = "";
  List<Funcionario> funcionarios = [];
  Empresa(String nome) {
    this.nome = nome;
  }
  void adicionarFuncionario(Funcionario f1) {
    funcionarios.add(f1);
    print("Funcionario: ${f1.nome} foi contratado(a)");
  }

  void listarFuncionarios() {
    print("Empresa: ${nome}");
    for (Funcionario f1 in funcionarios) {
      f1.exibirFuncionario(f1.nome, f1.cargo, f1.salario);
    }
  }
}

void main() {
  Empresa e1 = new Empresa("Tech");
  Funcionario f1 = Funcionario("Ana", "Gerente", 10000.00);
  e1.adicionarFuncionario(f1);
  e1.listarFuncionarios();
}
