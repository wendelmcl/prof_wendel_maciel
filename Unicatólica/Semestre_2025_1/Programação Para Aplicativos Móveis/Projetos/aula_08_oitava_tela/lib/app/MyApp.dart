import 'package:flutter/material.dart';
import 'package:apresentacao/apresentacao/MyHomePage.dart';

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Minha Apresentação',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        fontFamily: 'RobotoMono',
      ),
      home: MyHomePage(),
    );
  }
}
