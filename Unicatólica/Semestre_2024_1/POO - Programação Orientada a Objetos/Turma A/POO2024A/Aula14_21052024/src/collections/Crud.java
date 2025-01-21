package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crud {
	Scanner sc = new Scanner(System.in);
	List<Gerente> gerentes = new ArrayList<Gerente>();
	
	public void cadastrarGerente(Gerente g1) {
		gerentes.add(g1);
		System.out.println("Gerente cadastrado com sucesso.");
	}
	
	public boolean pesquisarGerente(int id) {
		for(int i = 0; i < gerentes.size(); i++) {
			Gerente g1 = gerentes.get(i);
			if(g1.getId() == id) {
				System.out.println("Gerente: " + g1.getNome());
				return true;
			}
		}System.out.println("Gerente não encontrado");
		return false;
	}
	
	public void atualizarGerente(int id) {
		for(int i = 0; i < gerentes.size(); i++) {
			Gerente g1 = gerentes.get(i);
			if(g1.getId() == id) {
				System.out.println("Nome: ");
				String nome = sc.next();
				g1.setNome(nome);
				System.out.println("Salário: ");
				double salario = sc.nextDouble();
				g1.setSalario(salario);
				System.out.println("Gerente atualizado");
			}
		}
	}
	
	public void deletarGerente(int id) {
		for(int i = 0; i < gerentes.size();i++ ) {
			Gerente g1 = gerentes.get(i);
			if(g1.getId() == id) {
				gerentes.remove(g1);
				System.out.println("Gerente deletado com sucesso");
			}
		}
	}
	
	public void imprimirInformacoes() {
		for(int i = 0; i < gerentes.size();i++) {
			System.out.println("ID: "+gerentes.get(i).getId());
			System.out.println("Nome: "+gerentes.get(i).getNome());
			System.out.println("Salário: "+gerentes.get(i).getSalario());
		}
	}
	
}
