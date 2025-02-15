class Produto {
  String nome = "";
  double preco = 0.0;

  Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }
  exibirProduto(String nome, double preco) {
    print("Produto: ${nome} // Preço: R\$ ${preco}");
  }
}

void main() {
  var p1 = new Produto('Lápis', 4.99);
  var p2 = new Produto('Geladeira', 1454.99);
  p1.exibirProduto(p1.nome, p1.preco);
  p2.exibirProduto(p2.nome, p2.preco);
}
