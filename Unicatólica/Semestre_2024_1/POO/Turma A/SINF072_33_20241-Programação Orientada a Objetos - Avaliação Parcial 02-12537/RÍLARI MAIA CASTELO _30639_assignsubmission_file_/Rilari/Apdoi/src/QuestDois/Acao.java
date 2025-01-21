package QuestDois;

import java.util.Scanner;

public class Acao {
	public static void main(String args[]){
		Scanner Scanner = new Scanner(System.in);
Livro Livro = new Livro();
Dvd Dvd = new Dvd();
Livro.Consultar();
Livro.Emprestar();
Livro.devolver();
Dvd.status();

Dvd.Consultar();
Dvd.Emprestar();
Dvd.devolver();
Dvd.status();
	}
}
