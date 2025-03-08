import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: PaginaInicial(),
    );
  }
}

class PaginaInicial extends StatelessWidget {
  const PaginaInicial({super.key});

  @override
  Widget build(BuildContext context) {
    return Center(
      child: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Stack(
            children: [
              Positioned(
                child: Container(
                  height: 300,
                  width: 300,
                  color: Colors.green,
                ),
              ),
              Positioned(
                top: 20,
                right: 20,
                left: 20,
                bottom: 20,
                child: Container(
                  height: 200,
                  width: 200,
                  color: Colors.yellow,
                ),
              ),
              Positioned(
                top: 40,
                right: 40,
                left: 40,
                bottom: 40,
                child: Container(
                  height: 100,
                  width: 100,
                  color: Colors.blue,
                ),
              ),
              Positioned(
                top: 60,
                right: 60,
                left: 60,
                bottom: 60,
                child: Container(
                  height: 50,
                  width: 50,
                  color: Colors.white,
                ),
              ),
            ],
          ),
        ],
      ),
    );
  }
}
