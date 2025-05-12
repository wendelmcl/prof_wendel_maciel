import 'package:flutter/material.dart';
import '../calculadora/calculadora_controller.dart';

class Calculadora_Simples extends StatefulWidget {
  Calculadora_Simples({super.key});

  @override
  State<Calculadora_Simples> createState() => _Calculadora_SimplesState();
}

final Calculadora_Controller controller = Calculadora_Controller();

class _Calculadora_SimplesState extends State<Calculadora_Simples> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.blue,
        leading: Container(
          child: Icon(
            Icons.calculate,
            color: Colors.white,
          ),
        ),
        title: Text(
          'Calculadora',
          style: TextStyle(fontSize: 24, color: Colors.white),
        ),
      ),
      body: Center(
        child: Padding(
          padding: const EdgeInsets.all(20.0),
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              TextFormField(
                controller: controller.valor1,
                textAlign: TextAlign.center,
                autofocus: true,
                keyboardType: TextInputType.number,
                decoration: InputDecoration(
                  hintText: 'Digite um valor: ',
                  enabledBorder: OutlineInputBorder(),
                ),
              ),
              SizedBox(
                height: 30.0,
              ),
              TextFormField(
                controller: controller.valor2,
                textAlign: TextAlign.center,
                keyboardType: TextInputType.number,
                decoration: InputDecoration(
                  hintText: 'Digite um valor: ',
                  enabledBorder: OutlineInputBorder(),
                ),
              ),
              SizedBox(
                height: 20.0,
              ),
              Text(
                'Soma: ${controller.soma.toStringAsFixed(2)}',
                style: TextStyle(fontSize: 16, color: Colors.black),
              ),
              Text(
                'Subtrair: ${controller.subtracao.toStringAsFixed(2)}',
                style: TextStyle(fontSize: 16, color: Colors.black),
              ),
              Text(
                'Multiplicar: ${controller.multiplicacao.toStringAsFixed(2)}',
                style: TextStyle(fontSize: 16, color: Colors.black),
              ),
              Text('Dividir: ${controller.divisao.toStringAsFixed(2)}',
                  style: TextStyle(fontSize: 16, color: Colors.black)),
            ],
          ),
        ),
      ),
      floatingActionButton: FloatingActionButton(
        backgroundColor: Colors.blue,
        onPressed: () {
          setState(
            () {
              controller.somar();
              controller.subtrair();
              controller.multiplicar();
              controller.dividir();
              controller.valor1.clear();
              controller.valor2.clear();
            },
          );
        },
        child: Icon(
          Icons.equalizer,
          color: Colors.white,
        ),
      ),
    );
  }
}
