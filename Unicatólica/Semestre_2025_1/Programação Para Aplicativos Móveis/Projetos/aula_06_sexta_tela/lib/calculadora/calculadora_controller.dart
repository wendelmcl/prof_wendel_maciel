import 'package:flutter/material.dart';

class Calculadora_Controller {
  TextEditingController valor1 = TextEditingController();
  TextEditingController valor2 = TextEditingController();
  double soma = 0.0, subtracao = 0.0, multiplicacao = 0.0, divisao = 0.0;

  double somar() {
    soma = double.parse(valor1.text) + double.parse(valor2.text);
    return soma;
  }

  double subtrair() {
    subtracao = double.parse(valor1.text) - double.parse(valor2.text);
    return subtracao;
  }

  double multiplicar() {
    multiplicacao = double.parse(valor1.text) * double.parse(valor2.text);
    return multiplicacao;
  }

  double dividir() {
    divisao = double.parse(valor1.text) / double.parse(valor2.text);
    return divisao;
  }
}
