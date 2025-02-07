void main() {
  print("Olá mundo!!!");
  int inteiro = 10;
  double flutuante = 1.6;
  String palavra = "Sistemas de Informação";
  bool opcao = true;
  print(inteiro.runtimeType);
  print(flutuante.runtimeType);
  print(palavra.runtimeType);
  print(opcao.runtimeType);
  var variavel = 10;
  print(variavel.runtimeType);
  dynamic variavel_dinamica = "Teste";
  print(variavel_dinamica.runtimeType);
  variavel_dinamica = 50;
  print(variavel_dinamica.runtimeType);
}
