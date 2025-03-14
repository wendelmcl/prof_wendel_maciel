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
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: Exemplo01(),
    );
  }
}

class Exemplo01 extends StatelessWidget {
  const Exemplo01({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.lightBlueAccent,
      appBar: AppBar(
        leading: Icon(
          Icons.add_task,
          color: Colors.white,
        ),
        backgroundColor: Colors.blue,
        title: Text(
          'Flutter: Primeiros Passos',
          style: TextStyle(fontSize: 24, color: Colors.white),
        ),
      ),
      body: Padding(
        padding: const EdgeInsets.fromLTRB(5, 20, 20, 10),
        child: Column(
          children: [
            Row(
              children: [
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.white,
                ),
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.pinkAccent,
                ),
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.lightBlue,
                ),
              ],
            ),
            SizedBox(
              height: 20,
            ),
            Row(
              children: [
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.red,
                ),
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.purple,
                ),
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.blue,
                ),
              ],
            ),
            SizedBox(
              height: 20,
            ),
            Row(
              children: [
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.pinkAccent,
                ),
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.yellow,
                ),
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.blueGrey
                ),
              ],
            ),
            SizedBox(
              height: 20,
            ),
            Row(
              children: [
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.purpleAccent,
                ),
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.white,
                ),
                Container(
                  height: 150,
                  width: 100,
                  color: Colors.green,
                ),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
