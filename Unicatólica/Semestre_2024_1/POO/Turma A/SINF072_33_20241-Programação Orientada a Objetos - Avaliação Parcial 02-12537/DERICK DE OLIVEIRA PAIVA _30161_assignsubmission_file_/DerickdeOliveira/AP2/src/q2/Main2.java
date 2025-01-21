package q2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Veiculo> corrida = new ArrayList<Veiculo>();
		
		System.out.println("Corrida");
		int i = 0;
		while(i < 10){
			System.out.println("Qual o veiculo?");
			System.out.println("1. Carro | 2. Motocicleta | 3. Caminhão");
			int opcao = sc.nextInt();
			
			switch(opcao){
			case 1:
				System.out.println("Qual a cor do carro? ");
				String cor = sc.next();
				corrida.add(new Carro(cor));
				i ++;
				break;
			case 2:
				System.out.println("Qual a cor do da motocicleta? ");
				String cor2 = sc.next();
				corrida.add(new Motocicleta(cor2));
				i++;
				break;
			case 3:
				System.out.println("Qual a cor do do caminhão? ");
				String cor3 = sc.next();
				corrida.add(new Caminhao(cor3));
				i++;
				break;
			default:
				System.out.println("Número Inválido.");
				return;
			
				
			
			}
		}
		
		for(Veiculo veiculo : corrida){
			veiculo.acelerar();
			veiculo.frear();
			veiculo.fazerBarulho();
			System.out.println("");
	
		}
		
		sc.close();

	}

}
