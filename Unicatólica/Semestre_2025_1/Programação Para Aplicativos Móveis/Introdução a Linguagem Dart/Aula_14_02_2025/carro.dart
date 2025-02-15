import 'dart:io';

class Carro {
  String modelo = "";
  String cor = "";
  double velocidade = 0.0;

  Carro(String modelo, String cor, double velocidade) {
    this.modelo = modelo;
    this.cor = cor;
    this.velocidade = velocidade;
  }
  void acelerar(double incremento) {
    velocidade = velocidade + incremento;
    print("Velocidade: ${velocidade} km/h");
  }

  void frear(double decremento) {
    velocidade = velocidade - decremento;
    if (velocidade < 0) {
      velocidade = 0;
    }
    print("Velocidade: ${velocidade} km/h");
  }

  void exibirCarro(String modelo, String cor, double velocidade) {
    print("Modelo: ${modelo} // Cor: ${cor} // Velocidade: ${velocidade}");
  }
}

void main() {
  Carro c1 = new Carro("", "", 0.0);
  stdout.write("Modelo: ");
  c1.modelo = stdin.readLineSync().toString();
  stdout.write("Cor: ");
  c1.cor = stdin.readLineSync().toString();
  stdout.write("Velocidade: ");
  c1.velocidade = double.parse(stdin.readLineSync().toString());
  c1.acelerar(50.0);
  c1.frear(20);
  c1.exibirCarro(c1.modelo, c1.cor, c1.velocidade);
}
