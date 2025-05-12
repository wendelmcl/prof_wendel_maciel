import 'package:flutter/material.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  static const String _title = 'Flutter Imagens';
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: _title,
      theme: ThemeData(
        // useMaterial3: false,
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(),
    );
  }
}

class MyHomePage extends StatelessWidget {
  const MyHomePage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        leading: Container(
          child: Icon(
            Icons.image,
            color: Colors.white,
          ),
        ),
        title: Text(
          "Imagens",
          style: TextStyle(
              fontSize: 16, fontWeight: FontWeight.bold, color: Colors.white),
        ),
        backgroundColor: Colors.blue,
      ),
      body: Container(
        child: Column(
          children: [
            Text(
              "Imagem local: ",
              style: TextStyle(
                fontSize: 18,
                fontWeight: FontWeight.bold,
              ),
            ),
            Image.asset("assets/estudantes.jpg"),
            SizedBox(
              height: 30,
            ),
            Text(
              "Imagem da Internet: ",
              style: TextStyle(
                fontSize: 18,
                fontWeight: FontWeight.bold,
              ),
            ),
            Image.network(
              "https://img.freepik.com/vetores-gratis/grupo-de-estudantes-adolescentes-com-mochilas_107791-13292.jpg?t=st=1746196209~exp=1746199809~hmac=e315a0e0b1db5e7ef3cacd2e4d6ab904616688709f927697254ec5a0f52209dd&w=1800",
              loadingBuilder: (context, child, loadingProgress) {
                if (loadingProgress == null) {
                  return child;
                }
                return Center(
                  child: CircularProgressIndicator(),
                );
              },
              errorBuilder: (context, error, stackTrace) {
                return Center(
                  child: Column(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Icon(Icons.error, color: Colors.red, size: 50),
                      Text("Erro ao carregar a imagem"),
                    ],
                  ),
                );
              },
            ),
          ],
        ),
      ),
    );
  }
}
