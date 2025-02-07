void main() {
  print("Olá mundo!!!");
  int inteiro = 10;
  double flutuante = 1.6;
  String palavra = "Sistemas";
  bool opcao = true;
  print(inteiro.runtimeType);
  print(flutuante.runtimeType);
  print(palavra.runtimeType);
  print(opcao.runtimeType);
  var variavel = "Alô";
  print(variavel.runtimeType);
  dynamic teste = 8;
  print(teste.runtimeType);
  teste = "mensagem";
  print(teste.runtimeType);
}
