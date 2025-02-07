import 'dart:io';

void main() {
  // Área da circuferência = PI * (raio*raio)
  const PI = 3.14;
  double raio = 0.0;
  stdout.write("Digite o valor do raio: ");
  raio = double.parse(stdin.readLineSync().toString());
  print("PI: $PI");
  print("Raio: $raio");
  var area = PI * (raio * raio);
  print("Área: $area");
}
