package revisao03;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {
	ArrayList<Gerente> gerentes = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	public void adicionar(Gerente g1) {
		gerentes.add(g1);
		System.out.println("Gerente adicionado com sucesso.");
	}
	public boolean pesquisar(int id) {
		for(int i = 0; i < gerentes.size(); i++) {
			Gerente g1 = gerentes.get(i);
			if(g1.getId() == id) {
				System.out.println("Nome: "+g1.getNome());
				return true;
				}
			}System.out.println("Gerente não encontrado.");
			return false;
		}
	
	public void atualizar(int id) {
		for(int i =0 ;i < gerentes.size();i++) {
			Gerente g1 = gerentes.get(i);
			if(g1.getId() == id) {
				System.out.println("Nome: ");
				String nome = sc.next();
				g1.setNome(nome);
				System.out.println("CPF: ");
				String cpf = sc.next();
				g1.setCpf(cpf);
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
			System.out.println("CPF: "+gerentes.get(i).getCpf());
			System.out.println("Salário: "+gerentes.get(i).getSalario());
			System.out.println("\n");
		}
	}
}
