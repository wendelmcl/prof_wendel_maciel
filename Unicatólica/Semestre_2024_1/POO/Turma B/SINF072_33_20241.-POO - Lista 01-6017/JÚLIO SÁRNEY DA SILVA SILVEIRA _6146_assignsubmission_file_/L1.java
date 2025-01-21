package lista1;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;


public class lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Questão 1
		Scanner sc = new Scanner(System.in);
		double raio = 0;
		System.out.println("Digite o raio do circulo: ");
		raio = sc.nextDouble();
		double area = raio * 3.1416;
		System.out.println("Area do circulo é " + area);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		//Questão 2
		int areaQ = 0;
		System.out.println("Qual a area do quadrado: ");
		areaQ = sc.nextInt();
		int DobroAreaQ = areaQ * 2;
		System.out.println("O dobro da area do quadrado sera " + DobroAreaQ);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		//Questão 3
		
		int GanhoH = 0;
		int numeroH = 0;
		System.out.println("Quanto você ganha por hora: ");
		GanhoH = sc.nextInt();
		System.out.println("Quantas horas você trabalha por mês: ");
		numeroH = sc.nextInt();
		int GanhoMês = GanhoH * numeroH;
		System.out.println("Você ira receber no mês " + GanhoMês);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		//Questão 4
		
		double fahre = 0.0;
		System.out.println("Insira a temperatura em fahrenheit");
		fahre = sc.nextDouble();
		double celsius = 5 * ((fahre - 32 ) / 9);
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(3);
		System.out.println("A temperatura em celsius sera: " + df.format(celsius));
		
		//Questão 5
		double Celsi = 0.0;
		System.out.println("Digite a temperatura em Celsius:");
		Celsi = sc.nextDouble();
		double fahreC = (Celsi * 1.8) + 32;
		df.setMaximumFractionDigits(3);
		System.out.println("A temperatura em fahrenheit: " + df.format(fahreC));
		
		
		
		
		//Questão 6
		
		double Pnumero = 0;
		double Snumero = 0;
		double Tnumero = 0;
		System.out.println("Digite o primeiro numero: ");
		Pnumero = sc.nextDouble();
		System.out.println("Digite o segundo numero: ");
		Snumero = sc.nextDouble();
		System.out.println("Digite o terceiro numero: ");
		Tnumero = sc.nextDouble();
		Double maior = Pnumero;
		
		if(Snumero > maior) {
			maior = Snumero;
		}if(Tnumero > maior) {
			maior = Tnumero;
		}
		System.out.println("O maior numero é: " + maior);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		//Questão 7

		int Pnumero2 = 0;
		int Snumero2 = 0;
		int Tnumero2 = 0;
		System.out.println("Digite 3 numeros: ");
		Pnumero2 = sc.nextInt();
		Snumero2 = sc.nextInt();
		Tnumero2 = sc.nextInt();
		
		int menor;
		int maior2;
		
		maior2 = Math.max(Snumero2,Math.max(Tnumero2,Pnumero2));
		menor = Math.min(Snumero2,Math.min(Tnumero2,Pnumero2));
		System.out.println("Maior: " + maior2 + " Menor: " + menor);
		
		//Questão 8
		System.out.println("Digite o valor do primeiro produto: ");
		int produto1 = sc.nextInt();
		System.out.println("Digite o valor do segundo produto: ");
		int produto2 = sc.nextInt();
		System.out.println("Digite o valor do terceiro produto: ");
		int produto3 = sc.nextInt();
		
		int MaisBarato = Math.min(Math.min(produto1, produto2), produto3);
		if (MaisBarato == produto1) {
			System.out.println("O produto 1 é o mais barato");
		}else if(MaisBarato == produto2) {
			System.out.println("O produto 2 é o mais barato");
		}else if (MaisBarato == produto3) {
			System.out.println("O produto 3 é o mais barato");
		}
		
		//Questão 9
		
		System.out.println("Insira 3 numeros: ");
		int P1numero = sc.nextInt();
		int S2numero = sc.nextInt();
		int T3numero = sc.nextInt();
		int Mmenor = Math.min(Math.min(P1numero, S2numero), T3numero);
		int Mmaior = Math.max(Math.max(P1numero, S2numero),T3numero);
		int meio = 0;
		boolean iguais = false;
		
		if (Mmaior != P1numero && Mmenor != P1numero) {
			meio = P1numero;
		}else if (Mmaior != S2numero && Mmenor != S2numero) {
			meio = S2numero;
		}else if (Mmaior != T3numero && Mmenor != T3numero) {
			meio = T3numero;
		}else {
			System.out.println("Numeros iguais: ");
			iguais = true;
		}
		
		if(iguais == false) {
			System.out.println("Primeiro: " + Mmaior + " ," + "segundo: " + meio + " ," + "terceiro: " + Mmenor);
		}
		
		//Questão 10
		Map<String, String> saudacao = new HashMap<>();
		saudacao.put("M", "Bom dia");
		saudacao.put("T", "Boa tarde");
		saudacao.put("N", "Boa noite");
		System.out.println("Qual turno você estuda: (M = matutino, T = vesperino e N = noturno)");
		String turno = sc.next().toUpperCase();
		String AgoraSaudacao = saudacao.containsKey(turno) ? saudacao.get(turno): "Valor invalido!!!";
		System.out.println(AgoraSaudacao);
	}

}
