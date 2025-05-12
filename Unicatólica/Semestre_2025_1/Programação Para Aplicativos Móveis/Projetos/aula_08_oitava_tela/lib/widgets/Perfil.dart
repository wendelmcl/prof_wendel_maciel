import 'package:flutter/material.dart';

class Perfil extends StatelessWidget {
  const Perfil({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        ClipRRect(
          borderRadius: BorderRadius.circular(100),
          child: Image.asset(
            'assets/images/perfil.jpeg',
            width: 150,
            height: 150,
            fit: BoxFit.cover,
          ),
        ),
        SizedBox(
          height: 20,
        ),
        Text(
          'Wendel Maciel',
          style: TextStyle(
            fontSize: 28,
            color: Colors.black,
            fontFamily: 'RobotoMono',
          ),
        ),
        Text(
          'Curso: Sistemas de Informação',
          style: TextStyle(
              fontSize: 16, fontFamily: 'RobotoMono', color: Colors.black),
        ),
        Text(
          'Hobbie: Academia',
          style: TextStyle(
              fontSize: 14,
              fontFamily: 'RobotoMono',
              fontStyle: FontStyle.italic,
              color: Colors.black),
        ),
      ],
    );
  }
}
