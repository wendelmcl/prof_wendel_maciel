package q2;

import java.util.ArrayList;

public class AddVeiculos{
 ArrayList<Carro> carros = new ArrayList<Carro>();
 
 public void adicionar(Carro c1){
	 	carros.add(c1);
		System.out.println("Veiculo adicionado com sucesso");
 	}
 ArrayList<Motocicleta> motos = new ArrayList<Motocicleta>();
 
 public void adicionar(Motocicleta m1){
	 	motos.add(m1);
		System.out.println("Veiculo adicionado com sucesso");
 	}
 ArrayList<Caminhao> caminhao = new ArrayList<Caminhao>();
 
 public void adicionar(Caminhao n1){
	 caminhao.add(n1);
		System.out.println("Veiculo adicionado com sucesso");
 	}
 public void imprimircarros(){
		for(int i = 0; i < carros.size(); i++){
			System.out.println(carros.get(i).getNome()+ " esta acelerando");
			System.out.println(carros.get(i).getNome()+ " esta freando");
			System.out.println(carros.get(i).getNome()+ " esta fazendo barulho");
		}
	}
 public void imprimircaminhoes(){
		for(int i = 0; i < caminhao.size(); i++){
		System.out.println(caminhao.get(i).getNome()+ " esta acelerando");
		System.out.println(caminhao.get(i).getNome()+ " esta freando");
		System.out.println(caminhao.get(i).getNome()+ " esta fazendo barulho");
		}
	}
 public void imprimirmotos(){
		for(int i = 0; i < motos.size(); i++){
			System.out.println(motos.get(i).getNome()+ " esta acelerando");
			System.out.println(motos.get(i).getNome()+ " esta freando");
			System.out.println(motos.get(i).getNome()+ " esta fazendo barulho");
		}
	}
}
